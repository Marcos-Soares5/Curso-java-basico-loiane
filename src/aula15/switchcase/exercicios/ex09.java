package aula15.switchcase.exercicios;

import java.util.Scanner;

public class ex09 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("informe o numero 1, 2 e 3: ");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();

        if (num1 >= num2 && num2 >= num3) {
            System.out.println(num1 + ", " + num2 + ", " + num3 );
        } else if (num1 >= num3 && num3 >= num2) {
            System.out.println(num1 + ", " + num3 + ", " + num1 );
        } else if (num2 >= num3 && num3 >= num1) {
            System.out.println(num2 + ", " + num3 + ", " + num1 );
        } else if (num2 >= num1 && num1 >= num3) {
            System.out.println(num2 + ", " + num1 + ", " + num3 );
        } else if (num3 >= num2 && num2 >= num1) {
            System.out.println(num3 + ", " + num2 + ", " + num1 );
        } else if (num3 >= num1 && num1 >= num2) {
            System.out.println(num3 + ", " + num1 + ", " + num2);
        }
    }
}

