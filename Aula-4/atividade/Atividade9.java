package atividade;

import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            int escolha = 1;

            while (escolha!=0) {
                System.out.println("1 - Caneta Esferográfica\n2 - Caneta Gel\n3 - Caneta Tinteiro");
                escolha = sc.nextInt();

                switch (escolha) {
                    case 0:
                        System.out.println("Finalizando o sistema");
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
                        System.out.println("Tente novamente");
                        break;
                }
            }
        
        
        sc.close();
    }
}
