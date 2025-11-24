public class Filme {
    String titulo, classificacao,  tipo,  sinopse;
    private int totalDeAvaliacoes;
    int ano;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    double duracao;

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

    public int getTotalDeAvaliacoes(){
        return this.totalDeAvaliacoes;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    double getSomaDasAvaliacoes(){
        return somaDasAvaliacoes;
    }
}
