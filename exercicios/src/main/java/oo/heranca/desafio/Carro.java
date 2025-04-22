package oo.heranca.desafio;

public class Carro {

    final int VELOCIDADE_MAX;
    int velocidadeAtual;
    private int delta = 10;

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }


    Carro(int velocidadeMaxima){
        this.VELOCIDADE_MAX = velocidadeMaxima;
    }

    void acelerar(){
        if ((velocidadeAtual + getDelta()) >= VELOCIDADE_MAX) {
            velocidadeAtual = VELOCIDADE_MAX;
        } else {
            velocidadeAtual += getDelta();
        }
    }// de 5 em 5. Ferrari de 15 em 15
    void frear(){
        if (velocidadeAtual >= 10){
            velocidadeAtual -= 10;
        } else {
            velocidadeAtual = 0;
        }
    }

    public String toString(){
        return "Velocidade atual é " + velocidadeAtual + " Km/h.";
    }
}
