package Sistema_Funcionarios;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuncionarioApp {
    public static void main(String[] args) {

        List<FuncionarioCLT> listaFuncionariosCLT = new ArrayList<>();
        List<FuncionarioFreeLancer> listaFuncionariosFree = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("\033[H\033[2J");

        while (true) {
                System.out.println("===== Menu =====");
                System.out.println("1 - Cadastrar Funcionario");
                System.out.println("2 - Consultar Dados dos Funcionarios");
                System.out.println("3 - Calcular Pagamento");
                System.out.println("4 - Calcular Pagamento com Bônus");
                System.out.println("5 - Sair");
                System.out.print("Escolha: ");
                int escolha = sc.nextByte();

                switch (escolha) {
                    case 1:
                        System.out.println("===== Cadastrar Funcionario =====");
                        System.out.println("1 - Trabalhador CLT");
                        System.out.println("2 - Trabalhador FreeLancer");
                        System.out.print("Escolha: ");
                        byte op = sc.nextByte();
                        
                        if (op==1) {
                            System.out.println("===== Cadastrar CLT =====");
                            System.out.print("Digite o nome: ");
                            String nome = sc.next();
                            System.out.print("Digite o CPF: ");
                            String cpf = sc.next();
                            System.out.print("Digite o salario: ");
                            double salario = sc.nextDouble();

                            listaFuncionariosCLT.add(new FuncionarioCLT(nome, cpf, salario));
                            System.out.println("Cadastro confirmado!");
                        }
                        else if (op==2) {
                            System.out.println("===== Cadastrar FreeLancer =====");
                            System.out.print("Digite o nome: ");
                            String nome = sc.next();
                            System.out.print("Digite o CPF: ");
                            String cpf = sc.next();
                            System.out.print("Digite o valor da hora: ");
                            double salario = sc.nextDouble();

                            listaFuncionariosFree.add(new FuncionarioFreeLancer(nome, cpf, salario));
                            System.out.println("Cadastro confirmado!");
                        }
                        else {
                            System.out.println("Escolha inválida!! Tente novamente...");
                        }
                        break;

                    case 2:
                        System.out.println("===== Dados dos Funcionarios CLT =====");
                        for (FuncionarioCLT f : listaFuncionariosCLT) {
                            f.exibirDados();
                            System.out.println("Salário Mensal: R$" + f.getSalario());
                        }

                        System.out.println("===== Dados dos Funcionarios FreeLancer =====");
                        for (FuncionarioFreeLancer f : listaFuncionariosFree) {
                            f.exibirDados();
                            System.out.println("Valor da Hora: R$" + f.getSalario());
                        }
                        break;

                    case 3:
                        System.out.println("===== Calcular Pagamentos =====");
                        System.out.println("--- CLT ---");
                        for (FuncionarioCLT f : listaFuncionariosCLT) {
                            System.out.print("Pagamento de " + f.getNome() + " -> ");
                            f.Pagar(f.getSalario()); 
                        }
                        
                        System.out.println("\n--- FreeLancer ---");
                        for (FuncionarioFreeLancer f : listaFuncionariosFree) {
                            System.out.print("Digite as horas trabalhadas por " + f.getNome() + ": ");
                            int horas = sc.nextInt();
                            System.out.print("Pagamento de " + f.getNome() + " -> ");
                            f.Pagar(f.getSalario(), horas);
                        }
                        break;

                    case 4:
                        System.out.println("===== Calcular Pagamentos com Bônus =====");
                        System.out.print("Digite o valor do bônus para todos: R$");
                        double bonus = sc.nextDouble();
                        
                        System.out.println("--- CLT ---");
                        for (FuncionarioCLT f : listaFuncionariosCLT) {
                            System.out.print("Pagamento de " + f.getNome() + " -> ");
                            f.Pagar(f.getSalario(), bonus); 
                        }
                        
                        System.out.println("\n--- FreeLancer ---");
                        for (FuncionarioFreeLancer f : listaFuncionariosFree) {
                            System.out.print("Digite as horas trabalhadas por " + f.getNome() + ": ");
                            int horas = sc.nextInt();
                            System.out.print("Pagamento de " + f.getNome() + " -> ");
                            f.Pagar(f.getSalario(), horas, bonus);
                        }
                        break;

                    case 5:
                        System.out.println("Sistema Encerrado...");
                        sc.close();
                        return;

                    default:
                        System.out.println("Opção inválida");
                        break;
                }
            }
    }
}