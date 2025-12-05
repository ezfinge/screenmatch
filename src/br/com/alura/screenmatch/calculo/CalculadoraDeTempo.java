package br.com.alura.screenmatch.calculo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void setTempoTotal(int tempoTotal) {
        this.tempoTotal = tempoTotal;
    }

//    public void inclui(Filme f){
//        this.tempoTotal = this.tempoTotal + f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s){
//        this.tempoTotal = this.tempoTotal + s.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo t){
        System.out.println("adicionando duracao em minutos de "+t);
        this.tempoTotal += t.getDuracaoEmMinutos();
    }


}
