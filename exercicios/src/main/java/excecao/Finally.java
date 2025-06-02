package excecao;

import java.util.Scanner;

public class Finally {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); // Para "entrada" ser acessado pelo finally, precisa estar FORA do "try".
        // Atualmente, essa variável poderia ser passada como argumento do "try" assim:
        // try (Scanner entrada = new Scanner(System.in)) {
        try {
            //Scanner entrada = new Scanner(System.in);
            System.out.println(7 / entrada.nextInt());
            // entrada.close(); // Se a entrada for "0" retornará o erro "/ by zero" e entrada não será fechada pois encerrará o try e irá para o catch ANTES de chegar nessa linha
            // por isso existe o finally
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finalmente...");
            entrada.close(); // A entrada tendo problema ou não sempre fechará no finally
        }
        // O FINALLY SEMPRE SERÁ EXECUTADO! Mesmo se não houver erro!

        // É possível haver um bloco com TRY (sem CATCH) e apenas com o FINALLY (que este FINALLY será chamado).

        System.out.println("Fim!");
    }
}
