package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.print(" dia!\n\n");
        System.out.println("Bom");
        System.out.println("dia");

        System.out.printf("Megasena: %d %d %d %d %d %d", 1, 2, 3, 4, 5, 6); // tal como \n o %n também quebra a linha

        System.out.printf("\nSalário: %.1f %n", 1280.23);

        Scanner entrada = new Scanner(System.in); //Cria o objeto que captura a entrada padrão (teclado)

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine(); //Alimenta a variável nome com o conteúdo capturado pelo objeto

        System.out.println("Olá " + nome);

        System.out.print("Escolha um número: ");
        int numero = entrada.nextInt(); //nextInt captura um int não uma string como nextLine

        entrada.nextLine(); //lê o "\\\\n" que o teclado.nextInt() deixa para trás.

        System.out.println("O número é: " + numero);

        //O objeto Scanner precisa ser fechado para remover o warning de "Resource leak"
        entrada.close();



    }
}
