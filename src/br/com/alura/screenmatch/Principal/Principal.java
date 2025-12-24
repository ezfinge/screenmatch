package Principal;

import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;

import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal
{
    public static void main(String[] args)
    {
        Filme f = new Filme("Trovão Tropical", 2010);
            System.out.println("nota do filme: " + f.getSomaDasAvaliacoes());
            System.out.println("avaliacoes: " + f.getTotalDeAvaliacoes());
            System.out.println("media: " + f.pegaMedia());
            System.out.println(f.pegaMedia());

        Serie s = new Serie("shameless", 2010);
            System.out.println("tempo da maratona: " + s.getDuracaoEmMinutos());

        CalculadoraDeTempo calc = new CalculadoraDeTempo();
            calc.inclui(f);
            System.out.println(calc.getTempoTotal());

        //teste simples
        Filme outrof = new Filme("branquelas",2010);
            calc.inclui(outrof);
            System.out.println(calc.getTempoTotal());

        Filme outrof2 = new Filme("branquelas",2010);
            calc.inclui(outrof2);
//            System.out.println(calc.getTempoTotal());
//
//        System.out.println("nota do filme: " + f.getSomaDasAvaliacoes());
//        System.out.println("avaliacoes: " + f.getTotalDeAvaliacoes());
//        System.out.println("media: " + f.pegaMedia());
//        f.somaDasAvaliacoes = 10;
//        f.totalDeAvaliacoes = 1;
//        System.out.println(f.pegaMedia());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
            filtro.filtra(f);

        Episodio ep = new Episodio();
            ep.setNumero(1);
            ep.setSerie(s);
            ep.setTotalVisualizacoes(300);
            filtro.filtra(ep);

        Filme filme3 =  new Filme("superbad",2009);
           // filme3.setNome();
            filme3.setAno(2010);
            filme3.setDuracaoEmMinutos(80);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
            listaDeFilmes.add(filme3);
            listaDeFilmes.add(f);
            listaDeFilmes.add(outrof);
            System.out.println("tamanho: " + listaDeFilmes.size());
            System.out.println("primeiro filme: "+listaDeFilmes.get(0).toString());



    }//fim main
}//fim classe
