package classe;

public class PrimeiroTrauma {

    int a = 3; // resolver sem mexer nessa linha
    static int b = 4; // exemplo 2

    public static void main(String[] args) {
        PrimeiroTrauma p = new PrimeiroTrauma(); // Acessei a variável original da classe "a" instanciando ela DENTRO do metodo main (pois ele é static)
        int a = p.a; // instanciando em p, pude reatribuir o valor de "a" da classe em outra variável local.
        // "int a = 3;" não é static, logo, pertence à instância, não a classe (só se fosse static). Precisa ser instanciado para ser acessado.
        System.out.println(a); // linha original
        System.out.println(b); // exemplo 2
        // "b" pode ser acessado sem necessidade de ser instanciado pois pertence a classe (é static).
    }
}
