package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 7.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Predicate<Aluno> reprovado = aprovado.negate();

        System.out.println(alunos.stream().allMatch(aprovado)); // Todos deram "match" com esse predicado (aprovado)? // FALSE
        System.out.println(alunos.stream().anyMatch(aprovado)); // Algum match dentro do predicado? // TRUE
        System.out.println(alunos.stream().noneMatch(aprovado)); // Quando NADA dá match com o predicado é true. Se só algum for true com o predicado, então é FALSE. // FALSE (pois há 3 aprovados)
        System.out.println(alunos.stream().noneMatch(reprovado));
        System.out.println(alunos.stream().noneMatch(aprovado.negate())); // Com uma negação ao predicado. Ou seja, quando não houver o match com a condição none, então é TRUE.
    }

    // OBS: allMatch, anyMatch e noneMatch são funções terminadoras.
}
