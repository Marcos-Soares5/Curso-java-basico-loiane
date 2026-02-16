package aula19.arrays.exercicios;

import java.util.Scanner;

public class ex19 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int tamanho = 2;

        String[] aluno = new String[tamanho];
        double[] nota1 = new double[tamanho];
        double[] nota2 = new double[tamanho];
        double[] result = new double[tamanho];
        String[] situacao = new String[tamanho];

        for (int i=0; i < aluno.length; i++){
            System.out.println("Qual é o nome do " + (i+1) + " aluno?");
            aluno[i] = s.next();
            //validar nome
            while (aluno[i].trim().length() < 4){
                System.out.println("Nome do aluno " + (i+1) + " invalido! Informe um nome valido: ");
                aluno[i] = s.next();
            }

            System.out.println("Informe o valor da NOTA do 1° bimestre: ");
            nota1[i] = s.nextDouble();
            //validar nota1
            while (nota1[i] < 0 || nota1[i] > 10) {
                System.out.println("Nota do aluno " + (i+1) + " invalida! Informe uma nota valida: ");
                nota1[i] = s.nextDouble();
            }

            System.out.println("Informe o valor da NOTA do 2° bimestre: ");
            nota2[i] = s.nextDouble();
            //validar nota2
            while (nota2[i] < 0 || nota2[i] > 10) {
                System.out.println("Nota do aluno " + (i+1) + " invalida! Informe uma nota valida: ");
                nota2[i] = s.nextDouble();
            }

            result[i] = (nota1[i] + nota2[i]) / 2;

            if (result[i] >= 7) {
                situacao[i] = "APROVADO!";
            } else {
                situacao[i] = "REPROVADO!";
            }
        }

        for (int i=0; i < aluno.length; i++){
            System.out.println("=========== ALUNO " + (i+1) + " ===========");
            System.out.println("Nome: " + aluno[i]);
            System.out.println("Nota 1: " + nota1[i]);
            System.out.println("Nota 2: " + nota2[i]);
            System.out.println("Média Bimestral " + result[i]);
            System.out.println("Situação: " + situacao[i]);
        }
    }
}
