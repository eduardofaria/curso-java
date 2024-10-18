package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {
        double a = 1; // implícita
        System.out.println(a);

        float b = (float) 1.123456788888; // explícita (CAST)
        System.out.println(b);

        int c = 4; // se usar 128 (1 além do máx valor de byte, que é 127, o valor convertido reinicia lá em -127)
        // byte d = c; ERRO: c int não cabe em d byte
        byte d = (byte) c;
        System.out.println(d);
    }
}
