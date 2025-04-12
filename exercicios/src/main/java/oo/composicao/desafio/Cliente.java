package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {
    String nome;
    ArrayList<Compra> compra = new ArrayList<>();
    double total;

    double obterValorTotal() {
        for (Compra c : compra) {
            c.getTotal();
            total += c.total;
        }
        return total;
    }
}
