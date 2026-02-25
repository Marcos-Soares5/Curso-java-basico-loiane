package aula20.matrizes.exercicio;

import java.util.Scanner;

public class ex06 {
    static Scanner s = new Scanner(System.in);

    static String[][] escolha;

    static boolean continuar = true;

    public static void tabuleiro (){

        String[][] p = escolha;

        System.out.println("\n" +
                "   A "   +       " B "  +      " C "   + "\n" +
                "1  " + p[0][0] +"  "+ p[0][1] +"  "+ p[0][2] + "\n" +
                "2  " + p[1][0] +"  "+ p[1][1] +"  "+ p[1][2] + "\n" +
                "3  " + p[2][0] +"  "+ p[2][1] +"  "+ p[2][2]          );

    }

    public static void jogador (int j, String XouO){

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

            posicao = validarPosicao(linha, coluna, XouO);
        }


    }

    public static boolean validarPosicao (int linha, int coluna, String XouO){

        if(escolha[linha - 1][coluna].equalsIgnoreCase(" ")){
            escolha[linha - 1][coluna] = XouO;
            return true;

        } else {
            System.out.println("Esta posição esta sendo utilizada, escolha outra posição!");
            return false;
        }
    }

    public static boolean validarVitoria (int vez, String XouO){

        //verificar linhas
        for (int i=0; i < escolha.length; i++){
            if (escolha[i][0].equalsIgnoreCase(XouO) &&
                escolha[i][1].equalsIgnoreCase(XouO) &&
                escolha[i][2].equalsIgnoreCase(XouO))  {

                tabuleiro();
                System.out.println("Jogador " + vez + " ganhou! Linha " + (i+1) + " completa.");
                return true;
            }
        }
        //verificar coluna
        for (int i=0; i < escolha.length; i++){
            if (escolha[0][i].equalsIgnoreCase(XouO) &&
                escolha[1][i].equalsIgnoreCase(XouO) &&
                escolha[2][i].equalsIgnoreCase(XouO))  {

                tabuleiro();
                System.out.println("Jogador " + vez + " ganhou! Coluna " + (i+1) + " completa.");

                return true;
            }
        }
        //verificar diagonal
        if (escolha[0][0].equalsIgnoreCase(XouO) &&
            escolha[1][1].equalsIgnoreCase(XouO) &&
            escolha[2][2].equalsIgnoreCase(XouO))  {

            tabuleiro();
            System.out.println("Jogador " + vez + " ganhou! Diagonal completa.");

            return true;
        }
        //verificar diagonal
        if (escolha[0][2].equalsIgnoreCase(XouO) &&
            escolha[1][1].equalsIgnoreCase(XouO) &&
            escolha[2][0].equalsIgnoreCase(XouO))  {

            tabuleiro();
            System.out.println("Jogador " + vez + " ganhou! Diagonal completa.");

            return true;
        }

        return false;
    }

    public static boolean validarEmpate(){

        int empate = 0;

        for (int i=0; i < escolha.length; i++){
            for (int j=0; j < escolha[i].length; j++){
                if (escolha[i][j] != " "){
                    empate += 1;
                }
            }
        }

        if (empate == 9){
            tabuleiro();
            System.out.println("JOGO EMPATADO!");
            return true;
        }

        return false;
    }

    public static void jogoDaVelha() {
        System.out.println("O jogador 1 será o X");
        System.out.println("O jogador 2 será o O");
        escolha = new String[][] {{" "," "," "},
                                  {" "," "," "},
                                  {" "," "," "} };

        boolean fimJogo = false;

        int vez = 1;
        String simbolo = "X";

        while (!fimJogo) {
            tabuleiro();
            jogador(vez, simbolo);
            fimJogo = validarVitoria(vez, simbolo);

            if (!fimJogo){

                fimJogo = validarEmpate();

                //alterar do jogador 1 para o 2 ou 2 para 1
                if (vez == 1){
                    vez = 2;
                    simbolo = "O";
                } else if (vez == 2){
                    vez = 1;
                    simbolo = "X";
                }
            }
        }

        int num;

        do {
            System.out.println("1 - Voltar para o menu \n" + "0 - Encerrar o jogo");
            num = s.nextInt();
        } while (num < 0 || num > 1);

        switch (num){
            case 1: continuar = true; break;
            case 0: continuar = false; break;
        }

    }

    public static void main(String[] args) {

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
