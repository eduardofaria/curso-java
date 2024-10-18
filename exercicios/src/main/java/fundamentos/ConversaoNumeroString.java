package fundamentos;

public class ConversaoNumeroString {
    public static void main(String[] args) {
        
        // Forma 1
        Integer num1 = 10000;
        System.out.println(num1.toString().length());

        // Forma 2
        int num2 = 100000;
        System.out.println(Integer.toString(num2).length());

        // Long.toString(i)

        //Forma não recomendada
        System.out.println(("" + num1).length());
        System.out.println(("" + num2).length());
    }
}
