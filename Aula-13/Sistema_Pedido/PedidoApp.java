import java.util.Scanner;

public class PedidoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("===== Menu =====");
                System.out.println("1 - Cadastar Pedido");
                System.out.println("2 - Local");
                System.out.println("3 - Delivery");
                System.out.println("0 - Sair");
                System.out.print("Escolha: ");
                int op = sc.nextInt();

                switch (op) {
                    case 1:
                        System.out.print("Digite o numero do pedido: ");
                        int numero = sc.nextInt();
                        System.out.print("Digite o nome do cliente: ");
                        String nome = sc.next();
                        System.out.print("Digite o valor para pagar: R$");
                        double valor = sc.nextDouble();

                        Pedido pedido = new Pedido(numero, nome, valor);
                        System.out.println("Registro realizado");
                        break;
                    case 2:
                        System.out.println("===== Pagamento =====");
                        System.out.println("1 - Pagar no pix");
                        System.out.println("2 - Pagar no Cartao");
                        System.out.println("3 - Pagar em Dinheiro");
                        System.out.print("Escolha: ");
                        int escolha = sc.nextInt();

                        switch (escolha) {
                            case 1:

                                break;

                            default:
                                break;
                        }
                        break;
                    case 3:
                        break;
                    case 0:
                        System.out.println("Sistema Finalizado!!");
                        sc.close();
                        return ;
                    default:
                        System.out.println("Escolha Invalida!! Tente novamente");
                        break;
                }
            }
        }
}
