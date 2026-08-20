package atividade;

import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int numero;

            do {
                System.out.println("Digite um número: ");
                numero = sc.nextInt();
            }while(numero>=0);


        sc.close();
    }
}
