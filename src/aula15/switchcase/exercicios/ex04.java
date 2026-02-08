package aula15.switchcase.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex04 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe uma letra: ");
        String letra = s.next();

        switch (letra.toLowerCase()){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u": System.out.println("A letra é uma vogal"); break;
            default:System.out.println("A letra é uma Consoantes");
        }

    }
}

