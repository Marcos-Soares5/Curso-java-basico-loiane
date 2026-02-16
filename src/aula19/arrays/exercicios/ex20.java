package aula19.arrays.exercicios;

import java.util.Scanner;

public class ex20 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Qual é cotação do dólar em R$?: ");
        double cotacaoDolar = s.nextDouble();

        double[] vetorA = new double[20];

        System.out.println("Vetor A: ");

        for (int i=0; i < vetorA.length; i++){
            vetorA[i] = cotacaoDolar * (i + 1);
            System.out.print(vetorA[i] + ", ");
        }

    }
}
