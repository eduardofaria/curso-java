package br.com.cod3r.cm.visao;

import br.com.cod3r.cm.modelo.Tabuleiro;

import javax.swing.*;
import java.awt.*;

public class PainelTabuleiro extends JPanel {
    //JPanel é um container agrupador do Swing
    // Nesse caso, esse grupo (JPanel) receberá os botões que estarão na tela (JFrame).
    public PainelTabuleiro(Tabuleiro tabuleiro) {
        setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));

        int total = tabuleiro.getLinhas() * tabuleiro.getColunas();

        tabuleiro.paraCadaCampo(c -> add(new BotaoCampo(c)));

        tabuleiro.registrarObservador(e -> {
            // TODO mostrar resultado para o usuário.

        });

    }


}
