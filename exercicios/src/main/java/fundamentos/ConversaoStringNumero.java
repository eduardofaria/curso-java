package fundamentos;

import java.util.Locale;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("Digite número");

        String valor2 = JOptionPane.showInputDialog(
            "Digite mais um número");

        System.out.println(valor1 + valor2); // 10 + 5 mostra 105 no console, pois são strings

        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);

        System.out.printf("\nNúmeros: %f + %.2f = %.1f", numero1, numero2, (numero1 + numero2));

        //BigDecimal - tipo de número de ALTA PRECISÃO (mais lento), não vem com o java.lang, mas sim com o java.math

        System.out.println("\n" + Locale.getDefault());

        /*
        Se o seu Locale estiver configurado como "pt-BR", você pode contornar
        esse problema durante o curso utilizando a "," como separador decimal
        em vez de "." nos inputs, ou então pode alterar o Locale diretamente no
        programa. Para isso, basta importar a biblioteca java.util.Locale e adicionar
        o comando Locale.setDefault(new Locale("en", "US")); dentro da função main do
        seu programa. Para verificar qual que é a seu locale por padrão
        use System.out.println(Locale.getDefault());.
         */

    }
}
