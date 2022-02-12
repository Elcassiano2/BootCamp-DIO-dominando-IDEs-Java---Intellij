package br.com.dio;

import br.com.dio.model.Gato;

import java.util.Scanner;

import static java.util.Scanner.*;

public class PrimeiroPrograma {

    public static void main(String[] args) {

        Gato gato = new Gato();
        System.out.println("Por favor, digite o nome do gato:");
        Scanner scan = new Scanner(System.in);
        String nome = scan.next();
        gato.setNome(nome);

        System.out.println("Por favor, digite a cor do gato:");
        String cor = scan.next();
        gato.setCor(cor);

        System.out.println("Por favor, digite a idade do gato:");
        Integer idade = scan.nextInt();
        gato.setIdade(idade);


        int a, b;
        a = 8;
        b = 10;

        System.out.println("Hello Vini, Eu sei que vc é o RAIO hahahahahahah!!!" + (a+b));

        System.out.println(gato);




    }


}
