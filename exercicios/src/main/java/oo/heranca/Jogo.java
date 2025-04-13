package oo.heranca;

public class Jogo {
    public static void main(String[] args) {
        Monstro j1 = new Monstro();
        j1.x = 10;
        j1.y = 10;

        Jogador j2 = new Heroi();
        j2.x = 10;
        j2.y = 11;


        System.out.println("Jogador 1: " + "X: " + j1.x + " Y: " + j1.y + " Vida: " + j1.vida);
        System.out.println("Jogador 2: " + "X: " + j2.x + " Y: " + j2.y + " Vida: " + j2.vida);
        System.out.println("------FIGHT------");

        j1.atacar(j2);
        j2.atacar(j1);

        System.out.println("Jogador 1: " + "X: " + j1.x + " Y: " + j1.y + " Vida: " + j1.vida);
        System.out.println("Jogador 2: " + "X: " + j2.x + " Y: " + j2.y + " Vida: " + j2.vida);


    }
}
