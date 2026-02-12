package aula19.arrays.exercicios;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int controle = 8;

        int[] vetorA = new int[controle];
        int[] vetorB = new int[controle];

        for (int i = 0; i < vetorA.length; i++){
            vetorA[i] = (i+1);
        }

        for (int i = 0; i < vetorA.length; i++){
            vetorB[i] = vetorA[i] * 2;
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

