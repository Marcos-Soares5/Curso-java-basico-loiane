package aula20.matrizes.arrayirregulares;

import java.util.Scanner;

public class MatrizIrregular {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Entre com o número de pessoas que serão entrevistadas: ");
        int numEntrevistados = s.nextInt();

        String [][] nomesFilhos = new String [numEntrevistados][];

        for (int i = 0; i < nomesFilhos.length; i++){

            System.out.println("Entre com a quantidade de filhos: ");
            int qtdFilhos = s.nextInt();

            nomesFilhos[i] = new String [qtdFilhos];

            for (int j = 0; 0 < nomesFilhos[i][j].length(); j++){
                System.out.println("Digite o nome do filho: " + (j+1));

                nomesFilhos[i][j] = s.next();

            }
        }
    }
}

