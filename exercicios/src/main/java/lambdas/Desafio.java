package lambdas;

import java.util.function.*;

public class Desafio {
    public static void main(String[] args) {

       Produto p = new Produto("iPad", 3235.89, 0.13);

       /*
       1 - A partir do produto calcular o preço real (com desconto)
       2 - Imposto Municipal: >= 2500 (8,5%) / < 2500 (Isento)
       3 - Frete: >= 3000 (100) / < 3000 (50)
       4 - Arredondar: Deixa duas casas decimais
       5 - Formatar R$1234,56
        */

        Function<Produto, Double> precoReal = prod -> prod.preco * (1 - prod.desconto);
        UnaryOperator<Double> comImposto = preco -> preco >= 2500 ? preco * 1.085 : preco; // Usei (preco + (preco * 0.085)) ao invés de preco * 1.085
        UnaryOperator<Double> comFrete = preco -> preco >= 3000.00 ? preco + 100.00 : preco + 50.00;
        UnaryOperator<Double> arredondar = preco -> Math.round(preco * 100) / 100.00; // Double.parseDouble(String.format("%.2f", preco))
        // Function<Double, String> precoFinal = (preco) -> String.format("R$%.2f", preco);
        Function<Double, String> precoFinal = (preco) -> String.format("R$%.2f", preco).replace(".", ",");


        System.out.println(precoReal.apply(p));
        System.out.println(comImposto.apply(p.preco));

        // Resultado do Desafio
        System.out.println(precoReal
                .andThen(comImposto)
                .andThen(comFrete)
                .andThen(arredondar)
                .andThen(precoFinal)
                .apply(p));

    }
}
