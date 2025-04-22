package oo.abstrato;

public class Cachorro extends Mamifero{
    /* Metodo FINAL em Mamifero(), não pode ser sobrescrito,
    @Override
    public String mover(){
        return "Usando as patas";
    }
     */

    @Override
    public String mover2(){ // Não é FINAL em Mamifero(), então pode ser sobrescrito
        return "Usando as patas 2222";
    }

    @Override
    public String mamar(){
        return "Usando leite";
    }

    // Mamifero() não precisa implementar nenhum metodo abstrato de Animal() pois também é uma classe abstrata
    // MAS, Cachorro() precisa implementar o metodo abstrato presente em Animal, mesmo não estando presente em Mamifero()
    // pois Chachorro é uma classe CONCRETA. Métodos abstratos herdados só podem ser ignorados por subclasses também ABSTRATAS.
}
