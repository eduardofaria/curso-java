package arrays;

/*
Calcular média das notas informadas.
1 - Perguntar quantas notas serão informadas
2 - Perguntar nota a nota
3 - Adicionar as notas num Array (usando for)
4 - Somar todas as notas do Array com foreach
5 - Apresentar resultado com média do aluno
*/

import java.util.Scanner;

public class CalcularNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantas notas deseja calcular?");
        int nNotas = entrada.nextInt(); // peguei o número de notas, que será o tamanho da Array
        double[] notas =  new double[nNotas]; // o número de notas é usado para criar a array com o tamanho para comportar o número de notas

        for (int i = 0; i < nNotas; i++){
            System.out.println("Informe a nota " + (i + 1) + " (com \",\"): ");
            notas[i] = entrada.nextDouble();
        }
        // System.out.println(Arrays.toString(notas));

        double somatorio = 0;
        for (double nota: notas){
            somatorio += nota;
        }

        System.out.println("Sua média é: " + String.format("%.2f", (somatorio / nNotas)));

        entrada.close(); // Sempre feche a Scanner

    }
}
