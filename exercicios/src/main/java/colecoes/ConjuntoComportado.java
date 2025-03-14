package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        // Set<String> listaAprovados = new HashSet<String>(); // ou Set<String> lista = new HashSet<>();
        Set<String> listaAprovados = new TreeSet<>(); // Igual ao HashSet só que respeita a ordem de inserção
        // SortedSet<String> listaAprovados = new TreeSet<>(); TreeSet faz parte de SortedSet (conjuntos ordenados)
        listaAprovados.add("Ana");
        listaAprovados.add("Zé");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro");

        for (String candidato : listaAprovados) {
            System.out.println(candidato);
        }
        // Essa notação Set<String> o <TIPO> é o Generics.

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);

        for (int number : nums) {
            System.out.println(number);
        }

    }
}
