package aula19.arrays.exercicios;

import java.util.Scanner;

public class ex15 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int tamanho = 10;

        int[] vetorA = {1, 2, 3, 3};

        int impar = 0;
        int par = 0;

        for(int i=0; i < vetorA.length; i++){
            if (vetorA[i] % 2 == 1){
                impar += 1;
            }
            if (vetorA[i] % 2 == 0){
                par += 1;
            }
        }

        double porcentagemPar = ((double) par/vetorA.length) * 100;
        double porcentagemImpar = ((double) impar/vetorA.length) * 100;

        System.out.println("A porcentagem de números impares no vetor é: " + porcentagemImpar + "%");
        System.out.println("A porcentagem de número pares no vetor é: " + porcentagemPar + "%");

    }
}

