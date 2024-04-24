import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,##0.00");
        Bhaskara bh = new Bhaskara();




        System.out.print("Insira a quantidade de x^2: ");
        bh.a = sc.nextInt();
        System.out.print("Insira a quantidade de x: ");
        bh.b = sc.nextInt();
        System.out.print("Insira o valor de c: ");
        bh.c = sc.nextInt();

        bh.delta = bh.deltaDaEquacao();

        bh.checarDelta();

    }


}