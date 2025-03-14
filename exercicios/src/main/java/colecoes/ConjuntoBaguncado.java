package colecoes;

import java.util.HashSet; //HashSet não aceita tipos primitivos.
import java.util.Set;

public class ConjuntoBaguncado {
    @SuppressWarnings({"rawtypes", "unchecked"})// suprimindo os Warnings do exercício
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();
        conjunto.add(1.2); // converte double -> Double
        conjunto.add(true); // boolean -> Boolean
        conjunto.add("Teste"); // String
        conjunto.add(1); // int -> Integer
        conjunto.add('x'); // char -> Character

        System.out.println("Tamanho: " + conjunto.size()); // 5

        conjunto.add("Teste"); // 5
        // conjunto.add("teste"); // 6
        System.out.println("Tamanho: " + conjunto.size());

        System.out.println(conjunto.remove("Teste")); // true
        System.out.println(conjunto.remove("Vaca")); // false

        System.out.println(conjunto.contains(1.2)); // true
        System.out.println(conjunto.contains(23)); // false
        System.out.println(conjunto);

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        //conjunto.addAll(nums); // União entre dois conjuntos
        conjunto.retainAll(nums); // Interseção entre conjunto e nums
        System.out.println(conjunto); // 1

        conjunto.clear(); // limpar
        System.out.println(conjunto);


    }
}
