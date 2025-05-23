package streams;

import arrays.Foreach;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Lu", "Gui", "Ana");


        System.out.println("Usando o for:");
        for (int i = 0; i < aprovados.size(); i++) {
            System.out.println(aprovados.get(i));
        }

        System.out.println("\nUsando o foreach:");
        for (String nome : aprovados) {
            System.out.println(nome);
        }

        System.out.println("\nUsando o iterator:");
        Iterator<String> iterator = aprovados.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nUsando Streams:");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println); // Laço interno!!!
        // aprovados.forEach(a -> System.out.println(a)); // Fiz antes de assistir à aula.
    }
}
