package oo.composicao.desafio;

public class Item {

    Produto produto;
    int qtd;

    Item (Produto produto, int qtd){
        this.produto = produto;
        this.qtd = qtd;
    }

    double total () {
        return produto.price * qtd;
    }


}
