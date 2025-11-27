public class Filme {
    String titulo, classificacao,  tipo,  sinopse;
    int ano, totalDeAvaliacoes;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes, duracao;

    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + titulo);
        System.out.println("Ano de lançamento: " + ano);

    }
    void avalia(double nota ){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

}
