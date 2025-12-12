package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{

    int temporada;
    int episodiosPorTemporada;
    int minutosPorEpisodio;
    boolean ativa;

    public Serie(String nome, int ano) {
        super(nome,ano);
    }


    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    @Override
    public int getDuracaoEmMinutos(){
        return temporada * episodiosPorTemporada * getMinutosPorEpisodio();
    }
}//fim classe

