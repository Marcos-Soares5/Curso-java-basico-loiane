package aula13.exercicios;

import java.util.Scanner;

public class ex15 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double horaTrabalhadas = 0;
        double valorHora = 0;

        System.out.println("Informe o valor da sua Hora: ");
        valorHora = s.nextDouble();

        System.out.println("Quantas horas você trabalhou no mês? ");
        horaTrabalhadas = s.nextDouble();

        double salarioBruto = valorHora * horaTrabalhadas;
        double impostoRenda = salarioBruto * 0.11 ;
        double inss = salarioBruto * 0.08 ;
        double sindicato = salarioBruto * 0.05 ;
        double salarioLiquido =  salarioBruto - (impostoRenda + inss + sindicato);


        System.out.printf("O seu salário Bruto é R$%.2f %n", salarioBruto);
        System.out.println("Você pagou ao INSS: R$" + inss);
        System.out.println("Você pagou ao Sindicato: R$" + sindicato);
        System.out.printf("O seu salário liquido é R$%.2f %n", salarioLiquido);
    }
}

