package br.com.alura.screenmatch.calculo;

public class FiltroRecomendacao {
    String recomendacao;

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("esta entre os preferidos do momento.");
        }else if (classificavel.getClassificacao() >= 2){
            System.out.println("muito bem avaliado.");
        } else {
            System.out.println("coloque na sua lista pra ver depois..");
        }
    }
}
