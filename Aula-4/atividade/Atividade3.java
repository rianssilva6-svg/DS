package atividade;

import java.util.Scanner;

public class Atividade3
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            int op;

            do {
                System.out.println("1 - Caneta Esferográfica\n2 - Caneta Gel\n3 - Caneta Tinteiro\n0 - Sair");
                System.out.print("Escolha: ");
                op = sc.nextInt();

                switch (op) {
                    case 0:
                        break;
                    case 1:
                        System.out.println("Econômica e de longa duração");
                        break;
                    case 2:
                        System.out.println("Tinta mais pigmentada e escrita suave");
                        break;
                    case 3:
                        System.out.println("Clássica e elegante, usada para caligrafia");
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
