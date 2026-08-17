package atividades;

import java.util.Scanner;
public class Atividade01 {
    public static void main(String[] args) {
        System.out.println("===== Verificação de números =====");
        Scanner sc = new Scanner(System.in);

            System.out.print("Digite um número: ");
            int numero = sc.nextInt();

            if (numero<0)
                System.out.println("Número negativo!!");
            else if (numero==0)
                System.out.println("Número nulo!!");
            else
                System.out.println("Número positivo!!");

        sc.close();
    }
}
