package aula20.matrizes.exercicio;

import java.util.Scanner;

public class ex04 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[][] DiasHoras = new String [30][24];
        boolean continuar = true;

        String compromisso;

        while (continuar){
            System.out.println("AGENDAR COMPROMISSO - 1");
            System.out.println("CONSULTAR COMPROMISSO - 2");
            System.out.println("QUER PARAR? 0-SIM" );
            int menu = s.nextInt();

            int dia;
            int hora;


            switch (menu){
                case 1: {
                    System.out.println("Qual dia do mês você quer agendar um compromisso? ");
                    dia = s.nextInt() - 1;

                    while (dia < 0 || dia > 29) {
                        System.out.println("Dia invalido! Informe um dia valido entre 1 a 30");
                        dia = s.nextInt() - 1;
                    }

                    System.out.println("Informe a hora que deseja agendar o seu compromisso: ");
                    hora = s.nextInt() - 1;

                    while (hora < 0 || hora > 23) {
                        System.out.println("Hora invalida! Informe uma hora entre 1 a 24");
                        hora = s.nextInt() - 1;
                    }

                    s.nextLine();
                    System.out.println("Qual é o compromisso?");
                    compromisso = s.nextLine();


                    System.out.println("Dia: " + (dia+1));
                    System.out.println("hora: " + (hora+1) + "h");
                    System.out.println("Compromisso: " + compromisso);


                    ;
                    break;
                }
                case 2: ;break;
                case 0: continuar = false ;break;
            }

        }

        System.out.println("Programa encerrado!");
    }
}
