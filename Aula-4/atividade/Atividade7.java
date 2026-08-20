package atividade;

import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            String nome;

            do {
                System.out.println("Digite um nome: ");
                nome = sc.nextLine();
            }while(!nome.equals("Anderson"));

        sc.close();
    }
}
