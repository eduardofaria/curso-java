package lambdas;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {

        Predicate<Produto> isCaro = prod -> (prod.preco - (prod.preco * prod.desconto)) >= 750.00; // como Predicate retorna true ou false, é usado para verificar situações de true ou false.

        Produto produto = new Produto("Notebook", 3893.89, 0.15);
        System.out.println(isCaro.test(produto));

        // Duas formas aplicar o desconto ao valor total
        System.out.println(produto.preco - (produto.preco * produto.desconto)); // Minha ideia natural
        System.out.println(produto.preco * (1 - produto.desconto)); // Como o professor fez
    }
}
