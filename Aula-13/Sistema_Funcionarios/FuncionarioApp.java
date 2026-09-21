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
                System.out.println("3 - Dar bonus");
                System.out.println("4 - Sair");
                System.out.print("Escolha: ");
                byte escolha = sc.nextByte();

                switch (escolha) {
                    case 1:
                        System.out.println("===== Cadastrar Funcionario =====");
                        System.out.println("1 - Trabalhador CLT");
                        System.out.println("2 - Trabalhador FreeLancer");
                        System.out.println("Escolha: ");
                        byte op = sc.nextByte();
                        if (op==1) {
                            System.out.println("===== Cadastrar CLT =====");
                            System.out.print("Digite o nome: ");
                            String nome = sc.next();

                            System.out.print("Digite o CPF: ");
                            String cpf = sc.next();

                            System.out.print("Digite o salario: ");
                            double salario = sc.nextDouble();

                            listaFuncionariosCLT.add(new Funcionario(nome, cpf, salario));
                            System.out.println("Cadastro confirmado");
                        }
                        else if (op==2) {
                            System.out.println("===== Cadastrar FreeLancer =====");
                            System.out.print("Digite o nome: ");
                            String nome = sc.next();

                            System.out.print("Digite o CPF: ");
                            String cpf = sc.next();

                            System.out.print("Digite o salario: ");
                            double salario = sc.nextDouble();

                            listaFuncionariosFree.add(new Funcionario(nome, cpf, salario));
                            System.out.println("Cadastro confirmado");
                        }
                        else {
                            System.out.println("Escolha inválida!! Tente novamente...");
                        }
                        break;

                    case 2:
                        System.out.println("===== Dados dos Funcionarios CLT =====");
                        for (Funcionario f : listaFuncionariosCLT) {
                            f.exibirDados();
                            System.out.println("\n");
                        }
                        System.out.println("===== Dados dos Funcionarios FreeLancer =====");
                        for (Funcionario f : listaFuncionariosFree) {
                            f.exibirDados();
                            System.out.println("\n");
                        }
                        break;

                    case 3:


                        break;




                    case 4:
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
