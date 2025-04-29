package lambdas;

import colecoes.Lista;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

        System.out.println("Forma tradicional...");
        for (String nome : aprovados){
            System.out.println(nome);
        }

        System.out.println("\nLambda #1...");
        //sout
        aprovados.forEach(n -> System.out.println(n + "!!!"));


        /* IMPORTANTE */
        System.out.println("\nMethod Reference #1...");
        //soutc  //System.out::
        aprovados.forEach(System.out::println);
        // Significa: "Para cada item da List aprovados (.forEach()) chame .println() de System.out"


        System.out.println("\nLambda #2...");
        aprovados.forEach(n -> meuImprimir(n));


        System.out.println("\nMethod Reference #2...");
        aprovados.forEach(Foreach::meuImprimir);
        // Usa o metodo estático (função) .meuImprimir() da classe Foreach() em cada item (.forEach(n)) da List aprovados.
    }

    static void meuImprimir(String nome) {
        System.out.println("Oi! Meu nome é " + nome);
    }
}

//As Interfaces Funcionais ficam no pacote padrão: java.util.function