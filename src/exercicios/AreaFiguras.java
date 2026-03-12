package exercicios;



import java.util.Scanner;
import java.text.DecimalFormat;

public class AreaFiguras {
    static Scanner s = new Scanner(System.in);
    static DecimalFormat f = new DecimalFormat("0.00");

    public static double areaQuadrado (double l){

        return Math.pow(l, 2);

    }

    public static double areaRetangulo (double base, double altura){

        return base * altura;
    }

    public static double areaCirculo (double r){

        return Math.PI * Math.pow(r, 2);

    }

    public static double areaTriangulo (double lado1, double lado2, double lado3){

        double s;

        s = (lado1 + lado2 + lado3) / 2;

        return Math.sqrt(s * (s - lado1) * (s - lado2) *  (s - lado3));

    }

    public static void main(String[] args) {
        s.useDelimiter("[;\\s]+");

        double quadrado = 0;
        double retangulo = 0;
        double circulo = 0;
        double triangulo = 0;

        while (s.hasNext()){
            String figura = s.next();

            switch (figura.toUpperCase()) {

                case "Q":
                    double lado = s.nextDouble();
                    quadrado = areaQuadrado(lado);
                    System.out.println(f.format(quadrado));
                    break;
                case "R":
                    double base = s.nextDouble();
                    double altura = s.nextDouble();
                    retangulo = areaRetangulo(base, altura);
                    System.out.println(f.format(retangulo));
                    break;
                case "C":
                    double raio = s.nextDouble();
                    circulo = areaCirculo(raio);
                    System.out.println(f.format(circulo));
                    break;
                case "T":
                    double lado1 = s.nextDouble();
                    double lado2 = s.nextDouble();
                    double lado3 = s.nextDouble();
                    triangulo = areaTriangulo(lado1, lado2, lado3);
                    System.out.println(f.format(triangulo));
                    break;
            }
        }
        s.close();

    }
}

