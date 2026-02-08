package aula15.switchcase.exercicios;

import java.util.Scanner;

public class ex07 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("informe o numero 1, 2 e 3: ");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("O numero 1 é o maior");
        } else if (num2 > num3 && num2 > num1){
            System.out.println("O numero 2 é o maior");
        } else if (num3 > num2 && num3 > num1){
            System.out.println("O numero 3 é o maior");
        }

        if (num1 < num2 && num1 < num3){
            System.out.println("O numero 1 é o menor");
        } else if (num2 < num3 && num2 < num1){
            System.out.println("O numero 2 é o menor");
        } else if (num3 < num2 && num3 < num1) {
            System.out.println("O numero 3 é o menor");
        }
    }
}

