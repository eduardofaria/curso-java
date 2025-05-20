package streams;

import java.util.Objects;

public class Aluno {
    final String nome;
    final double nota;
    final boolean bomComportamento;

    public Aluno(String nome, double nota) {
        this(nome, nota, true); // Este constructor chamando o outro constructor abaixo
    }

    public Aluno(String nome, double nota, boolean bomComportamento) {
        this.nome = nome;
        this.nota = nota;
        this.bomComportamento = bomComportamento;
    }

    public String toString (){
        return nome + " tem nota " + nota;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Aluno aluno = (Aluno) o;
        return Double.compare(nota, aluno.nota) == 0 && bomComportamento == aluno.bomComportamento && Objects.equals(nome, aluno.nome);
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
