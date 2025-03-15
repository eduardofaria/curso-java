package colecoes;

public class Usuario {
    String nome;

    Usuario(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return "Meu nome é " + this.nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Usuario usuario = (Usuario) o;
        return nome.equals(usuario.nome);
    }

    @Override
    public int hashCode() {
        return nome.hashCode();
    }

    /*
    FORMA SIMPLES DE IMPLEMENTAR O MÉTODOS EQUALS() E HASHCODE() MANUALMENTE:

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object obj){
        Usuario outroUsuario = (Usuario) obj;
        return  this.nome.equals(outroUsuario);
    }

     */


}
