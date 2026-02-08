package aula13.exercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ex04 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double [] bimestre = new double [4];
        double soma = 0;
        double media = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println("Informe a nota do " + (i + 1) + " bimestre");
            bimestre[i] = s.nextInt();
            soma += bimestre[i];

        }
        media = soma / 4;
        System.out.println("Média: " + media);
    }
}

