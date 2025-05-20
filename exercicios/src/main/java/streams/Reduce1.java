package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Reduce1 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5 , 6, 7, 8, 9);

        BinaryOperator<Integer> soma = (acumulador, atual) -> acumulador + atual;

        int total1 = nums.stream().reduce(soma).get(); // reduce não retorna nada, é uma função terminal como o forEach
        System.out.println(total1); // O .get() é usado pois o reduce por padrão não precisa retornar nada quando não tem valor inicial.

        Integer total2 = nums.parallelStream().reduce(100, soma); // Como há um valor inicial (100), o get() não é necessário pois o reduce retornará ao menos o 100 se nada mais for feito pela função iteradora.
        System.out.println(total2); // 945 - O parallelStream() adicionou o valor inicial (100) a todos os elementos em paralelo na primeira iteração.

        Integer total3 = nums.stream().reduce(100, soma); // 145 - Como não é um parallelStream(), o 100 só foi adicionado a iteração do primeiro elemento de uma fila de iterações que não rodou em paralelo, pois foi sequêncial (serial).
        System.out.println(total3);

        int total4 = nums.parallelStream().reduce(soma).get(); // 45 - Não teve problema rodar em paralelo, pois não há valor inicial para ser adicionado a primeira rodada de iteração.
        System.out.println(total4);

        // Resultado foi um Opcional<Integer>...
        nums.stream()
                .filter(n -> n > 5)
                .reduce(soma)
                .ifPresent(System.out::println); // Fazendo até aqui (.reduce(soma);) como não tem valor inicial, há alerta. O .ifPresent() previne isso. Também existe o .ifPresentOrElse.
                // Se n > 5 saída é 30. Se n > 10, não há saída, o System.out::println nem é executado, pois não há números maiores que 10 na lista.
                // Em .ifPresent(System.out::println); também seria aceito um lambda.
        // System.out::println = Reference Method / é uma referência ao metodo .println dentro de .out que está dentro de System.


        Integer a = null; // possível. É permitido uma variável de classe (wrap) receber um valor nulo.
        // int b = a; // Erro, null point exception. Não tem como aplicar nulo a um valor inteiro
    }
}
