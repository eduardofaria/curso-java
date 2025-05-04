package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
    public static void main(String[] args) {
        Predicate<Integer> isPar = n -> n % 2 == 0;
        Predicate<Integer> isTresDigitos = n -> n > 99 && n < 1000;

        System.out.println(isPar.and(isTresDigitos).test(122)); // true
        System.out.println(isPar.and(isTresDigitos).test(123)); // false
        System.out.println(isPar.or(isTresDigitos).test(125)); // true
        System.out.println(isPar.and(isTresDigitos).negate().test(122)); // false
        System.out.println(isPar.and(isTresDigitos).negate().test(123)); // true
    }
}
