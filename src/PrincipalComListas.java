import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

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

        List<Titulo> lista = new LinkedList<>();
            lista.add(filme1);
            lista.add(filme2);
            lista.add(filme3);
            lista.add(serie1);

            for(Titulo item : lista){ //laço foreach para varrer o arraylist
               System.out.println(item.getNome()); //imprime todos os nomes da lista
               if(item instanceof Filme filme && filme.getClassificacao() > 2){
                  // Filme filme = (Filme) item;
                   System.out.println("classificação: " + filme.getClassificacao());
               }
            }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
            buscaPorArtista.add("chaves");
            buscaPorArtista.add("Adam sandler");
            buscaPorArtista.add("Adam driver");
            buscaPorArtista.add("Adam duck");
            buscaPorArtista.add("mateus");
            buscaPorArtista.add("sharon stone");

        Collections.sort(buscaPorArtista); //ordeando lista por nome
            System.out.println(buscaPorArtista);

            System.out.printf("----------------------------------------\n");

        Collections.sort(lista);
            for(Titulo item : lista){
                System.out.println(item.getNome());
            }

        System.out.printf("----------------------------------------\n");

        lista.sort(Comparator.comparing(Titulo::getAno));//comparando atualmente.
              System.out.println("ordenando por ano..");
              System.out.println(lista);



    }//fim main

}//fim classe
