package aula15.switchcase.exercicios;

import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe  F para Feminino ou M para Masculino: ");
        String sexo = s.next();

        if(sexo.equalsIgnoreCase("F")){
            System.out.println("Você informou F de Feminino.");
        } else if(sexo.equalsIgnoreCase("M")) {
            System.out.println("Você informou M de Masculino.");
        } else {
            System.out.println("Sexo invalido!");
        }
    }
}

