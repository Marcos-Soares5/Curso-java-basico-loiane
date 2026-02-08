package aula15.switchcase.exercicios;

import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe um valor: ");
        int num = s.nextInt();

        if (num >= 0){
            System.out.println("Positivo");
        } else {
            System.out.println("Negativo");
        }
    }
}

