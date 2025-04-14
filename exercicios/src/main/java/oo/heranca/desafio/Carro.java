package oo.heranca.desafio;

public class Carro {
    int velocidadeAtual;

    void acelerar(){
        velocidadeAtual += 5;
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
