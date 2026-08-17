package atividades;

import java.util.Scanner;
public class Atividade05 {

    public static void main(String[] args) {
        System.out.println("===== Acesso =====");
        Scanner sc = new Scanner(System.in);

            System.out.print("Digite a senha da porta: ");
            String senha = sc.nextLine();

            if (senha.equals("9750"))
                System.out.println("Porta Aberta!!");
            else
                System.out.println("Senah não confere!!");

        sc.close();
    }
}
