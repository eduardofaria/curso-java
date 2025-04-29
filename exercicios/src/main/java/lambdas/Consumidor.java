package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimir = p -> System.out.println(p.nome + "!!!");

        Produto p1 = new Produto("Caneta", 12.34, 0.09);
        imprimir.accept(p1);

        Produto p2 = new Produto("Notebook", 2987.99, 0.25);
        Produto p3 = new Produto("Caderno", 12.90, 0.03);
        Produto p4 = new Produto("Borracha", 7.80, 0.18);
        Produto p5 = new Produto("Lápis", 4.39, 0.19);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        // produtos.forEach(imprimir::accept); // Não precisa do ::accept pq o .forEach já entende que é para executar a função lambda em cada item, ou seja um accept em cada um.
        produtos.forEach(imprimir); // um consumer como parâmetro
        produtos.forEach(p -> System.out.println(p.preco)); // uma expressão lambda como parâmetro
        produtos.forEach(System.out::println); // Method Reference como parâmetro
        // lambdas.Produto@41629346 // Vou definir um toString na classe Produto() para o println retornar algum dos atributos do Produto ao invés de lambdas.Produto@41629346


    }
}
