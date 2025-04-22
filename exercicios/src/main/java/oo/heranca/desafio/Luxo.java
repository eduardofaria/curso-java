package oo.heranca.desafio;

public interface Luxo {
    // todo metodo proveniente de interface sempre é public e abstract por padrão (está implícito)
    // Métodos provenientes de interface não deixam diminuir a visibilidade para private ao serem implementados.
    // public abstract void ligarAr();
    // Métodos abstratos não tem corpo
    void ligarAr();
    void desligarAr();
}
