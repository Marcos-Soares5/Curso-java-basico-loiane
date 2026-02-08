package aula17.loopsfor.exercicios;

import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe uma nota entre 0 e 10: ");
        int num = s.nextInt();

        while (num < 0 || num > 10) {
            System.out.println("Numero invalido! informe um numero valido: ");
            num = s.nextInt();
        }

        System.out.println("Número valido! ");


        System.out.println("teste");
    }
}

