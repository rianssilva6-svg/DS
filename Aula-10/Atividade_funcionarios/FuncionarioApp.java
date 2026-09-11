package Atividade_funcionarios;
import java.util.Scanner;

public class FuncionarioApp {
    public static void main(String[] args) {


        String nome;
        double salario;
        String disciplina;
        String setor;

        Professor pessoa1 = new Professor(null,0,null);
        Tecnico pessoa2 = new Tecnico(null, 0, null);


        System.out.print("\033[H\033[2J");
        Scanner sc = new Scanner(System.in);

            int op;
            do {
                System.out.println("===== Sistema de Funcionários =====");
                System.out.println("1 - Cadastrar Professor");
                System.out.println("2 - Cadastrar Tecnico");
                System.out.println("3 - Exibir Professor");
                System.out.println("4 - Exibir Tecnico");
                System.out.print("Escolha: ");

                while (!sc.hasNextInt()) {
                    System.out.println("Valor invalida!! Digite apenas numeros");
                    sc.next();
                }
                op = sc.nextInt();
                sc.nextLine();

                switch (op) {
                    case 1:
                        System.out.print("Informe o nome: ");
                        nome = sc.nextLine();

                        System.out.print("Informe o salario: R$: ");
                        salario = sc.nextDouble();

                        System.out.print("Informe a disciplina: ");
                        disciplina = sc.next();

                        pessoa1.setNome(nome);
                        pessoa1.setSalario(salario);
                        pessoa1.setDisciplina(disciplina);
                        break;

                    case 2:
                        System.out.print("Informe o nome: ");
                        nome = sc.nextLine();

                        System.out.print("Informe o salario: R$: ");
                        salario = sc.nextDouble();

                        System.out.print("Informe o setor: ");
                        setor = sc.next();

                        pessoa2.setNome(nome);
                        pessoa2.setSalario(salario);
                        pessoa2.setSetor(setor);
                        break;

                    case 3:
                        System.out.println("===== Exibir dados do Funcionário Professor =====");
                        pessoa1.exibirDados();
                        System.out.println("\n");
                        break;
                    case 4:
                        System.out.println("===== Exibir dados do Funcionário Tecnico =====");
                        pessoa2.exibirDados();
                        System.out.println("\n");
                        break;

                    case 0:
                        System.out.println("Sistema finalizado!!");
                        break;

                    default:
                        System.out.println("Escolha entre 0, 1 ou 2");
                        break;
                }
            }while(op!=0);


        sc.close();
    }
}
