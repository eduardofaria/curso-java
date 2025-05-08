package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {

        Consumer<String> print = System.out::print;
        Consumer<Object> printAnyType = System.out::println;

        // 1ª forma
        Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
        langs.forEach(print);

        String[] maisLangs = { "Python ", "Lisp ", "Perl ", "Go\n" };

        // 2ª forma
        Stream.of(maisLangs).forEach(print);
        // 3ª forma
        Arrays.stream(maisLangs).forEach(print);
        // 3ª forma com mais argumentos de início e fim (fim é excluído)
        Arrays.stream(maisLangs, 1, 2).forEach(print); // Lisp (do índez 1 ao 2, excluindo o 2)

        System.out.println("\n---");

        // 4ª forma (Collections)
        List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
        outrasLangs.stream().forEach(print);
       // outrasLangs.forEach(print);
        outrasLangs.parallelStream().forEach(print); // Os dados não são processados na ordem

        // Stream de forma infinita:
        // Stream.generate( () -> "a" ).forEach(print); // LOOP!!!!!
        // Stream.iterate(0, n -> n + 1).forEach(printAnyType); // LOOP!!!!


    }
}
