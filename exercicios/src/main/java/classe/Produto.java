package classe;

public class Produto {

    String nome;
    double preco;
    static double desconto = 0.25; // aplicando o mesmo desconto para todas as instâncias criadas, com "static"

    Produto (String nomeInicial){
        this.nome = nomeInicial;
    }

    Produto (){

    }

    double precoComDesconto() {
        return preco * (1 - desconto); // Casting pra Float seria: return (float) (preco * (1 - desconto));
    }
    double precoComDesconto(double descontoExtra){
        return preco * (1 - (desconto + descontoExtra));
    }
}
