package arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[4]; // Array bidimensional (matriz) -> double[][] notasAlunoA = new double[3][3];
        //ou double notasAlunoA[] = new double[3];
        //ou double []notasAlunoA = new double[3];
        //ou double [] notasAlunoA = new double[3];
        //Ao criar o Array já é inicializado com os valores iniciais do tipo, 0.0 no caso de double.
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8; //Número int será convertido para double (8.0)
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 9.7;


        System.out.println(notasAlunoA); //Se não usar Arrays.toString esse será o output -> [D@6ce253f1
        String a = Arrays.toString(notasAlunoA); // import java.util.Arrays;
        System.out.println(Arrays.toString(notasAlunoA)); //[7.9, 8.0, 6.7, 9.7]
        System.out.println(a); //[7.9, 8.0, 6.7, 9.7]
        System.out.println(notasAlunoA); // [D@6ce253f1 // O Array não é alterada de double para String pelo "Arrays.toString"

        double totalAlunoA = 0;
        for (int i = 0; i < notasAlunoA.length; i++){
            totalAlunoA += notasAlunoA[i];
        }

        // System.out.println("Média: " + (total / notasAlunoA.length));
        System.out.println("Média: " + String.format("%.2f", totalAlunoA / notasAlunoA.length));
        System.out.println(notasAlunoA[notasAlunoA.length - 1]); // Última nota do Array
        /*
       Pode usar o "String.format" no lugar do System.out.printf()
       Os parâmetros são os mesmos (String.format([formato],[dado]))
       Ex: String.format("%.2f", 3.657473)) // 3.65
        */

        double[] notasAlunoB = { 6.9, 8.9, 5.5, 10 }; // Criando Array diretamente com valores literais
        double totalAlunoB = 0;
        for (int i = 0; i < notasAlunoB.length; i++) {
            totalAlunoB += notasAlunoB[i];
        }
        System.out.println("Média Aluno B: " + String.format("%.2f", (totalAlunoB / notasAlunoB.length)));
        //Aqui .length é um atributo do objeto Array, já em collection, será um metodo com o nome "size"
        // A lógica do nome "length" (comprimento) de atributo vs "size" (tamanho) de um metodo é que no collection, o "size" será variável, já length tem comprimento fixo.
    }
}
