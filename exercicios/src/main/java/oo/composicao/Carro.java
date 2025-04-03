package oo.composicao;

public class Carro {
    //static Motor motor; // Atributo de CLASSE

    Motor motor = new Motor(); // atributo de instância
    //Pode ser inicializado aqui ou no construtor, ou pode receber como parâmetro do construtor

    void acelerar(){
        if (this.motor.fatorInjecao > 2.5) {
            motor.fatorInjecao = 2.5;
        } else {
            motor.fatorInjecao += 0.4;
        }
    }

    void frear(){
        if (this.motor.fatorInjecao < 0) {
            motor.fatorInjecao = 0.2;
        } else {
            motor.fatorInjecao -= 0.4;
        }
    }

    void ligar (){
        motor.ligado = true;
    }

    void  desligar() {
        motor.ligado = false;
    }

    boolean estaLigado() {
        return motor.ligado;
    }


}
