package oo.abstrato;

public abstract class Mamifero extends Animal{
    @Override
    public final String mover(){ //metodo "final" não pode ser sobrescrito nas subclasses;
        return "Usando as patas";
    }

    public String mover2(){ //metodo "final" não pode ser sobrescrito nas subclasses;
        return "Usando as patas 2";
    }
    public abstract String mamar();
}
