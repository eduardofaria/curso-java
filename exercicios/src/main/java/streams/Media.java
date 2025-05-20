package streams;

public class Media {

    private double total;
    private int quantidade;

    public Media adicionar(double valor) { // Ao invés de void.....
        total += valor;
        quantidade++;
        return this; // ...... retorna a própria instância atual
    }

    public double getValor (){
        return total / quantidade;
    }

    public static Media combinar(Media m1, Media m2){
        Media resultante = new Media();
        resultante.quantidade = m1.quantidade + m2.quantidade;
        resultante.total = m1.total + m2.total;
        return resultante;
    }
}
