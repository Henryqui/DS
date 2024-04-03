import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c, big;


        System.out.println(" Insira o primeiro número: ");
        a = sc.nextInt();

        System.out.println(" Insira o segundo número: ");
        b = sc.nextInt();

        System.out.println(" Insira o terceiro número: ");
        c = sc.nextInt();

        System.out.println("----------------------------------------");

        big = acharMaior(a, b, c);

        mostrarAchado(big);
    }

    public static int acharMaior(int z, int y, int x){
                 int aux;

            if( z < x && y < x){
                aux = x;
             } else if (y < z && x < z){
                aux = z;
             } else {
                aux = y;
            }

            return aux;
        }

        return aux;
    }

    public static void mostrarAchado(int maior){
        System.out.println("O número maior é o: " + maior );
    }
}
