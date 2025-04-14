package oo.heranca.desafio;

public class Ferrari extends Carro {

    Ferrari(){
        super(200);
    }

    /* Ou:
    Ferrari(){
        this(200);
    }
    */

    Ferrari(int velocidadeMax) {
        super(velocidadeMax);
    }

    @Override
    void acelerar() {
        if ((velocidadeAtual + 15) >= VELOCIDADE_MAX) {
            velocidadeAtual = VELOCIDADE_MAX;
        } else {
            velocidadeAtual += 15;
        }
    }
}
