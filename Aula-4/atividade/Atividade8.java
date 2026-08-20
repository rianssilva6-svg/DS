package atividade;

import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            int escolha = 1;

            while (escolha!=0) {
                System.out.println("1 - Caixa de Papelão\n2 - Sacola plástica\n3 - Embalagem de vidro");
                escolha = sc.nextInt();

                switch (escolha) {
                    case 0:
                        System.out.println("Finalizando o sistema");
                        break;
                    case 1:
                        System.out.println("Ideal para transporte e armazenamento");
                        break;
                    case 2:
                        System.out.println("Leve e prática, mas pouco sustentável");
                        break;
                    case 3:
                        System.out.println("Resistente e reutilizável");
                        break;
                
                    default:
                        System.out.println("Tente novamente");
                        break;
                }
            }
        
        
        sc.close();
    }
}
