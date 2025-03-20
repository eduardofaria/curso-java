package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        //Add e Offer, ambos adicionam elementos na fila
        // A diferença é o comportamento quando a fila está cheia.
        fila.add("Ana"); // para filas com limitação de tamanho, o .add() retorna uma exceção (IllegalStateException).
        fila.offer("Bia"); // para filas com limitação de tamanho, o .offer() retorna false caso não tenha mais espaço.
        fila.add("Eduardo");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        // Peek e Element, obtém o próximo elemento da fila sem removê-lo
        System.out.println(fila.peek());
        System.out.println(fila.peek()); // .peek - Lê o primeiro elemento da fila, mas não remove o elemento. Quando a fila está vazia retorna null
        System.out.println(fila.element()); // .element - também lê o primeiro elemento da fila sem removê-lo. Mas quando a fila está vazia retorna a exceção NoSuchElementException

        // fila.size();
        // fila.clear();
        // fila.isEmpty(); // verifica se a fila está vazia, recomendado usa-lo para verificar a fila antes de usa-la.
        // fila.contains(...) // verifica se a fila contém determinado elemento (...)

        // Poll, Resgata o primeiro elemento da fila E O REMOVE.
        System.out.println(fila.poll()); // Ana
        System.out.println(fila.poll()); // Bia
        System.out.println(fila.remove()); // Eduardo
        System.out.println(fila.poll()); // Daniel
        System.out.println(fila.poll()); // Rafaela
        System.out.println(fila.poll()); // Gui
        System.out.println(fila.poll()); // null - com a fila vazia retorna null.
        // System.out.println(fila.remove()); // Remove tal como o .poll() só que ao encontrar a fila vazia retorna a exceção NoSuchElementException


        // PRESTAR ATENÇÃO NOS MÉTODOS DE FILAS QUE "FAZEM AS MESMAS COISAS" POIS GERALMENTE HÁ DIFERENÇA APARECE NA RESPOSTA QUANDO A FILA ESTÁ VAZIA OU CHEIA.
    }
}
