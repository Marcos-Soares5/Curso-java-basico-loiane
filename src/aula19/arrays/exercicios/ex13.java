package aula19.arrays.exercicios;

import java.util.Scanner;

public class ex13 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int tamanho = 15;

        int[] vetorA = new int[tamanho];

        int soma = 0;

        for (int i=0; i < vetorA.length; i++){
            vetorA[i] = (i+1);
            if (vetorA[i] % 5 == 0){
                soma += vetorA[i];
            }
        }

        System.out.println("A soma de todos o valores do valor A é: " + soma);
    }
}

