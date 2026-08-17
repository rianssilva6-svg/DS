package atividades;

import java.util.Scanner;
public class Atividade06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.println("===== Escolha uma Operação Matemática =====");
            System.out.println("+\n-\n*\n/");
            System.out.print("Escolha: ");
            String escolha = sc.nextLine();

            System.out.print("Digite o 1° número: ");
            double numero1 = sc.nextInt();

            System.out.print("Digite o 2° número: ");
            double numero2 = sc.nextInt();


            if (escolha.equals("+")) {
                double somar = (numero1+numero2);
                System.out.println("A soma é "+somar);
            }
            else if (escolha.equals("-")) {
                double subtrair = (numero1-numero2);
                System.out.println("A subtração é: "+subtrair);
            }
            else if (escolha.equals("*")) {
                double multiplicar = (numero1*numero2);
                System.out.printf("A multiplicação é: %.2f",multiplicar);
            }
            else if (escolha.equals("/")) {
                double dividir = (numero1/numero2);
                System.out.printf("A divisão é: %.2f",dividir);
            }

        sc.close();
    }
}
