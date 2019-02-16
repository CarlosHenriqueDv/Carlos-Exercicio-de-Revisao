package Exercicio04;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        String inf = "S";


        Scanner s = new Scanner(System.in);

        while (inf.equals("S")){

            System.out.println("Informe um número: ");
            double n1 = s.nextDouble();
            if (n1 >= 0 && n1 <= 100){
                System.out.println("O número informado está no intervalo definido");
            }else {
                System.out.println("O número informado não está no intervalo definido");
            }
            System.out.println("Tecle 'S' para continuar ou 'N' sair.");
            inf = s.next();
        }


    }


}
