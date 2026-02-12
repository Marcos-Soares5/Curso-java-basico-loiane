package aula19.arrays.exercicios;

import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        for (int i = 0; i < 5; i++){
            vetorA[i] = (i+1);
        }

        for (int i = 0; i < vetorA.length; i++){
            vetorB[i] = vetorA[i];
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

