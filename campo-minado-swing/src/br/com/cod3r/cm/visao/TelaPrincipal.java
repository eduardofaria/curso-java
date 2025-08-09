package br.com.cod3r.cm.visao;

import br.com.cod3r.cm.modelo.Tabuleiro;

import javax.swing.*;

public class TelaPrincipal extends JFrame {

    public TelaPrincipal(){

        Tabuleiro tabuleiro = new Tabuleiro(16, 30, 50);
        PainelTabuleiro painelTabuleiro = new PainelTabuleiro(tabuleiro);
        // Também Poderia ter sido adicionado diretamente assim: add(new PainelTabuleiro(tabuleiro)); sem instanciar antes em painelTabuleiro.
        add(painelTabuleiro); // equivale a this.add(painelTabuleiro) já que é um construtor, painelTabuleiro está sendo adicionado no momento da instânciação.
        // Ou seja, painelTabuleiro é um JPanel (extends JPanel) que está sendo adicionado a um JFrame. Em outras palavras, um grupo de elementos sendo adicionado a tela.

        setTitle("Campo Minado");
        setSize(690, 438);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TelaPrincipal();
    }
}
