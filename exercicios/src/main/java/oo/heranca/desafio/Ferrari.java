package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {

    private boolean ligarTurbo;
    private boolean ligarAr;

    Ferrari(){
        super(200);
        setDelta(15);
    }
    /* Ou:
    Ferrari(){
        this(200);
    }
    */

    Ferrari(int velocidadeMax) {

        super(velocidadeMax);
    }


    @Override
    public void ligarTurbo(){
        ligarTurbo = true;

    }

    @Override
    public void desligarTurbo(){
        ligarTurbo = false;
    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr = false;
    }


    @Override
    public int getDelta(){
        if(ligarTurbo && !ligarAr) {
            return 35;
        } else if (ligarTurbo && ligarAr){
            return 25;
        } else if (!ligarTurbo && !ligarAr){
            return 20;
        } else {
            return 15;
        }

    }
}
