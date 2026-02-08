package aula11.tipos.primitivos;

public class CuriosidadeInt {

    public static void main(String[] args) {

        int var1 = 2147483647;
        int var2 = 2;

        System.out.println(var1 + var2);
        //-2.147.483.648
        //Os números do java funciona igual uma roleta, quando é atingido o limite de tipo de variável ele volta para o ínicio.
    }
}

