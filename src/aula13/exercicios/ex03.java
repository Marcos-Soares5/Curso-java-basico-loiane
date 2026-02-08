package aula13.exercicios;

import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("informe o numero 1: ");
        int num1 = s.nextInt();

        System.out.println("informe o numero 2: ");
        int num2 = s.nextInt();

        System.out.printf("A soma dos números %d + %d = %d",num1, num2, (num1 + num2));
    }
}

