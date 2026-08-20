package atividade;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            String senha = "";

            do {
                System.out.print("Digite um número de 4 digitos: ");
                senha = sc.nextLine();
            }while(!senha.equals("2024"));
            System.out.println("Acesso permitido");
        
        sc.close();
    }
}
