package Exercicio03;

import java.util.Scanner;

public class Exerc03 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Informe o salario bruto: ");
        double salario = s.nextDouble();
        System.out.println("Informe o valor do emprestimo: ");
        double valorEmprestimo = s.nextDouble();
        System.out.println("Quantidade de prestações: ");
        double prestacao = s.nextDouble();

        double perc = salario * 30/100;
        double valorPrestacao = valorEmprestimo / prestacao;

        if (valorPrestacao > perc){
            System.out.println("O valor da prestação ultrapassa o limite de 30%.");
        }
        else {
            System.out.println("O emprestimo pode ser concedido.");
        }





    }

}
