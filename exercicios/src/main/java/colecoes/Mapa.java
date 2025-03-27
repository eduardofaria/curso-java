package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<Integer, String>(); // ou HashMap<>()

        usuarios.put(1, "Du"); // Map não tem o metodo .add() mas sim o .put(CHAVE, VALOR)
        usuarios.put(1, "Ricardo"); // O put(CHAVE, VALOR) não só adiciona como também altera o valor da chave já existente
        System.out.println(usuarios.size()); // 1
        usuarios.put(2, "Ricardo");
        usuarios.put(20, "Ricardo");
        usuarios.put(4, "Rebeca");

        System.out.println(usuarios.size()); // 4
        System.out.println(usuarios.isEmpty()); // false

        System.out.println(usuarios.keySet()); // [1, 2, 20, 4] mostra as CHAVES
        // keySet = Conjunto das Chaves

        System.out.println(usuarios.values()); // [Ricardo, Ricardo, Ricardo, Rebeca]
        // .values() = Valores das Chaves

        System.out.println(usuarios.entrySet()); // [1=Ricardo, 2=Ricardo, 20=Ricardo, 4=Rebeca]
        // .entrySet() = CHAVES e Valores ao mesmo tempo

        // Embora não tenha mais o metodo .contains(), há agora o containsKey() e containsValue(). Para chave e valor respectivamente.
        System.out.println(usuarios.containsKey(20)); // true
        System.out.println(usuarios.containsValue("Rebeca")); // true

        System.out.println(usuarios.get(20)); // Ricardo // pega o valor da determinada chave.

        // Dá para percorrer o Map por chave, valor, ou ambos:

        System.out.println("Percorrendo o Map por CHAVES (keySet):");
        for (int chave : usuarios.keySet()) { // Cada item do Map tem sua CHAVE (key), esta será atribuída a "int chave" e exibida no println(chave) a cada iteração do for.
            // ISTO:  usuarios.keySet() é igual a ISTO: [1, 2, 20, 4]. Logo, o FOR passará por 1, por 2, por 20 e por 4.
            System.out.println(chave);
        }

        for (String valor : usuarios.values()) {
            System.out.println(valor); // o mesmo princípio, mas iterando sobre todos so valores presentes no MAP usuarios.values()
        }

        for (Map.Entry<Integer, String> registro : usuarios.entrySet()){ // Entry<Integer, String> register // Entry<Integer, String> é o Objeto que ACEITA receber um elemento CHAVE=VALOR que vem de entrySet()
            System.out.println(registro);
        }

        for (Map.Entry<Integer, String> registro : usuarios.entrySet()){ // Entry<Integer, String> register
            System.out.print(registro.getKey() + " ==> ");
            System.out.println(registro.getValue());
        }

        /* Minha solução antes de conhecer o Entry<K, V>

        for (Integer chave : usuarios.keySet()) {
            System.out.println(chave + ": " + usuarios.get(chave));
        }
        */

        System.out.println(usuarios.remove(20)); // Ricardo // remove pela CHAVE (key) e retorna o valor removido.
        System.out.println(usuarios.remove(4, "Maria")); // false // remove por chave E valor. Ambos tem que bater com a busca, ou retornará false



    }
}
