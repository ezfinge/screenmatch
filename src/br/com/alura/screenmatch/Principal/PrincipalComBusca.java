package Principal;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.SQLOutput;
import java.time.Duration;
import java.util.Optional;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);

        System.out.printf("qual o filme?");
        var busca = leitura.nextLine();

        String endereco = "http://www.omdbapi.com/?t="+busca.replace(" ", "+")+"&apikey=8b0601ee";

        //https://docs.oracle.com/en/java/javase/17/docs/api/java.net.http/java/net/http/HttpRequest.html
        //http request java doc
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                //fazendo requisição..
                .build();

        // http responde -java doc
        //https://docs.oracle.com/en/java/javase/17/docs/api/java.net.http/java/net/http/HttpResponse.html

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(response.body());

        Gson gson = new GsonBuilder() //tratando o case  sensitive
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();
        //https://github.com/google/gson/blob/main/UserGuide.md
        //desiarialização
        //Titulo t = gson.fromJson(json, Titulo.class);
        TituloOmdb tituloOmdb = gson.fromJson(json, TituloOmdb.class);
        System.out.println(tituloOmdb);
        try{
            Titulo t = new Titulo(tituloOmdb);
            System.out.println("titulo ja convertido..");
            System.out.println(t);
        } catch (NumberFormatException e) {
            System.out.println("Aconteceu um erro:");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("algum de argumento na busca, verifique a url.");
        } catch (ErroDeConversaoDeAnoException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("finalizou corretamente.");

    }//fim main
}//fim classe
