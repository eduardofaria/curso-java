package classe;

public class Produto {

    String nome;
    double preco;
    double desconto;

    double precoComDesconto() {
        return preco * (1 - desconto); // Casting pra Float seria: return (float) (preco * (1 - desconto));
    }
    double precoComDesconto(double descontoExtra){
        return preco * (1 - (desconto + descontoExtra));
    }
}
