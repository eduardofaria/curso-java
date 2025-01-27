package arrays;

public class Foreach {
    public static void main(String[] args) {
        double[] notas = { 9.9, 8.7, 7.2, 9.4 };
        // "foreach" em java é "for" com parâmetros diferentes "cada um: todos" // enhanced "for"
        for(double nota: notas) { //Significa: Para cada "nota" (unidade) em "notas" (conjunto).
            System.out.println(nota);
        }
        // Equivalente tradicional do "for":
        for (int i = 0; i < notas.length; i++){
            System.out.println(notas[i]);
        }
    }
}
