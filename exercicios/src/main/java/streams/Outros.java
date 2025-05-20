package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 6.1);
        Aluno a3 = new Aluno("Gui", 8.1); // skip(2) começa a partir do deste (Gui)
        Aluno a4 = new Aluno("Gabi", 10); // limit(2) pega apenas 2 elementos a partir do Gui, ou seja, só Gui e Gabi
        Aluno a5 = new Aluno("Ana", 7.1);
        Aluno a6 = new Aluno("Pedro", 6.1);
        Aluno a7 = new Aluno("Gui", 8.1);
        Aluno a8 = new Aluno("Maria", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

        System.out.println("Distinct...");
        alunos.stream().distinct().forEach(System.out::println);
        // distinct() exclui os duplicados

        System.out.println("\nSkip/Limit"); // Tipo uma paginação
        alunos.stream()
                .distinct()
                .skip(2)
                .limit(2)
                .forEach(System.out::println);


        System.out.println("\nTakeWhile"); // Tipo uma paginação
        alunos.stream()
                .distinct()
                .skip(2)
                .takeWhile(a -> a.nota >= 7)
                .forEach(System.out::println); //Gui tem nota 8.1 / Gabi tem nota 10.0

        // Pegue os elementos enquanto eles obedecerem o critério determinado E PARA ASSIM QUE não obedecer mais.
        // IMPORTANTE!!!!
        // Não continua por toda a lista, só ATÉ o critério for obedecido, assim que o critério falhar, ele para.





        /*
        PARA:

        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 6.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10);
        Aluno a5 = new Aluno("Ana", 7.1);
        Aluno a6 = new Aluno("Luna", 6.1);
        Aluno a7 = new Aluno("Gui", 8.1);
        Aluno a8 = new Aluno("Gabi", 10);


        COM EQUALS E HASHCODE Implementados em Aluno:

        Distinct...
        Ana tem nota 7.1
        Luna tem nota 6.1
        Gui tem nota 8.1
        Gabi tem nota 10.0


        SEM IMPLEMENTAR o Equals ou o Hashcode em Aluno() a saída é:

        Distinct...
        Ana tem nota 7.1
        Luna tem nota 6.1
        Gui tem nota 8.1
        Gabi tem nota 10.0
        Ana tem nota 7.1
        Luna tem nota 6.1
        Gui tem nota 8.1
        Gabi tem nota 10.0

        * */
    }
}
