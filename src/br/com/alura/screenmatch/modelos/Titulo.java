package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private String tipo;
    private String sinopse;
    private int totalDeAvaliacoes;
    private int ano;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int duracaoEmMinutos;
    private int avalia;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.ano = anoDeLancamento;
    }


    void avalia(double nota ){
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
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
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
        System.out.println("Ano de lançamento: " + getAno());

    }

    public int getAvalia() {
        return avalia;
    }

    public void setAvalia(int avalia) {
        this.avalia = avalia;
    }
}



