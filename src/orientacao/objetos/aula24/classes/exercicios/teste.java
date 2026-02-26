package orientacao.objetos.aula24.classes.exercicios;

import java.util.Scanner;

public class teste {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //ex01
        /*lampada led = new lampada();

        led.marca = "Elgin";
        led.modelo = "Bulbo";
        led.watts = 12;
        led.lumens = 6500;
        led.tecnologia = "led";
        led.quantidade = 1;
        led.valorVenda = 8.90;

        System.out.println(led.marca);
        System.out.println(led.modelo);
        System.out.println(led.tecnologia);
        System.out.println(led.watts);
        System.out.println(led.valorVenda);*/

        //ex02
        Livro livro = new Livro();

        livro.nomeLivro = "Hábitos Atômicos";
        livro.nomeAuto = "james Clear";

        livro.genero = new String [5];
        livro.genero[0] = "Desenvolvimento pessoal";

        livro.numPaginas = 320;
        livro.peso = 370;
        livro.idioma = "Português";
        livro.editora = "Alta life";

        System.out.println(livro.nomeLivro);
        System.out.println(livro.nomeAuto);
        System.out.println(livro.genero[0]);
        System.out.println(livro.numPaginas);

    }
}
