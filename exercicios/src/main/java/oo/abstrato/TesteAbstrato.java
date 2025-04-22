package oo.abstrato;

public class TesteAbstrato {
    public static void main(String[] args) {
        Animal dog = new Cachorro();
        Mamifero dog2 = new Cachorro();
        //Animal animal2 = new Animal(); // Não é possível instanciar a classe abstrata Animal()
        Animal animal = new Animal() { // Só permite instanciar a classe ABSTRATA Animal() se o metodo abstrato for implementado!
            @Override
            public String mover() {
                return "";
            }
        };

        System.out.println(dog2.mamar());
        // System.out.println(dog.mamar()); //ERRO: Quando a instância de Cachorro for um Mamifero() ele tem o metodo mamar()
        // Mas quando a instancia Cachorro() for do tipo Animal(), não tem acesso ao metodo mamar().
        System.out.println(dog2.mover());
        System.out.println(dog2.mover2());
        System.out.println(dog2.respirar());
    }
}
