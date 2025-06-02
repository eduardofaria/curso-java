package excecao;

public class Basico {

    public static void main(String[] args) {

        Aluno a1 = null;

        try {
            imprimirNomeDoAluno(a1);
        } catch (Exception e) {// Exceção mais genérica
            System.out.println("Ocorreu um erro no momento de imprimir o nome do usuário: " + e);
        }

        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException e) { // Exceção mais específica
            //e.printStackTrace();
            System.out.println("Ocorreu o erro: " + e.getMessage()); // NullPointerException (erro acima) não tem mensagem, por isso não adianta usar .getMessage()
        }

        // A forma (não recomendada) de silenciar um erro é colocar a ação dentro de um try{} mas com um catch (Exception e){} vazio.

        System.out.println("Fim :)"); // Linha é exibida após tratamento dos erros acima, pois esses erros não tratados encerravam a aplicação antes de chegar aqui.
    }

    public static void imprimirNomeDoAluno(Aluno aluno){
        System.out.println(aluno.nome);
    }
}
