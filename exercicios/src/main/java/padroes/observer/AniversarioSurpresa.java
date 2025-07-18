package padroes.observer;

public class AniversarioSurpresa {
    public static void main(String[] args) {
        Namorada namorada = new Namorada();
        Porteiro porteiro = new Porteiro();

        //registrando interessados (subjects) do evento a lista do observador (observer)
        porteiro.registrarObservador(namorada);

        //iniciando o monitoramento das entradas no terminal
        porteiro.monitorar();


    }
}
