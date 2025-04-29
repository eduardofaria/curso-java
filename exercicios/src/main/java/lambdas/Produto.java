package lambdas;

public class Produto extends Object { // Toda classe java extend a classe Object implicitamente (extends Object)
    final String nome;
    final double preco;
    final double desconto;

    public Produto(String nome, double preco, double desconto) {
        super(); // super() é sempre implicito por conta do extends Object também sempre implicito nas classes JAVA.
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        double precoComDesconto = preco * (1 - desconto);
        return nome + ": R$" + precoComDesconto + " (R$" + preco + " / -" + (100 * desconto) + "%)";
    }
}
