package classe;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook");
            //p1.nome = "Notebook";
            p1.preco = 4356.90;
            //p1.desconto = 0.25; //25% de desconto

        var p2 = new Produto();
            p2.nome = "Caneta Preta";
            p2.preco = 12.56;
            //p2.desconto = 0.29;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal1 = p1.preco * (1 - p1.desconto);
        double precoFinal2 = p2.precoComDesconto(); //Refatorado para o metodo
        System.out.printf("Preço final p1: R$%.2f. Preço final p2: R$%.2f.\n", precoFinal1, precoFinal2); //%.2f

        System.out.printf("Método Preço com Desconto de p1: %.2f.\n", p1.precoComDesconto());

        System.out.printf("Método Preço com Desconto EXTRA de p1: %.2f", p1.precoComDesconto(0.1));
    }
}
