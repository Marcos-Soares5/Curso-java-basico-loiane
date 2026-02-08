package aula13.exercicios;

import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double metros = 0;
        double centimetros = 0;

        System.out.println("Informe o metro: ");
        metros = s.nextDouble();

        centimetros = metros * 100;

        System.out.printf("O valor informado em centímetros é %fcm", centimetros);

    }
}

