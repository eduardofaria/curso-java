package padroes.observer;

public class Namorada implements ObservadorChegadaAniversariante{

    public void chegou(EventoChegadaAniversariante e) {
        System.out.println("[ " + e.getMomento() + " ]");
        System.out.println("Avisar os convidados...");
        System.out.println("Apagar as luzes...");
        System.out.println("Esperar em silêncio...");
        System.out.println("Surpresa!!!!");
    }
}
