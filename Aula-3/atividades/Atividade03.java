package atividades;

import java.util.Scanner;
public class Atividade03 {
    public static void main(String[] args) {
        System.out.println("===== Verificação de idade =====");
        Scanner sc = new Scanner(System.in);

            System.out.print("Digite a sua idade: ");
            byte idade = sc.nextByte();

            if (idade<=12)
                System.out.println("Criança");
            else if (idade <=17)
                System.out.println("Adolescente");
            else if (idade <=59)
                System.out.println("Adulto");
            else
                System.out.println("Idoso");

        sc.close();
    }
}
