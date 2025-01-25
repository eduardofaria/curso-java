package classe;

public class AreaCircTeste {
    public static void main(String[] args) {
        AreaCirc a = new AreaCirc(5.6);
        System.out.println(a.area()); //Metodo .area() pertencente a INSTÂNCIA (ao objeto criado)

        System.out.println(AreaCirc.area(8)); //Metodo .area() pertencente a CLASSE (static)
    }
}
