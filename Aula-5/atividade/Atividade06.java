package atividade;

import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int escolha = 1;

        while (escolha!=0) {
            
                System.out.println("===== Menu =====");
                System.out.println("1 - Calcular Tabuada\n2 - Realizar Contagem Regressiva\n0 - Sair");
                System.out.print("Escolha: ");
                escolha = sc.nextInt();

                if (escolha == 1) {
                    System.out.println("===== Tabuada =====");
                    System.out.print("Digite um número: ");
                    int numero = sc.nextInt();

                    for (int count = 1; count <=10;count++) {
                        System.out.println(+numero+" x "+count+" = " +(numero*count));
                    }
                }
                else if (escolha == 2) {

                    System.out.print("Digite um número: ");
                    int numero = sc.nextInt();

                    for (int count = numero; count >= 0; count--) {
                        System.out.println("Contagem: "+count);
                    }
                }
                else if (escolha == 0) {
                    System.out.println("Programa Encerrado");
                }
                else {
                    System.out.println("Opção inválida");
                }
            }
            
            sc.close();
    }
}
