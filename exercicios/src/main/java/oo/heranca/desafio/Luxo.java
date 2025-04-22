package oo.heranca.desafio;

public interface Luxo {
    // todo metodo proveniente de interface sempre é public e abstract por padrão (está implícito)
    // Métodos provenientes de interface não deixam diminuir a visibilidade para private ao serem implementados.
    // public abstract void ligarAr();
    // Métodos abstratos não tem corpo
    void ligarAr();
    void desligarAr();
    // int nivelDoAr(); // Sem o Default, precisaria ser implementado por TODAS as classes concretas;
    default int nivelDoAr(){ //Não obriga as classes CONCRETAS a implementar, pois fornece um retorno "padrão" ("default")
        return 1;
    } // Caso a classe queira outra saída, basta implementyar o metodo. Mas não será mais obrigatório.
}
