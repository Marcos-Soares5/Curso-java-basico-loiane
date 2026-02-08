package aula13.exercicios;

import java.util.Scanner;

public class ex11 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        double num3 = 0;

        double valorA = 0;
        double valorB = 0;
        double valorC = 0;

        System.out.println("informe o valor do 1° numero inteiro");//2
        num1 = s.nextInt();
        System.out.println("informe o valor do 2° numero inteiro");//2
        num2 = s.nextInt();
        System.out.println("informe o valor do 3° numero real"); //2
        num3 = s.nextDouble();

        valorA = (num1 * 2) * ((double)num2 / 2); //4
        valorB = (num1 * 3) + num3; //8
        valorC = Math.pow(num1, 3);

        System.out.println("O produto do dobro do primeiro com metade do segundo é: " + valorA);
        System.out.println("A soma do triplo do primeiro com o terceiro é: " + valorB);
        System.out.println("O terceiro elevado ao cubo é: " + valorC);
    }
}

