package oo.composicao.desafio;


public class ClienteTeste {
    public static void main(String[] args) {

        //Criando produtos para virarem itens no carrinho
        Produto p1 = new Produto("Blusa", 59.90);
        Produto p2 = new Produto("Calça", 105.00);

        // Criando itens com os produtos
        Item i1 = new Item(p1, 2);
        Item i2 = new Item(p2, 1);

        Compra compra = new Compra();

        compra.itens.add(i1);
        compra.itens.add(i2);


        //Criando o Cliente e Associando as compras a ele
        Cliente cliente = new Cliente();
        cliente.nome = "Eduardo";
        cliente.compra.add(compra);

        System.out.println(cliente.obterValorTotal());



    }
}
