package aula15.switchcase.exercicios;

import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        System.out.println("Informe a nota 1:");
        double nota1 = s.nextDouble();
        System.out.println("Informe a nota 2:");
        double nota2 = s.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 10) {
            System.out.println("Aprovado com Distinção");
        }else if (media >= 7){
            System.out.println("Aprovado");
        } else if (media < 7) {
            System.out.println("Reprovado");
        }
    }
}

