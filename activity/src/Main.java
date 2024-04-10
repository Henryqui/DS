import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,##0.00");

        double alt, pes;
        String sex;

        System.out.println("Qual a sua altura?");
        alt = sc.nextDouble();
        System.out.println("Qual o seu peso?");
        pes = sc.nextDouble();
        System.out.println("Qual o seu sexo? ( M = Masculino ) ( F = Feminino ) ");
        sex = sc.next();

        double pi = acharPesoIdeal(alt, pes, sex);

        System.out.println("O peso ideal para você seria: " + pi);

    }

    public static double acharPesoIdeal(double n1, double n2, String gen){
        double aux;

        if (gen.equals("F")){
            aux = (n1 * n2)-44.7;
        } else {
            aux = (n1 * n2)-58;
        }

        return aux;
    }

}