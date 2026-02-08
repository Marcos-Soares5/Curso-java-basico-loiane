package aula13.exercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ex12 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe a sua altura em metros: ");
        float altura = s.nextFloat();

        double pesoIdeal = (72.7 * altura) - 58;

        System.out.printf("O seu peso ideal é: %.2fkg ", pesoIdeal);

    }
}

