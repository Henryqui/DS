import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,##0.00");

        int x1, x2, y1, y2;
        double d;

        System.out.println("Insira o valor do x do ponto 1: ");
        x1 = sc.nextInt();
        System.out.println("Insira o valor do x do ponto 2: ");
        x2 = sc.nextInt();
        System.out.println("Insira o valor do y do ponto 1: ");
        y1 = sc.nextInt();
        System.out.println("Insira o valor do y do ponto 2: ");
        y2 = sc.nextInt();

        d = calculoDistancia(x1,x2,y1,y2);

        System.out.println(" A distância dos pontos é de: " + df.format(d));
    }

    public static double calculoDistancia(int a, int a1, int b, int b1){
        double aux;

        aux = Math.sqrt( (Math.pow(a1 - a, 2) + Math.pow(b1 - b, 2) ));

        return aux;


    }
}