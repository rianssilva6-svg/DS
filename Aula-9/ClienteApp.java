import java.util.Scanner;

public class ClienteApp {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner sc = new Scanner(System.in);

            int op;

            do{
                System.out.println("===== Sistema de cadastro de Clientes =====");
                System.out.println("1 - Pessoa Fisica");
                System.out.println("2 - Pessoa Juridica");
                System.out.println("0 - Sair");
                System.out.print("Escolha: ");

                while (!sc.hasNext()) {
                    System.out.println("Opção inválida. Digite 0, 1 ou 2");
                    sc.next();
                }
                op = sc.nextInt();
                sc.nextLine();

                switch (op) {
                    case 1:
                        System.out.print("Informe o nome: ");
                        String nome = sc.nextLine();

                        System.out.print("Informe o endereco: ");
                        String endereco = sc.nextLine();

                        System.out.print("Informe o CPF: ");
                        String cpf = sc.nextLine();

                        ClientePF pf = new ClientePF(nome, endereco, cpf);
                        pf.setNome(nome);
                        pf.setEndereco(endereco);
                        pf.setCpf(cpf);

                        System.out.println("\n ===== Dados do Cliente PF =====");
                        pf.exibirDados();
                        System.out.println("\n");
                        break;

                    case 2:
                        System.out.print("Informe o nome: ");
                        nome = sc.nextLine();

                        System.out.print("Informe o endereco: ");
                        endereco = sc.nextLine();

                        System.out.print("Informe o CNPJ: ");
                        String cnpj = sc.nextLine();

                        ClientePJ pj = new ClientePJ(nome, endereco, cnpj);
                        pj.setNome(nome);
                        pj.setEndereco(endereco);
                        pj.setCnpj(cnpj);

                        System.out.println("\n ===== Dados do Cliente PJ =====");
                        pj.exibirDados();
                        System.out.println("\n");
                        break;

                    case 0:
                        System.out.println("===== Encerrado =====");
                        break;

                    default:
                        System.out.println("Opcaoo invalida!!");
                        break;
                }

            }while(op!=0);


        sc.close();
    }
}
