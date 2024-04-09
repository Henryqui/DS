import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,##0.00");

        int a, b, c ;
        double x1, x2, delta;

        System.out.print("Insira a quantidade de x^2: ");
        a = sc.nextInt();
        System.out.print("Insira a quantidade de x: ");
        b = sc.nextInt();
        System.out.print("Insira o valor de c: ");
        c = sc.nextInt();

        delta = deltaDaEquacao(a, b, c);
        if (delta<0){
            System.out.println("Não existem raizes reais!");
        } else {
            x1 = xValue1(delta, b, a);
            x2 = xValue2(delta, a, b);

            System.out.println(" Esse é o valor do x1: " + df.format(x1));
            System.out.println(" Esse é o valor do x2: " + df.format(x2));

        }


    }

    public static double deltaDaEquacao(int a, int b, int c) {
        double aux;

        aux =  (Math.pow(b , 2) - (4 * a * c));

        return aux;

    }

    public static double xValue1(double delta, int b, int a ) {
        double aux ;

        aux = (-b + Math.sqrt(delta))/2 * a;

        return aux;
    }

    public static double xValue2(double delta, int a, int b ) {
        double aux ;

        aux = (-b - Math.sqrt(delta))/2 * a;

        return aux;
    }

}