package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{
    @SerializedName("Title")
    private String nome;
    private String tipo;
    private String sinopse;
    private int totalDeAvaliacoes;
    @SerializedName("Year")
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int duracaoEmMinutos;
    private int avalia;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();
        if(meuTituloOmdb.year().length()>4){
            throw new ErroDeConversaoDeAnoException("não consegiu converter o ano, porque tem mais de 4 caracteres.");
        }
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,2));//substring pegando caracteres especificos.
    }


    public void avalia(double nota ){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }
    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
    public int getTotalDeAvaliacoes(){
        return this.totalDeAvaliacoes;
    }
    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }
    public double getSomaDasAvaliacoes(){
        return somaDasAvaliacoes;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getSinopse() {
        return sinopse;
    }
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }
    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getDuracao() {
        return duracaoEmMinutos;
    }
    public void setDuracao(int duracao) {
        this.duracaoEmMinutos = duracao;
    }

    public int getDuracaoEmMinutos() {
        return this.duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracao) {
        this.duracaoEmMinutos = duracao;
    }
    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + getNome());
        System.out.println("Ano de lançamento: " + getAnoDeLancamento());

    }

    public int getAvalia() {
        return avalia;
    }

    public void setAvalia(int avalia) {
        this.avalia = avalia;
    }

    @Override
    public int compareTo(Titulo otroTitulo) { //comparando objetos
        return this.getNome().compareToIgnoreCase(otroTitulo.getNome());
    }
    @Override
    public String toString() {
        return "nome= " + this.getNome() + ", anoDeLancamento= "+ this.getAnoDeLancamento() + " duração= " +getDuracaoEmMinutos();
    }


    //http://www.omdbapi.com/?i=tt3896198&apikey=8b0601ee

    //https://www.omdbapi.com/?i=tt3896198&apikey=8b0601ee

}



