package classe;

public class Pessoa {
    String nome;
    double peso;


    void comer(Comida c) {
        this.peso += c.peso;

    }

}
