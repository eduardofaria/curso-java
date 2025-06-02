package excecao.personalizadaB;

import excecao.Aluno;

public class TesteValidacoes {

    public static void main(String[] args) {

        /*
        // FAZ A APLICAÇÃO ENCERRAR ANTES DE CHEGAR EM "Fim :)"
            Aluno aluno = new Aluno("", -7);
            Validar.aluno(aluno);
         */

        // A APLICAÇÃO LANÇA A MENSAGEM DE ERRO, MAS CONTINUA ATÉ "Fim :)"
        try {
            Aluno aluno = new Aluno("Ana", -7); // ou new Aluno("", -7)
            Validar.aluno(aluno);
            // Validar.aluno(null); // new Aluno("Ana", 7) // IllegalArgumentException
        } catch (StringVaziaException e) { // ou apena um catch para as duas exceptions: catch (StringVaziaException | NumeroForaIntervaloException e) por terem o mesmo "tratamento"
            System.out.println(e.getMessage());
        } catch (NumeroForaIntervaloException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Validar.aluno(null); // Não é permitido fora de um bloco 'try' pois a Exception precisa ser tratada.

        System.out.println("Fim :)");

    }
}
