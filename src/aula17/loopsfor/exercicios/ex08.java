package aula17.loopsfor.exercicios;

import java.util.Scanner;

public class ex08 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double soma = 0;

        for (int i = 1; i <= 5; i++){
            System.out.println("Informe " + i + "° número: ");
            double num = s.nextDouble();
            soma += num;
        }
        System.out.println("A soma dos número foram: " + soma);
        System.out.println("A média dos número foram: " + (soma / 5));
    }
}
