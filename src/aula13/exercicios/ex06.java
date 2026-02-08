package aula13.exercicios;

import java.util.Scanner;

public class ex06 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double raio = 0;
        double area = 0;

        System.out.println("Informe o raio do circulo: ");
        raio = s.nextDouble();

        area = Math.PI * Math.pow(raio, 2);

        System.out.printf("O valor da área é %.3f", area);
    }
}

