package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EquacaoSegundoGrau {

    public static double CalculaDelta (double a, double b, double c){

        return Math.pow(b, 2) - 4 * a * c;

    }


    public static void main (String[]args){
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner s = new Scanner(System.in);

        double a;
        double b;
        double c;

        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();

        double delta = CalculaDelta(a, b, c);

        double x1;
        double x2;

        if (delta == 0){
            x1 = (-b + Math.sqrt(delta)) / (2 * a);

            System.out.println(df.format(x1));

        } else if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println(df.format(x1) + ";" + df.format(x2));
        } else {
            System.out.println("Sem raiz real");
        }
    }

}

