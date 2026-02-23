package aula20.matrizes.exercicio;

import java.util.Scanner;

public class ex06 {
    static Scanner s = new Scanner(System.in);

    static String[][] escolha = {{" "," "," "}, {" "," "," "}, {" "," "," "}};

    public static void tabuleiro (){

        String[][] p = escolha;

        System.out.println("\n" +
                                  "   A "   +       " B "  +      " C "   + "\n" +
                            "1  " + p[0][0] +"  "+ p[0][1] +"  "+ p[0][2] + "\n" +
                            "2  " + p[1][0] +"  "+ p[1][1] +"  "+ p[1][2] + "\n" +
                            "3  " + p[2][0] +"  "+ p[2][1] +"  "+ p[2][2]          );

    }

    public static void jogador (int j){

        String simbolo = "";

        if (j == 1){
            simbolo = "X";
        } else if (j == 2){
            simbolo = "O";
        }

        System.out.println("            VEZ DO JOGADOR " + j + "       ");
        System.out.println("Escolha a linha de 1 a 3: ");
        int linha = s.nextInt();

        while (linha < 1 || linha > 3){
            System.out.println("Escolha invalida!");
            System.out.println("Escolha a linha de 1 a 3: ");
            linha = s.nextInt();
        }

        System.out.println("Escolha a coluna de A a C: ");
        String coluna = s.next();

        while ( !(coluna.equalsIgnoreCase("A") ||
                coluna.equalsIgnoreCase("B") ||
                coluna.equalsIgnoreCase("C")) ){

            System.out.println("Escolha invalida!");
            System.out.println("Escolha a coluna de A a C: ");
            coluna = s.next();

        }

        switch (coluna.toLowerCase()){
            case "a": {
                escolha[linha - 1][0] = simbolo;
            } break;

            case "b": {
                escolha[linha - 1][1] = simbolo;
            } break;

            case "c": {
                escolha[linha - 1][2] = simbolo;
            } break;

        }
    }

    public static void jogoDaVelha () {
        System.out.println("O jogador 1 será o X");
        System.out.println("O jogador 2 será o O");

        boolean fimJogo = false;
        int vez = 1;

        while (!fimJogo) {
            tabuleiro();
            jogador(vez);

            if (vez == 1){
                vez = 2;
            } else {
                vez = 1;
            }
        }

    }

    public static void main(String[] args) {

        boolean continuar = true;
        int menu;

        while(continuar){
            System.out.println("======================================");
            System.out.println("                 MENU                 ");
            System.out.println("======================================");
            System.out.println("1 - INICIAR O JOGO DA VELHA");
            System.out.println("0 - SAIR DO JOGO ");
            System.out.println("======================================");
            System.out.print("Escolha uma opção: ");
            menu = s.nextInt();
            System.out.println();

            switch (menu){
                case 1: {
                        jogoDaVelha ();
                } break;
                case 0: {
                    continuar = false;
                } break;
            }
        }
        System.out.println("JOGO ENCERRADO!");
    }
}
