package streams;

public class MediaTeste {
    public static void main(String[] args) {

        Media m1 = new Media();
        // m1.adicionar(8.3);
        // m1.adicionar(6.7);
        // Como o metodo adicionar() está retornando a instância de si mesmo (Media ao invés de void) É possível encadear em uma única chamada várias notas
        m1.adicionar(8.3).adicionar(6.7);
        //ou
        Media m2 = new Media().adicionar(7.9).adicionar(6.6);
        // não pode usar .get() no final, pois retornaria um double e m2 é do tipo Media.
        System.out.println(m1.getValor());
        System.out.println(m2.getValor());

        System.out.println(Media.combinar(m1, m2).getValor());
    }
}
