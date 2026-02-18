package aula20.matrizes.exercicio;

import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[][] matriz = new int [4][4];
        int maiorNumero = Integer.MIN_VALUE;
        String posicao = "";

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (int) (Math.random() * 10);
                if ( matriz[i][j] > maiorNumero){
                    maiorNumero = matriz[i][j];
                    posicao = "(" + i + "," + j + ")";
                }
            }
        }

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print( matriz[i][j] + " - " );
            }
            System.out.println();
        }

        System.out.println("O maior número da Matriz é: " + maiorNumero);
        System.out.println("Posição do Maior número: " + posicao);
    }
}

