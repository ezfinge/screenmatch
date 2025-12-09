import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filme1 = new Filme("superbad",2009);
            filme1.avalia(10);
        Filme filme2 = new Filme("meupiru",2009);
            filme2.avalia(7);
        Filme filme3 = new Filme("dogue",2009);
            filme3.avalia(9);
        Serie serie1 = new Serie("chaves",1980);
            serie1.avalia(10);

        ArrayList<Titulo> lista = new ArrayList<>();
            lista.add(filme1);
            lista.add(filme2);
            lista.add(filme3);
            lista.add(serie1);

            for(Titulo item : lista){
               System.out.println(item.getNome());
               if(item instanceof Filme filme && filme.getClassificacao() > 2){
                  // Filme filme = (Filme) item;
                   System.out.println("classificação: " + filme.getClassificacao());
               }
            }

//            lista.forEach(System.out::println);



    }

}
