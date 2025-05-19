package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
    public static void main(String[] args) {

        Consumer<String> print = System.out::print;

        List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda\n");

        marcas.stream().map(m -> m.toUpperCase()).forEach(print);

        UnaryOperator<String> maiuscula = n -> n.toUpperCase();
        UnaryOperator<String> minuscula = String::toLowerCase;
        UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + ""; // Usou o ' + "" ' para forçar o retorno de uma String. Caso contrario o charAt() retornaria um tipo char, o que daria um erro.
        UnaryOperator<String> grito = n -> n + "!!!  ";

        System.out.println(maiuscula.andThen(primeiraLetra).andThen(grito).apply("bmw"));

        System.out.println("\n\nUsando composição: ");
        marcas.stream().map(maiuscula).map(Utilitarios.primeiraLetra).map(grito).forEach(print);

        marcas.stream()
                .map(Utilitarios.maiuscula
                        .andThen(primeiraLetra)
                        .andThen(Utilitarios::grito))
                .forEach(print);


    }
}
