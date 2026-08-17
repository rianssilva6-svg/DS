package atividades;

import java.util.Scanner;
public class Atividade02 {
    public static void main(String[] args) {
        System.out.println("===== Número par ou impar =====");
        Scanner sc = new Scanner(System.in);

            System.out.print("Digite um número: ");
            int numero = sc.nextInt();

            if (numero %2 == 0)
                System.out.println("Número par");
            else
                System.out.println("Número impar");

        sc.close();
    }
}
