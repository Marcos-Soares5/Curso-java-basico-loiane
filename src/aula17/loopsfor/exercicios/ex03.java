package aula17.loopsfor.exercicios;

import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double salario;

        System.out.println("Informe o seu nome: ");
        String nome = s.next();;

        while (nome.trim().length() < 4){
            System.out.println("Nome invalido!");
            System.out.println("Informe um nome valido: ");
            nome = s.next();
        }

        System.out.println("Informe a sua idade: ");
        int idade = s.nextInt();

        while (idade < 0 || idade > 150) {
            System.out.println("Idade incorreta! ");
            System.out.println("Informe uma idade valida: ");
            idade = s.nextInt();
        }

        do {
            System.out.println("Informe o seu Salário: ");
            salario = s.nextDouble();
        } while (salario <= 0);




    }
}
