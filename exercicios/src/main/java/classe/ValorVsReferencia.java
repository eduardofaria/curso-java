package classe;

public class ValorVsReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a; //atribuição por valor (tipo primitivo)
        a++;
        b--;
        System.out.println(a + " " + b); // 3.0 1.0

        Data d1 = new Data(1, 6, 2022);
        Data d2 = d1; // atribuição por referência (Objeto)
        d1.dia = 31;
        d2.mes = 12;

        System.out.println(d1.obterDataFormatada()); // 31/12/2022
        System.out.println(d2.obterDataFormatada()); // 31/12/2022

        voltarDataParaValorPadrao(d1);

        System.out.println(d1.obterDataFormatada()); // 1/1/1970
        System.out.println(d2.obterDataFormatada()); // 1/1/1970

        int c = 5;
        alterarPrimitivo(c);
        System.out.println(c); // Continua 5, pois o que é passado para um metodo é uma cópia do valor do primitivo, não uma instância que aponto para um endereço na memória (como ocorre com Objetos).

    }
    // um metodo static só consegue acessar outro metodo static (um metodo que pertence à classe acessando outro metodo que pertence à classe)
    static void voltarDataParaValorPadrao (Data d){
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }

    static void alterarPrimitivo (int p){
        p++;
    }
}
