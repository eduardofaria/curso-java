package padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {
    private List<ObservadorChegadaAniversariante> observadores = new ArrayList<>();

    public void registrarObservador(ObservadorChegadaAniversariante obs){
        observadores.add(obs);
    }

    public void monitorar(){
        Scanner entrada = new Scanner(System.in);

        String valor = "";
        while (!"sair".equalsIgnoreCase(valor)){
            System.out.println("Aniversariante chegou?");
            valor = entrada.nextLine();
            if (valor.equalsIgnoreCase("Sim")){
                // criar o evento
                EventoChegadaAniversariante e = new EventoChegadaAniversariante(new Date());
                // notificar os observadores
                observadores.stream().forEach(obs -> {
                    obs.chegou(e);
                });

                valor = "sair";
            } else {
                System.out.println("Alarme falso!");
            }

        }

        entrada.close();
    }
}
