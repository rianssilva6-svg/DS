import java.util.Scanner;

public class AgenciaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.print("Numero da agencia: ");
            int numeroAgencia = sc.nextInt();
            sc.nextLine();

            System.out.print("Nome da Agencia: ");
            String nome = sc.nextLine();

            Agencia agencia = new Agencia(numeroAgencia, nome);

            System.out.println("\n===== Cadastro da Conta =====");
            System.out.print("Numero da conta: ");
            int numeroConta = sc.nextInt();
            sc.nextLine();

            System.out.print("Nome do Titular: ");
            String titular = sc.nextLine();

            System.out.print("Saldo inicial: ");
            double saldo = sc.nextDouble();

            ContaCorrente conta = new ContaCorrente(numeroConta, titular, saldo, agencia);

            while (true) {
                System.out.println("\n============================");
                System.out.println("       Banco Master");
                System.out.println("============================");
                System.out.println("1 - Mostrar Dados da Conta");
                System.out.println("2 - Consultar Saldo");
                System.out.println("3 - Depositar");
                System.out.println("4 - Pagar com Pix");
                System.out.println("5 - Pagar com Cartao");
                System.out.println("6 - Pagar com Dinheiro");
                System.out.println("0 - Sair");
                System.out.print("Escolha: ");
                int op = sc.nextInt();
                sc.nextLine();

                switch (op) {
                    case 1:
                        conta.exibirDados();
                        break;
                    case 2:
                        conta.consultarSaldo();
                        break;
                    case 3:
                        System.out.print("Informe o valor para depositar: ");
                        double deposito = sc.nextDouble();
                        conta.depositar(deposito);
                        break;
                    case 4:
                        System.out.print("Informe o valor do Pix: ");
                        double valorPix = sc.nextDouble();
                        sc.nextLine();

                        System.out.println("Digite a chave: ");
                        String chavePix = sc.nextLine();

                        conta.Pagar(valorPix, chavePix);
                        break;
                    case 5:
                        System.out.print("Informe o valor da compra: ");
                        double valorCompra = sc.nextDouble();

                        System.out.println("Informe a quantidade de parcelas: ");
                        int parcela = sc.nextInt();

                        conta.Pagar(valorCompra, parcela);
                        break;
                    case 6:
                        System.out.println("Informe o valor para pagamento: ");
                        double valorDinheiro = sc.nextDouble();

                        conta.Pagar(valorDinheiro);
                        break;

                    case 0:
                        System.out.println("Sistema Finalizado...");
                        sc.close();
                        return;

                    default:
                        System.out.println("Opcao invalida!! Tente novamente");
                        break;
                }
            }
    }
}
