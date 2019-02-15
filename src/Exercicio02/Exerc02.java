package Exercicio02;

import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {

        double altura;
        double raio;

        Scanner s = new Scanner(System.in);

        System.out.println("Informe a altura: ");
        altura = s.nextDouble();
        System.out.println("Informe o raio: ");
        raio = s.nextDouble();

        double volume = 3.141559 * Math.pow(raio,2) * altura;

        System.out.println("Volume = " + volume);


    }

}
