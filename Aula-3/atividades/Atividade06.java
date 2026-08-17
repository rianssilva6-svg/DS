package atividades;

import java.util.Scanner;
public class Atividade06 {
    public static void main(String[] args) {
        System.out.println("===== Calculando =====");
        Scanner sc = new Scanner(System.in);

            System.out.print("Digite o 1° número: ");
            double numero1 = sc.nextInt();

            System.out.print("Digite o 2° número: ");
            double numero2 = sc.nextInt();

            System.out.println("===== Agora Escolha uma Operação Matemática =====");
            System.out.printf("1 - Adição%n2 - Subtração%n3 - Multiplicação%n4 - Divisão%n");
            System.out.print("Escolha: ");
            int escolha = sc.nextInt();

            if (escolha==1) {
                double somar = (numero1+numero2);
                System.out.println("A soma é "+somar);
            }
            else if (escolha==2) {
                double subtrair = (numero1-numero2);
                System.out.println("A subtração é: "+subtrair);
            }
            else if (escolha==3) {
                double multiplicar = (numero1*numero2);
                System.out.println("A multiplicação é: "+multiplicar);
            }
            else if (escolha==4) {
                double dividir = (numero1/numero2);
                System.out.println("A divisão é: "+dividir);
            }
            else {
                System.out.println("Escolha de 1 a 4");
            }
            

        sc.close();
    }
}
