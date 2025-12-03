import br.com.alura.screenmatch.modelos.Filme;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal
{
    public static void main(String[] args)
    {
        Filme meuFilme = new Filme();

//      meuFilme.titulo = ;
        meuFilme.setNome("Trovão Tropical");
//      meuFilme.ano = 2010;
        meuFilme.setAno(2010);
//      meuFilme.duracao = 120;
        meuFilme.setDuracao(120);

//        System.out.println(meuFilme.titulo);
//        System.out.println(meuFilme.ano);
//        System.out.println(meuFilme.duracao);

//        meuFilme.exibeFichaTecnica();
//        meuFilme.avalia(9);
//        meuFilme.avalia(4);
//        meuFilme.avalia(8.7);

        System.out.println("nota do filme: " + meuFilme.getSomaDasAvaliacoes());
        System.out.println("avaliacoes: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("media: " + meuFilme.pegaMedia());

        meuFilme.somaDasAvaliacoes = 10;

    }
}
