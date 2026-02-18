package aula20.matrizes.exercicio;

import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int matriz[][] = new int [10][10];

        int maiorLinha5 = Integer.MIN_VALUE;
        int menorLinha5 = Integer.MAX_VALUE;
        int maiorColuna7 = Integer.MIN_VALUE;
        int menorColuna7 = Integer.MAX_VALUE;

        int linha = (5-1);
        int coluna = (7-1);

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (int) (Math.random() * 10);
                System.out.print(matriz[i][j] + " - ");
            }
            System.out.println();
        }

        for (int j = 0; j < matriz[linha].length; j++) {
            if (matriz[linha][j] > maiorLinha5){
                maiorLinha5 = matriz[linha][j];
            }
            if (matriz[linha][j] < menorLinha5){
                menorLinha5 = matriz[linha][j];
            }
        }
        //percorrer a coluna 7
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][coluna] > maiorColuna7){
                maiorColuna7 = matriz[i][coluna];
            }
            if (matriz[i][coluna] < menorColuna7){
                menorColuna7 = matriz[i][coluna];
            }
        }

        System.out.println("Maior valor da linha 5: " + maiorLinha5);
        System.out.println("Menor valor da linha 5: " + menorLinha5);
        System.out.println("Maior valor da coluna 7: " + maiorColuna7);
        System.out.println("Menor valor da coluna 7: " + menorColuna7);
    }
}

