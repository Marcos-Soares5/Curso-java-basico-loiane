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

        boolean posicao = false;

        while(!posicao) {
            System.out.println("            VEZ DO JOGADOR " + j + "       ");
            System.out.println("Escolha a linha de 1 a 3: ");
            int linha = s.nextInt();

            while (linha < 1 || linha > 3) {
                System.out.println("Escolha invalida!");
                System.out.println("Escolha a linha de 1 a 3: ");
                linha = s.nextInt();
            }

            System.out.println("Escolha a coluna de A a C: ");
            String c = s.next();

            while (!(c.equalsIgnoreCase("A") ||
                    c.equalsIgnoreCase("B") ||
                    c.equalsIgnoreCase("C"))) {

                System.out.println("Escolha invalida!");
                System.out.println("Escolha a coluna de A a C: ");
                c = s.next();

            }

            int coluna = 0;

            switch (c.toLowerCase()){

                case "b": {
                    coluna = 1;
                } break;

                case "c": {
                    coluna = 2;
                } break;

            }

            posicao = validarPosicao(linha, coluna, simbolo);
        }


    }

    public static boolean validarPosicao (int linha, int coluna, String simbolo){

        if(escolha[linha - 1][coluna].equalsIgnoreCase(" ")){
            escolha[linha - 1][coluna] = simbolo;
            return true;

        } else {
            System.out.println("Esta posição esta sendo utilizada, escolha outra posição!");
            return false;
        }
    }

    public static boolean validarVitoria (){
        return false;
    }

    public static void jogoDaVelha () {
        System.out.println("O jogador 1 será o X");
        System.out.println("O jogador 2 será o O");

        boolean fimJogo = false;
        int vez = 1;

        while (!fimJogo) {
            tabuleiro();
            jogador(vez);
            fimJogo = validarVitoria();

            if (vez == 1 && fimJogo == false){
                vez = 2;
            } else if (vez == 2 && fimJogo == false) {
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
