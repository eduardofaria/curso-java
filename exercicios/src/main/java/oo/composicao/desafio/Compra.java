package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {
    ArrayList<Item> itens = new ArrayList<>();
    double total;

    void getTotal() {
        for (Item i : itens) {
            total += i.total();
        }
    }


}
