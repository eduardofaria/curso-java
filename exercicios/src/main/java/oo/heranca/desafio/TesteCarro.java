package oo.heranca.desafio;

public class TesteCarro {
    public static void main(String[] args) {
        Carro c1 = new Civic();
        Carro c2 = new Ferrari();

        System.out.println("Velocidade c1: " + c1.velocidadeAtual);
        System.out.println("Velocidade c2: " + c2.velocidadeAtual);
        System.out.println("ACELEREM!");
        c1.acelerar();
        c2.acelerar();
        c1.acelerar();
        c2.acelerar();
        c1.acelerar();
        c2.acelerar();
        c1.acelerar();
        c2.acelerar();
        System.out.println("Velocidade c1: " + c1);
        System.out.println("Velocidade c2: " + c2);
        System.out.println("FREAR!");
        c1.frear();
        c2.frear();
        System.out.println("Velocidade c1: " + c1.velocidadeAtual);
        System.out.println("Velocidade c2: " + c2.velocidadeAtual);
        c1.frear();
        c2.frear();
        System.out.println("Velocidade c1: " + c1.velocidadeAtual);
        System.out.println("Velocidade c2: " + c2.velocidadeAtual);
        c1.frear();
        c2.frear();
        System.out.println("Velocidade c1: " + c1.velocidadeAtual);
        System.out.println("Velocidade c2: " + c2.velocidadeAtual);
        c1.frear();
        c2.frear();
        System.out.println("Velocidade c1: " + c1.velocidadeAtual);
        System.out.println("Velocidade c2: " + c2.velocidadeAtual);
        c1.frear();
        c2.frear();
        System.out.println("Velocidade c1: " + c1.velocidadeAtual);
        System.out.println("Velocidade c2: " + c2.velocidadeAtual);
        c1.frear();
        c2.frear();
        System.out.println("Velocidade c1: " + c1.velocidadeAtual);
        System.out.println("Velocidade c2: " + c2.velocidadeAtual);
    }
}
