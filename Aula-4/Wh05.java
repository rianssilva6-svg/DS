import java.util.Scanner;

public class Wh05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int op = 0;

            while(op!=5) {
                System.out.println("\n===== Menu =====");
                System.out.println("1 - Cadastro\n2 - Listar\n3 - Alterar\n4 - Remover\n5 - Sair");
                op = sc.nextInt();

                switch (op) {
                    case 1:
                        System.out.println("Cadastrar");
                        break;
                    case 2:
                        System.out.println("Listar");
                        break;
                    case 3:
                        System.out.println("Alterar");
                        break;
                    case 4:
                        System.out.println("Remover");
                        break;
                    case 5:
                        System.out.println("Sair");
                        break;
                    default:
                        System.out.println("Tente novamente...");
                        break;
                }

            }

        sc.close();
    }
}
