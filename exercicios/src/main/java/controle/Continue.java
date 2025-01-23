package controle;

public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            if (i % 2 == 1){
                continue; // O "continue" interrompe apenas a repetição que passa por ele e volta para o laço.
            }

            System.out.println(i);
        }

        for (int a = 0; a < 10; a++){
            if (a == 5) continue; // Quando for o 5 o "continue" impede de seguir até o println para continuar o laço na próxima contagem do FOR.
            System.out.println("Só o 5: " + a);
        }
    }
}
//CONTINUE - interrompe aquela repetição se segue com as outras repetições na fila.
//BREAK - sai totalmente do fluxo de repetição.