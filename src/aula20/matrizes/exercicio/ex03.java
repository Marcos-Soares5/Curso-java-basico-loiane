package aula20.matrizes.exercicio;

import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[][] inteiros = new int [3][3];

        //entrada
        for (int i = 0; i < inteiros.length; i++){
            for (int j = 0; j < inteiros[i].length; j++){
                System.out.println("Informe o valor da linha " + i + " e coluna " + j + " :");
                inteiros[i][j] = s.nextInt();
            }
        }

        //processamento
        int quantPar = 0;
        int quantImpar = 0;

        for (int i = 0; i < inteiros.length; i++){
            for (int j = 0; j < inteiros[i].length; j++){
                if (inteiros[i][j] % 2 == 0){
                    quantPar += 1;
                } else {
                    quantImpar += 1;
                }
            }
        }

        //saida
        for (int[] inteiro : inteiros){
            for (int inter : inteiro){
                System.out.print(inter + " - ");
            }
            System.out.println();
        }
        System.out.println("Quantidade de valores pares: " + quantPar);
        System.out.println("Quantidade de valores impares: " + quantImpar);
    }
}
