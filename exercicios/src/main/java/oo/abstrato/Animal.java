package oo.abstrato;

public abstract class Animal {

    public String respirar(){
        return "CO²";
    }

    // Caso o nível de abstração da classe não permita saber como implementar o metodo, cria-se um metodo abstratro para ser implementado por suas subclasses concretas.
    public abstract String mover(); // só é permitido métodos abstratos em classes abstratas.
}
