package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantos alunos? ");
        int nAlunos = entrada.nextInt();

        System.out.print("Quantas notas por alunos? ");
        int nNotas = entrada.nextInt();

        double total = 0;

        double[][] notasTurma = new double[nAlunos][nNotas]; //new -> Array é um objeto, logo, precisa ser instanciado.
        for (int i = 0; i < notasTurma.length; i++) { // for de alunos

            for (int j = 0; j < notasTurma[i].length; j++) { // for de notas (de cada aluno)
                System.out.printf("Informe a nota %d do aluno %d: ", (j + 1), (i + 1));
                notasTurma[i][j] = entrada.nextDouble();
                total += notasTurma[i][j];
            }
        }

        double media = total / (notasTurma.length * nNotas);
        System.out.println("Média da turma: " + String.format("%.2f", media)); // NÃO ESQUEÇA DAS ASPAS EM "%.2f" (é um string!)

        for (double[] notasAluno: notasTurma) {
            System.out.println(Arrays.toString(notasAluno));
        }



        entrada.close();
    }
}
