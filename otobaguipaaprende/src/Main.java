import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ConversaoDolarReal cdr = new ConversaoDolarReal();

        System.out.println("Qual o valor em dolar que deseja converter? ");
        cdr.valor = sc.nextInt();

        System.out.println("Qual a cotação do dolar? ");
        cdr.cotad = sc.nextInt();

        int vdc = cdr.ConverterValor();

        System.out.println("O valor dos dolares convertidos para real é de: " + vdc);

    }
}