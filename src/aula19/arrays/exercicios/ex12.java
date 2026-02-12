package aula19.arrays.exercicios;

import java.util.Scanner;

public class ex12 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int tamanho = 5;

        int[] vetorA = new int[tamanho];

        int soma = 0;

        for (int i=0; i < vetorA.length; i++){
            vetorA[i] = (i+1);
            soma += vetorA[i];
        }

        System.out.println("A soma de todos o valores do valor A é: " + soma);

    }
}

