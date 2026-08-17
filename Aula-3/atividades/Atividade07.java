package atividades;

import java.util.Scanner;
public class Atividade07 {
    public static void main(String[] args) {
        System.out.println("===== Loja de CD's =====");
        Scanner sc = new Scanner(System.in);

            System.out.printf("1 - Vermelho%n2 - Azul%n3 - Verde%n4 - Amarelo%n");
            System.out.print("Escolha: ");
            int escolha = sc.nextInt();

            if (escolha ==1) {
                System.out.println("===== Tabela =====");
                System.out.printf("CD - Vermelho%nPreço: R$24,99");
            }
            else if (escolha ==2) {
                System.out.println("===== Tabela =====");
                System.out.printf("CD - Azul%nPreço: R$34,99");
            }
            else if (escolha ==3) {
                System.out.println("===== Tabela =====");
                System.out.printf("CD - Verde%nPreço: R$44,99");
            }
            else if (escolha ==4) {
                System.out.println("===== Tabela =====");
                System.out.printf("CD - Amarelo%nPreço: R$54,99");
            }

        sc.close();
    }
}
