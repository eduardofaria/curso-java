package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        //ArrayList<Usuario> lista = new ArrayList<>();
        List<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Eduardo");
        lista.add(u1);
        lista.add(new Usuario("Du"));
        lista.add(new Usuario("Dudu"));
        lista.add(new Usuario("Edu"));
        lista.add(new Usuario ("Edward"));

        for (Usuario user : lista) {
            System.out.println(user.nome);
        }

        System.out.println(lista.get(3).nome); // Acessando pelo índice
        System.out.println(lista.get(3));
        System.out.println(lista.get(3).toString());
        System.out.println(lista.get(0).nome + " vai ser removido");
        lista.remove(0);
        System.out.println("Agora " + lista.get(1).nome + " vai ser removido");
        System.out.println(lista.remove(1)); // remove pelo índice não retorna true ou false, mas sim o objeto excluído (além de removê-lo)
        lista.remove(new Usuario("Edward")); // remover pelo objeto retorna false ou true
        System.out.println(lista.remove(new Usuario("Edward"))); // false

         for (Usuario u : lista){
             System.out.println(u.nome.toUpperCase() + ": " + u);
         }

        System.out.println(lista.contains(new Usuario("Du"))); // verifica se contém o objeto

    }
}
