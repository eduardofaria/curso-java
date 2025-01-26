package classe;

public class Jantar {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Comida c1 = new Comida("Feijão", 0.2);
        Comida c2 = new Comida("Arroz", 0.35);

        p1.nome = "Juninho";
        p1.peso = 70;
        System.out.println(p1.nome + " ANTES do jantar: " + p1.peso);

        p1.comer(c1);
        p1.comer(c2);

        System.out.println(p1.nome + " DEPOIS do jantar: " + p1.peso);
    }
}
