package aula13.exercicios;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double gFarenheit = 0;
        double gCelsius = 0;

        System.out.println("Qual é a temperatura em graus Farenheit? ");
        gFarenheit = s.nextDouble();

        gCelsius = 5 * (gFarenheit - 32) / 9;

        System.out.printf("Convertendo a temperatura em Farenheit para graus Celsius  é %.4f° ", gCelsius);
    }
}

