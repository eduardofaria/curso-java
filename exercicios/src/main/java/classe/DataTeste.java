package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data data1 = new Data();
        Data data2 = new Data();

        data1.dia = 10;
        data1.mes = 12;
        data1.ano = 1997;

        data2.dia = 15;
        data2.mes = 2;
        data2.ano = 2008;

        System.out.printf("A data vai de %d/%d/%d a %d/%d/%d.\n", data1.dia, data1.mes, data1.ano, data2.dia, data2.mes, data2.ano);

        //Refatorado com metodo
        System.out.println("A data vai de " + data1.obterDataFormatada() + " a " + data2.obterDataFormatada());

    }
}
