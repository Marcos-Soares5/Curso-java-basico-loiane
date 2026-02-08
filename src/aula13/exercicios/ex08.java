package aula13.exercicios;

import java.util.Scanner;

public class ex08 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double horaTrabalhadas = 0;
        double valorHora = 0;

        System.out.println("Informe o valor da sua Hora: ");
        valorHora = s.nextDouble();

        System.out.println("Quantas horas você trabalhou no mês? ");
        horaTrabalhadas = s.nextDouble();

        double salario = valorHora * horaTrabalhadas;

        System.out.printf("O seu salário é R$%.2f", salario);
    }
}

