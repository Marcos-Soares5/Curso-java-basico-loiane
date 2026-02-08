package aula17.loopsfor;

public class LoopFor {

    public static void main(String[] args) {

        //for normal
        for (int i = 0; i < 5 ; i++){
            System.out.println("i tem valor: " + i);
        }

        for (int i = 5; i > 0 ; i--){
            System.out.println("i tem valor: " + i);
        }
        //for com mais de uma variavel
        for (int i = 0, j = 10; i < j ; i++, j--){
            System.out.println("i = " + i + "; j = " + j);
        }

        //for partes ausentes
        int i = 0;
        for(; i < 6; ){
            System.out.println("Valor de i: " + i);
            i += 2;
        }
        //incremento diferente
        for (int cont = 0; cont < 10; cont += 2){
            System.out.println("valor do cont " + cont);
        }

        //loop infinito
        /*for (;; )
            System.out.println("teste");*/

        //loop sem corpo
        int soma = 0;
        for (int j = 1; j < 5 ; soma += j++)
            System.out.println();
        System.out.println("O valor da soma é: " + soma);

        for (int count = 0; i < 5 ; count++)
            System.out.println("i tem valor: " + count);



    }
}

