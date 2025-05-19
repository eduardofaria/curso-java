package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class DesafioMap {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2 , 3, 4, 5, 6, 7, 8, 9);

        // 1
        Function<Integer, String> intToBiStr = n -> Integer.toBinaryString(n);

        // 2
            //2.1
        UnaryOperator<String> inverter = s -> { // Fiz esse for antes de conhecer o StringBuilder
            String inverso = "";
            for (int i = (s.length() - 1); i >= 0; i--){
                inverso += s.charAt(i) + "";
            }
            return inverso;
        };
            //2.2
        UnaryOperator<String> inverter2 = s -> {
            String inverso = new StringBuilder(s).reverse().toString();
            return inverso;
        };
            // 2.3
        UnaryOperator<String> inverter3 = s -> new StringBuilder(s).reverse().toString(); // Menos verboso que inverter2

        // 3
        Function<String, Integer> BiStringToInt = s -> Integer.parseInt(s, 2); // Base 2 (binário)


        // Teste
        System.out.println(intToBiStr.andThen(inverter).andThen(BiStringToInt).apply(6));
        System.out.println("\n------------");
        // Resposta
            //Professor
        nums.stream()
                .map(Integer::toBinaryString)
                .map(inverter3)
                .map(BiStringToInt)
                .forEach(System.out::println);

        System.out.println("\n------------");

            //Ninha
        Stream<Integer> resposta = nums.stream()
                .map(intToBiStr)
                .map(inverter)
                .map(BiStringToInt);

        resposta.forEach(System.out::print);





        /*
        1 - Numero para string binária... 6 => "110"
        2 - Inverter a string... "110" => "011"
        3 - Converter de volta para inteiro => "011" => 3
         */
    }
}
