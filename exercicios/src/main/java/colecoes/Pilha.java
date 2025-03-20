package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();
        // Analogia de uma Queue: Uma pilha de livros que só podem ser adicionados e removidos por cima.
        livros.add("O Pequeno Príncipe"); //1º / retorna boolean
        livros.push("Don Quixote"); //2º / retorna nada, ou retorna exceção no caso de pilha cheia.
        livros.push("O Hobbit"); //3º
        //LiFo
        System.out.println(livros.peek()); // O Hobbit, pois foi o último a entrar, vai ser o primeiro a sair.
        System.out.println(livros.element()); // O Hobbit

        int count = 0;
        for (String livro : livros){
            count++;
            System.out.println(count + ": " + livro);
        }



        System.out.println(livros.pop()); // Removeu O Hobbit
        System.out.println(livros.poll()); // Removeu Don Quixote
        System.out.println(livros.poll()); // Removeu O Pequeno Príncipe
        System.out.println(livros.poll()); // Retorna null, pois a pilha está vazia.
       // System.out.println(livros.pop()); // Retorna exceção, pois a pilha está vazia
       // System.out.println(livros.remove()); // Retorna exceção, pois a pilha está vazia

        System.out.println(livros.size());
        livros.clear();
        System.out.println(livros.contains("O Hobbit"));
        System.out.println(livros.isEmpty());

    }
}
