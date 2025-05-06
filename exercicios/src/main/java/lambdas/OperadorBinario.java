package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
    public static void main(String[] args) {

        BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
        System.out.println(media.apply(2.0, 5.0)); // 3.5

        BiFunction<Double, Double, String> resultado =
                (n1, n2) -> ((n1 + n2) / 2) >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado.apply(8.0, 7.0));

        // Composição de Funções
        Function<Double, String> conceito = (m) -> m >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(media.andThen(conceito).apply(5.7, 7.4));
    }
}
