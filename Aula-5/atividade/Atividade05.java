package atividade;

import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("===== Tabuada =====");
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();

            for (int count = 1; count <=10;count++) {
                System.out.println(+numero+" x "+count+" = " +(numero*count));
            }


        sc.close();
    }
}
