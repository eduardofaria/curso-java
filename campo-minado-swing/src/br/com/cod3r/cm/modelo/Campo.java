package br.com.cod3r.cm.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class Campo {
    private final int linha;
    private final int coluna;

    private boolean aberto; // implicitamente começa como false
    private boolean minado = false; // explicitamente começa como false
    private boolean marcado;

    private List<Campo> vizinhos = new ArrayList<>();
    private List<CampoObservador> observadores = new ArrayList<>(); // Ao invés de List poderia ser um Set para evitar duplicações de itens
    // Usando interfaces funcionais já existentes (BiConsumer<T,U>):
    private List<BiConsumer<Campo, CampoEvento>> observadores2 = new ArrayList<>();

    Campo(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }

    public void registrarObservadores(CampoObservador obs){
        observadores.add(obs);
    }

    public void notificarObservadores(CampoEvento e){
        observadores.stream().forEach((obs) -> obs.eventoOcorreu(this, e) );
    }

    boolean adicionarVizinho(Campo vizinho) {
        boolean linhaDiferente = linha != vizinho.linha;
        boolean colunaDiferente = coluna != vizinho.coluna;
        boolean diagonal = linhaDiferente && colunaDiferente;

        int deltaLinha = Math.abs(linha - vizinho.linha);
        int deltaColuna = Math.abs(coluna - vizinho.coluna);
        int deltaGeral = deltaLinha + deltaColuna;

        if (deltaGeral == 1 && !diagonal) {
            vizinhos.add(vizinho);
            return true;
        } else if (deltaGeral == 2 && diagonal) {
            vizinhos.add(vizinho);
            return true;
        } else {
            return false;
        }
    }

    void alternarMarcacao() {
        if (!aberto) {
            marcado = !marcado;
            if(marcado){
                notificarObservadores(CampoEvento.MARCAR);
            } else {
                notificarObservadores(CampoEvento.DESMARCAR);
            }
        }
    }

    boolean abrir() {
        if (!aberto && !marcado) {
            if (minado) {
                // TODO Implementar nova versão
                notificarObservadores(CampoEvento.EXPLODIR); // Implementado
                return true;
            }
            setAberto(true);
            notificarObservadores(CampoEvento.ABRIR);

            if (vizinhancaSegura()) {
                vizinhos.forEach(v -> v.abrir());
            }
            return true;
        } else {
            return false;
        }
    }

    boolean vizinhancaSegura() {
        return vizinhos.stream().noneMatch(v -> v.minado);
    }

    public boolean isMarcado() {
        return marcado;
    }

    void setAberto(boolean aberto) {
        this.aberto = aberto;
        if(aberto){
            notificarObservadores(CampoEvento.ABRIR);
        }
    }

    public boolean isAberto(){
        return aberto;
    }

    public boolean isMinado() {
        return minado;
    }

    void minar() {
        minado = true;
    }

    public int getColuna() {
        return coluna;
    }

    public int getLinha() {
        return linha;
    }

    boolean objetivoAlcancado(){
        boolean desvendado = !minado && aberto;
        boolean protegido = minado && marcado;
        return desvendado || protegido;
    }

    long minasNaVizinhanca(){
        return vizinhos.stream().filter(c -> c.minado).count();
    }

    void reiniciar(){
        aberto = false;
        minado = false;
        marcado = false;
    }

}
