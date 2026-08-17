package atividades;

import java.util.Scanner;
public class Atividade04 {
    public static void main(String[] args) {
        System.out.println("===== Maior ou Menor de Idade =====");
        Scanner sc = new Scanner(System.in);

            System.out.print("Digite a sua idade: ");
            byte idade = sc.nextByte();
            
            if (idade<=17)
                System.out.println("Menor de idade");
            else
                System.out.println("Maior de idade");

        sc.close();
    }
}
