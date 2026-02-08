package aula13.exercicios;

import java.util.Scanner;

public class ex10 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double gFarenheit = 0;
        double gCelsius = 0;

        System.out.println("Qual é a temperatura em graus Celsius? ");
        gCelsius = s.nextDouble();

        gFarenheit = 32 + (gCelsius * 9 / 5) ;

        System.out.printf("Convertendo a temperatura em Celsius para graus Farenheit  é %.4f ", gFarenheit);
    }
}

