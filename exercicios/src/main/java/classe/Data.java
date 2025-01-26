package classe;

public class Data {
    int dia;
    int mes;
    int ano;

    /*
    VALORES iniciais PADRÃO  dos Tipos:
    byte, short, int, long -> 0
    float, double -> 0.0
    boolean -> false
    char -> '\u0000'
    Objetos -> null (ou seja, "String" recebe o valor "null" por padrão na inicialização)

    "null" quer dizer: Não aponta para nenhum local/objeto  de memória.

    Variáveis locais não são inicializadas por padrão. Exeto variáveis de classe, FORA de seus metodos, essas são inicializadas com esses valores padrão.
    Variáveis criadas dentro de um constructor ou método (locais) que não forem inicializadas, não poderão ser
    utilizadas, pois não receberão valores padrão.
    Constantes (final), mesmo de classe,  precisam receber algum valor para serem usadas em métodos e contrutores.
     */

    Data (){
        dia = 1;
        mes = 1;
        ano = 1970;
        //"this." pode ser usado para chamar outro constructor (com quantidades de parâmetro diferente) de dentro desse construtor.
        //this(1, 1, 1980); //não pode chamar um constructor com o "this" fora de um constructor.
    }
    // não se deve chamar um constructor de outro constructor que o chama de volta, pois gera um looping!
    Data (int dia, int m, int a){
        this.dia = dia; // dia = dia; atribuiria o valor do parâmetro a ele mesmo. Com "this." o valor do PARÂMETRO "dia" é atribuído a VARIÁVEL "dia" da INSTÂNCIA criada.
        mes = m;
        ano = a;
    }
    //Data (final int d, int m, int a){ PARÂMETRO "d" adicionado como constante (final)

    String obterDataFormatada(){
        //obterDataFormatada() é um metodo que pertence a INSTÂNCIA (pois não é "static"), logo também pode usar o "this." para ter acesso as variáveis de instância
        //return dia + "/" + mes + "/" + ano;
        //ou
        return String.format("%d/%d/%d", this.dia, mes, ano); // se não houver conflito de nomes (parâmetro/variável), "this." é desnecessário, pois ele já sabe que se refere ao objeto atual (instanciado).
    }
    // "this." serve para apontar para o objeto atual executando o código.
    // Metodos estáticos (static) NÃO CONSEGUEM ACESSAR O "THIS."

    void imprimirDataFormatada(){
        System.out.println(this.obterDataFormatada()); //usando o metodo DA INSTÂNCIA com o "this."
    }
}
