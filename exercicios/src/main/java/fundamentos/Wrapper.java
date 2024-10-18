package fundamentos;

import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //byte
        Byte b = 100;
        Short s = 1000;
        Integer i = 10000; // int
        Integer h = Integer.parseInt("1000"); //converteu uma string para valor inteiro (int)
        Integer in = Integer.parseInt(entrada.next());
        Long l = 100000L;
        Boolean bo = Boolean.parseBoolean("true");
        Character c = '#'; // char

        Float f = 123.0F;
        Double d = 123.0;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(in * 3);

        System.out.println(bo);

        System.out.println(bo.toString().toUpperCase()); // bo.toString() é igual a ("" + bo)

        entrada.close();

    }
}
