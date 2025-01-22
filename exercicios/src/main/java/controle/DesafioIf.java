package controle;

public class DesafioIf {
    public static void main(String[] args) {
        double nota = 1.3;

        if (nota >= 9.0) { // O ";" em "9.0);" encerrou o IF e proceguiu rodando o resto do código que não deveria rodar com notas abaixo de 9.0
            System.out.println("Quadro de Honra!");
            System.out.println("Você é fera!");
        }
    }

}
