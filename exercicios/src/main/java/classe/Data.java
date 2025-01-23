package classe;

public class Data {
    int dia;
    int mes;
    int ano;

    String obterDataFormatada(){
        //return dia + "/" + mes + "/" + ano;
        //ou
        return String.format("%d/%d/%d", dia, mes, ano);
    }
}
