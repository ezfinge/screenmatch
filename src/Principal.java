import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
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
            f.setDuracaoEmMinutos(120);

    //        System.out.println(f.titulo);
    //        System.out.println(f.ano);
    //        System.out.println(f.duracao);

    //        f.exibeFichaTecnica();
    //        f.avalia(9);
    //        f.avalia(4);
    //        f.avalia(8.7);

            System.out.println("nota do filme: " + f.getSomaDasAvaliacoes());
            System.out.println("avaliacoes: " + f.getTotalDeAvaliacoes());
            System.out.println("media: " + f.pegaMedia());
    //        f.somaDasAvaliacoes = 10;
    //        f.totalDeAvaliacoes = 1;
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
            //      f.ano = 2010;
            outrof.setAno(2010);
            //      f.duracao = 120;
            outrof.setDuracaoEmMinutos(80);
        //CalculadoraDeTempo calc = new CalculadoraDeTempo();
            calc.inclui(outrof);
            System.out.println(calc.getTempoTotal());

        Filme outrof2 = new Filme();
            //CalculadoraDeTempo calc = new CalculadoraDeTempo();
            outrof2.setNome("branquelas");
            //      f.ano = 2010;
            outrof2.setAno(2010);
            //      f.duracao = 120;
            outrof2.setDuracaoEmMinutos(80);

            calc.inclui(outrof2);
            System.out.println(calc.getTempoTotal());




    }
}
