package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

    Ana mae = new Ana();
    Pedro mae2 = new Pedro();
    void testeAcessos (){
        /// System.out.println(mae.segredo);
        //System.out.println(mae.facoDentroDeCasa); // fora do pacote não é acessível, mesmo que por herança.
        System.out.println(mae.formaDeFalar); // default, Fora do pacote, PROTECTED não acessa por herança uma instância da SUPER Classe MAS:
        System.out.println(mae2.formaDeFalar); // Acessa por herança uma instância de si mesmo com o que foi herdado da SUPER Classe, não por composição.
        System.out.println(formaDeFalar); // OU pode acessar diretamente, sem necessidade de instanciar, pois é herdado da SUPER Classe.
        System.out.println(todosSabem); // public Acessado diretamente
        System.out.println(mae.todosSabem); // public Acessado diretamente

        // protected -> é acessível por HERANÇA não por INSTÂNCIA.
    }

    //segredo
    //facoDentroDeCasa
    //formaDeFalar
    //todosSabem
}
