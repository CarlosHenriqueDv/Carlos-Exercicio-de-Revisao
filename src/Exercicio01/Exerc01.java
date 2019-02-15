package Exercicio01;


import java.util.Scanner;

public class Exerc01 {

    public static void main(String[] args) {

        double valorGasto;
        double total;
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o valor gasto");

        valorGasto = s.nextDouble();

        total = valorGasto + valorGasto *10/100;

        System.out.println("O total da conta: " + total);

    }
}
