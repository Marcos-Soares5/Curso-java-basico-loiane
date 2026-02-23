package aula20.matrizes.exercicio;

import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[][][] mesDiasHoras = new String [12][30][8];
        boolean continuar = true;

        String compromisso;


        while (continuar){
            System.out.println("================================================================");
            System.out.println("QUER PARAR? SIM-0" );
            System.out.println("AGENDAR COMPROMISSO - 1");
            System.out.println("CONSULTAR COMPROMISSO - 2");
            System.out.println("CONSULTAR TODOS OS COMPROMISSOS - 3");
            System.out.println("================================================================");
            int menu = s.nextInt();

            int mes;
            int dia;
            int hora;

            switch (menu){
                case 0: {
                    continuar = false;
                } break;

                case 1: {
                    System.out.println("Qual mês você quer agendar um compromisso? 1 a 12 ");
                    mes = s.nextInt() - 1;

                    while (mes < 0 || mes > 11) {
                        System.out.println("Mês invalido! Informe um mês valido entre 1 a 12");
                        mes = s.nextInt() - 1;
                    }

                    System.out.println("Qual dia do mês você quer agendar um compromisso? ");
                    dia = s.nextInt() - 1;

                    while (dia < 0 || dia > 29) {
                        System.out.println("Dia invalido! Informe um dia valido entre 1 a 30");
                        dia = s.nextInt() - 1;
                    }

                    System.out.println("Informe a hora que deseja agendar o seu compromisso: ");
                    hora = s.nextInt() - 1;

                    while (hora < 0 || hora > 7) {
                        System.out.println("Hora invalida! Informe uma hora entre 1 a 8");
                        hora = s.nextInt() - 1;
                    }

                    s.nextLine();
                    System.out.println("Qual é o compromisso?");
                    compromisso = s.nextLine();


                    System.out.println("Mês: " + (mes+1));
                    System.out.println("Dia: " + (dia+1));
                    System.out.println("hora: " + (hora+1) + "h");

                    mesDiasHoras[mes][dia][hora] = compromisso;

                    System.out.println("Compromisso: " + mesDiasHoras[mes][dia][hora]);
                    System.out.println("Compromisso agendado!");
                    System.out.println();
                } break;

                case 2: {
                    System.out.println("Qual mês você quer consultar o compromisso? 1 a 12 ");
                    mes = s.nextInt() - 1;

                    while (mes < 0 || mes > 11) {
                        System.out.println("Mês invalido! Informe um mês valido entre 1 a 12");
                        mes = s.nextInt() - 1;
                    }

                    System.out.println("Qual dia do mês você quer consultar o compromisso? ");
                    dia = s.nextInt() - 1;

                    while (dia < 0 || dia > 29) {
                        System.out.println("Dia invalido! Informe um dia valido entre 1 a 30");
                        dia = s.nextInt() - 1;
                    }

                    System.out.println("Informe a hora que deseja consultar o compromisso: ");
                    hora = s.nextInt() - 1;

                    while (hora < 0 || hora > 23) {
                        System.out.println("Hora invalida! Informe uma hora entre 1 a 8");
                        hora = s.nextInt() - 1;
                    }

                    if (mesDiasHoras[mes][dia][hora] == null){
                        mesDiasHoras[mes][dia][hora] = "Não foi cadastro nenhum compromisso!";
                        System.out.println(mesDiasHoras[mes][dia][hora]);
                    } else {
                        System.out.println("Compromisso agendado no mes " + (mes+1) + " dia " + (dia+1) + " as " + (hora+1) + "h");
                        System.out.println("Compromisso: " + mesDiasHoras[mes][dia][hora]);
                    }

                    System.out.println();
                } break;

                case 3: {
                    for (int i=0; i<mesDiasHoras.length; i++){
                        for (int j=0; j<mesDiasHoras[i].length; j++){
                            for (int k=0; k<mesDiasHoras[i][j].length; k++)
                                if(mesDiasHoras[i][j][k] != null){
                                    System.out.println("No mes "+ (i+1) + " dia " + (j+1) + " as " + (k+1) + "h você tem esse compromisso abaixo:");
                                    System.out.println(mesDiasHoras[i][j][k]);
                                    System.out.println();
                                }
                        }
                    }
                } break;

                default: {
                    System.out.println("Opção inválida! Por favor, escolha 1, 2, 3 ou 0.");
                }
            }
        }

        System.out.println("Programa encerrado!");
    }
}
