import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CalcularSoma cc, ca ;
        cc = new CalcularSoma(); //instanciação da classe calcular soma

        int soma;


        System.out.println(" Informe o valor de a: ");
        cc.a = sc.nextInt();

        System.out.println(" Informe o valor de b: ");
        cc.b = sc.nextInt();

        System.out.println(" Informe o valor de c: ");
        cc.c = sc.nextInt();

        soma = cc.somarValores();

        System.out.println(" A soma é " + soma);

        ca = new CalcularSoma();

        System.out.println(" Informe o valor de d: ");
        ca.a = sc.nextInt();

        System.out.println(" Informe o valor de e: ");
        ca.b = sc.nextInt();

        System.out.println(" Informe o valor de f: ");
        ca.c = sc.nextInt();

        soma = ca.somarValores();

        System.out.println(" A soma é " + soma);
    }
}