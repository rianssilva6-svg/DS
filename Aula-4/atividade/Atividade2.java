package atividade;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            int op;

            do {
                System.out.println("1 - Caixa de Papelão\n2 - Sacola plástica\n3 - Embalagem de vidro\n0 - Sair");
                System.out.print("Escolha: ");
                op = sc.nextInt();

                switch (op) {
                    case 0:
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
                        System.out.println("Tente novamente...");
                        break;
                }
            
            }while (op!=0);
            System.out.println("Finalizando o Sistema");
            
        sc.close();
    }
}
