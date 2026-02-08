package aula15.switchcase.exercicios;

import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o numero 1: ");
        int num1 = s.nextInt();
        System.out.println("Informe o numero 2: ");
        int num2 = s.nextInt();

        if (num1 > num2){
            System.out.println("O numero 1 é o maior");
        } else if (num1 < num2) {
            System.out.println("O numero 2 é o maior");
        } else {
            System.out.println("Os números são iguais");
        }
    }
}

