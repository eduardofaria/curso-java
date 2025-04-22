package oo.polimorfismo;

public class Jantar {
    public static void main(String[] args) {
        Pessoa convidado = new Pessoa(99.65);

        Arroz ingrediente1 = new Arroz(0.2);
        Comida ingrediente2 = new Feijao(0.1);

        //Comida ingrediente3 = new Comida(0.3); Como classe abstrata, não pode mais ser instanciada com "new Comida()".
        Comida ingrediente3 = new Arroz(0.3);

        System.out.println(convidado.getPeso());

        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);

        convidado.comer(ingrediente3);

        System.out.println(convidado.getPeso());

        Sorvete sobremesa = new Sorvete(0.4);

        convidado.comer(sobremesa);

        System.out.println(convidado.getPeso());
    }
}
