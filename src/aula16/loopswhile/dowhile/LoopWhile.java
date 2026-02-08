package aula16.loopswhile.dowhile;

public class LoopWhile {

    public static void main(String[] args) {

        int i = 1;
        int max = 10;

        System.out.println("Contando até " + max);

        while (i <= max) {
            System.out.println("Valor de : " + i);
            i++; //i += + 1, i = i + 1
        }

        System.out.println(i); //11

        i = 1;
        do {
            i++;
            System.out.println("valor de i: " + i);
        } while (i < max);

        System.out.println(i);
    }
}

