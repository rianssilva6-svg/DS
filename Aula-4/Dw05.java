import java.util.Scanner;

public class Dw05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            int op;

            do {
                System.out.println("1 - Iniciar jogo\n2 - Carregar jogo\n3 - Configurações\n0 - Sair");
                System.out.print("Escolha: ");
                op=sc.nextInt();

                switch (op) {
                    case 1:
                        System.out.println("iniciar jogo");
                        break;
                    case 2:
                        System.out.println("Carregar jogo");
                        break;
                    case 3:
                        System.out.println("Configurações");
                    case 4:
                        System.out.println("Sair");
                        break;
                
                    default:
                        System.out.println("tente novamente");
                        break;
                }
            }while ((op!=0)); {
                
            }
        
        sc.close();
    }
}
