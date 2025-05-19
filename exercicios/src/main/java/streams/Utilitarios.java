package streams;

import java.util.function.UnaryOperator;

public class Utilitarios {
    private Utilitarios() {
        // O construtor sendo privado impede que essa classe seja instanciada. (Alternativa a torná-lo uma interface para impedir isso)
    }
    public final static UnaryOperator<String> maiuscula = n -> n.toUpperCase();
    public final static UnaryOperator<String> minuscula = String::toLowerCase;
    public final static UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + ""; // Usou o ' + "" ' para forçar o retorno de uma String. Caso contrario o charAt() retornaria um tipo char, o que daria um erro.

    public static String grito(String n){
        return n + "!!! ";
    }
}
