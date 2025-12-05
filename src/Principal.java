
import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;

import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal
{
    public static void main(String[] args)
    {
        Filme f = new Filme();

//      f.titulo = ;
        f.setNome("Trovão Tropical");
//      f.ano = 2010;
        f.setAno(2010);
//      f.duracao = 120;
        f.setDuracao(120);


            f.setNome("Trovão Tropical");
            f.setAno(2010);
            f.setDuracaoEmMinutos(120);

            System.out.println("nota do filme: " + f.getSomaDasAvaliacoes());
            System.out.println("avaliacoes: " + f.getTotalDeAvaliacoes());
            System.out.println("media: " + f.pegaMedia());
            System.out.println(f.pegaMedia());

        Serie s = new Serie();
            s.setNome("Shameless");
            s.setAno(2010);
            s.setMinutosPorEpisodio(50);
            System.out.println("tempo da maratona: " + s.getDuracaoEmMinutos());

        CalculadoraDeTempo calc = new CalculadoraDeTempo();
            calc.inclui(f);
            System.out.println(calc.getTempoTotal());


        //teste simples
        Filme outrof = new Filme();
            outrof.setNome("branquelas");
            outrof.setAno(2010);
            outrof.setDuracaoEmMinutos(80);
            calc.inclui(outrof);
            System.out.println(calc.getTempoTotal());

        Filme outrof2 = new Filme();
            outrof2.setNome("branquelas");
            outrof2.setAno(2010);
            outrof2.setDuracaoEmMinutos(80);

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
    }
}
