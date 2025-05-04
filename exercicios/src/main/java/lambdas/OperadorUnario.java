package lambdas;

import java.util.function.UnaryOperator;

// UnaryOperator<T> é uma das Function mais usadas.
public class OperadorUnario {
    public static void main(String[] args) {
        UnaryOperator<Integer> maisDois = n -> n + 2;
        UnaryOperator<Integer> vezesDois = n -> n * 2;
        UnaryOperator<Integer> aoQuadrado = n -> n * n;

        System.out.println(maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(2));

        int resultado1 = maisDois
                .andThen(vezesDois)
                .andThen(aoQuadrado)
                .apply(5);

        System.out.println(resultado1);

        int resultado2 = aoQuadrado.compose(vezesDois).compose(maisDois).apply(5); // .apply() é o que inicia o processo.
        // Quer dizer: "Antes de executar aoQuadrado execute vezesDois, antes de executar vezesDois execute maisDois". É o contrário de andThen.
        System.out.println(resultado2);
    } // 697256247-34
}
