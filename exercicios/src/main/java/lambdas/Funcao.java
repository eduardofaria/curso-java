package lambdas;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        Function<Integer, String> parOuImpar = (n) -> {
            if (n % 2 == 0){
                return "par";
            } else {
                return "ímpar";
            } // Function<Integer, String> parOuImpar = n -> n % 2 == 0 ? "par" : "ímpar";

        };

        // IMPORTANTE!
        // Para usar a INTERFACE FUNCIONAL use o APPLY: [variável com a interface].apply([ENTRADA se tiver])
        System.out.println(parOuImpar.apply(65));

        Function<String, String> oResultadoE =
                valor -> "O resultado é " + valor;

        System.out.println(oResultadoE.apply("CASA"));

        System.out.println(oResultadoE.apply(parOuImpar.apply(38))); // Minha primeira abordagem
        // OU
        String resultadoFinal = parOuImpar.andThen(oResultadoE).apply(38); // Abordagem do professor
        System.out.println(resultadoFinal);

        //Encadeando mais....
        Function<String, String> empolgado = s -> s + "!!!";
        System.out.println(parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(38));
        //                       1              2                   3                  1

        System.out.println(parOuImpar
                .andThen(oResultadoE)
                .andThen(empolgado)
                .apply(39)
        );
    }
}
