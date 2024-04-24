import java.text.DecimalFormat;

public class Bhaskara {

    public double a;
    public double b;
    public double c;

    public double delta;

    public double deltaDaEquacao() {
        double aux;

        aux =  (Math.pow(b , 2) - (4 * a * c));

        return aux;

    }

    public void checarDelta(){
        double x1, x2;
        DecimalFormat df = new DecimalFormat("###,##0.00");

        if (delta<0){

            imprimir("Não existem raizes reais!");

        }
        else {

            x1 =  (-b + Math.sqrt(delta))/(2 * a);
            x2 = (-b - Math.sqrt(delta))/(2 * a);

            imprimir(" Esse é o valor do x1: " + df.format(x1));
            imprimir (" Esse é o valor do x2: " + df.format(x2));
        }
    }


    public void imprimir (String msg){
        System.out.println(msg);
    }
}
