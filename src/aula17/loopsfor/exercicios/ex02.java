package aula17.loopsfor.exercicios;

import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        String nome = s.next();;

        System.out.println("Crie uma senha: ");
        String senha = s.next();

        while (senha.equalsIgnoreCase(nome)){
            System.out.println("Senha invalida! A senha não pode ser igual ao seu nome. Informe uma senha correta.");
            senha = s.next();
        }

        System.out.println("Senha valida!");
    }
}
