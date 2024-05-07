import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CalcularArea ca = new CalcularArea();
        DecimalFormat df = new DecimalFormat("##,##0.0")

        int area;

        System.out.println("Qual a altura do triângulo? ");
        ca.h = sc.nextInt();

        System.out.println("Qual a base do triângulo? ");
        ca.b = sc.nextInt();

        area = ca.calculoArea();

        System.out.println("A area do triangulo é: " + df.format(area));


    }
}
