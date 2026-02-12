package aula19.arrays.exercicios;

import java.util.Scanner;

public class ex04 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int tamanho = 15;

        int[] vetorA = new int[tamanho];
        double[] vetorB = new double[tamanho];

        for (int i = 0; i < vetorA.length; i++){
            vetorA[i] = (i+1);
        }

        for (int i = 0; i < vetorA.length; i++){
            vetorB[i] = Math.sqrt(vetorA[i]);
        }

        System.out.println("Valor do vetor A" );
        for (int i=0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + ", ");
        }
        System.out.println(" ");

        System.out.println("Valor do vetor B" );
        for (int i=0; i < vetorB.length; i++){
            System.out.print(vetorB[i] + ", ");
        }
    }
}

