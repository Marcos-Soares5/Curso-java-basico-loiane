package exercicios;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[][] matriz = new int[5][5];
        int quartaLinha = 0;
        int segundaColuna = 0;
        int diagonalPrincipal = 0;
        int diagonalSecudaria = 0;
        int todosElementos = 0;


        for (int i = 0; i < matriz.length; i++) {

            String linha = s.nextLine();

            String[] valores = linha.split(";");

            for (int j = 0; j < 5; j++) {

                matriz[i][j] = Integer.parseInt(valores[j].trim());

            }
        }

        int cont = (matriz.length - 1);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (i == 3){
                    quartaLinha += matriz[i][j];
                }

                if (j == 1){
                    segundaColuna += matriz[i][j];
                }

                if (i == j){
                    diagonalPrincipal += matriz[i][j];
                }

                todosElementos += matriz[i][j];
            }

            diagonalSecudaria += matriz[i][cont];
            cont -= 1;
        }


        System.out.println(quartaLinha);
        System.out.println(segundaColuna);
        System.out.println(diagonalPrincipal);
        System.out.println(diagonalSecudaria);
        System.out.println(todosElementos);
    }
}


