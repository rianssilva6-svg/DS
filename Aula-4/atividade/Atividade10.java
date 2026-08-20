package atividade;

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            int escolha = 1;

            while (escolha!=0) {
                System.out.println("1 - Mochila Escolar\n2 - Mochila de Viagem\n3 - Mochila Esportiva");
                escolha = sc.nextInt();

                switch (escolha) {
                    case 0:
                        System.out.println("Finalizando o sistema");
                        break;
                    case 1:
                        System.out.println("Compacta e ideal para estudantes");
                        break;
                    case 2:
                        System.out.println("Espaçosa, ideal para longas jornadas");
                        break;
                    case 3:
                        System.out.println("Leve, resistente e ergonômica");
                        break;
                
                    default:
                        System.out.println("Tente novamente");
                        break;
                }
            }
        
        
        sc.close();
    }
}
