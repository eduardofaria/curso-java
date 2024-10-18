package fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {
        //double a = 2.3;
        String s = "Bom dia X";
        s.toUpperCase();
        System.out.println(s); //não "armazena" a alteração de s
        s = s.toUpperCase();
        System.out.println(s); //agora sim foi armazenada a modificação do método toUpperCase()

        s = s.replace("X", "Senhora");
        System.out.println(s);

        s = s.concat("!!!");
        System.out.println(s);


        System.out.println("Edu".toUpperCase());

        String y = "Bom dia X"
                        .replace("X", "Dudu")
                        .toUpperCase()
                        .concat("!!");
                        // String y = "Bom dia X".replace("X", "Dudu").toUpperCase().concat("!!");
        System.out.println(y);
    }
}

// ctrl + space = open menu to autocomplete
