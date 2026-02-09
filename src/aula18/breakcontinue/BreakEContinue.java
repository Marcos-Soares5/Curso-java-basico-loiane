package aula18.breakcontinue;

import java.util.Scanner;

public class BreakEContinue {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Entre com um número: ");
        int num = s.nextInt();

        System.out.println("Entre com um limite");
        int max =s.nextInt();

        for (int i = num; i < max; i++) {
            if (i % 7 == 0) {
                continue;
            }
            System.out.println("O valor de i é: " + i);
        }
        //Não é utilizado no dia a dia - forma de fazer loop com linguagem de baixo nivel.
        /*for (int i = 0; i <= 4; i++){
            rotulo1:{
                rotulo2:{
                    rotulo3: {
                        if (i == 1){
                            break rotulo1;
                        }
                        if (i == 2){
                            break rotulo2;
                        }
                        if (i == 3){
                            break rotulo3;
                        }
                        System.out.println("Rotulo3");
                    }
                    System.out.println("Rotulo2");
                }
                System.out.println("Rotulo1");
            }
            System.out.println(i);
        }*/



    }
}

