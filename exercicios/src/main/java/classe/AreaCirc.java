package classe;

public class AreaCirc {
    double raio;
    static final double PI = 3.14; // final - modificador que define uma CONSTANTE
    // pode ser "static final" ou "final static", tanto faz.
    //Convenção nome de constante ser MAIÚSCULO (de pi para PI).

    AreaCirc (double raioInicial) {
        raio = raioInicial;
    }

    double area () {
        return PI * Math.pow(raio, 2); //(raio * raio)
    }

    static double area (double r) { // criando metodo estático para calcular área sem precisar instanciar um objeto
        return PI * Math.pow(r, 2);
    }
}
