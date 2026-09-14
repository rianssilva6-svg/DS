import java.util.ArrayList;
import java.util.Scanner;

public class CadastroContatos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            ArrayList<Contato> contatos = new ArrayList<>();


            while (true) {
                System.out.println("<<<<<SDCC>>>>>");
                System.out.println("1 - Cadastrar Contato Pessoal");
                System.out.println("2 - Cadastrar Contato Profissional");
                System.out.println("3 - Listar Todos os Contato");
                System.out.println("4 - Pesquisar Contato");
                System.out.println("5 - Alterar Contato");
                System.out.println("6 - Excluir Contato");
                System.out.println("7 - Sair");
                int op = sc.nextInt();
                sc.nextLine();

                switch (op) {
                    case 1:
                        System.out.println("\n===== Cadastramento Pessoal =====");
                        System.out.print("Informe o nome: ");
                        String nome = sc.nextLine();

                        System.out.print("Informe o telefone: ");
                        String numero = sc.nextLine();

                        System.out.print("Digite o parentesco: ");
                        String parentesco = sc.nextLine();

                        contatos.add(new ContatoPessoal(nome, numero, parentesco));
                        System.out.println("Cadastro realizado\n");
                        break;

                    case 2:
                        System.out.println("===== Cadastramento Profissional ======");
                        System.out.print("Informe o nome: ");
                        nome = sc.nextLine();

                        System.out.print("Informe o telefone: ");
                        numero = sc.nextLine();

                        System.out.print("Digite a empresa: ");
                        String empresa = sc.nextLine();

                        System.out.print("Digite o cargo: ");
                        String cargo = sc.nextLine();

                        contatos.add(new ContatoProfissional(nome, numero, empresa, cargo));
                        System.out.println("Cadastro realizado\n");
                        break;

                    case 3:
                        System.out.println("\n===== Listar =====");
                        System.out.println("Nomes cadastrados");
                        for(int i = 0; i<contatos.size(); i++) {
                            System.out.println(i+1+" - "+contatos.get(i));
                        }
                        System.out.println("\n");
                        break;

                    case 4:
                        System.out.println("\n===== Pesquisar =====");
                        System.out.print("Informe o nome para pesquisar: ");
                        String busca = sc.nextLine();

                        boolean encontrado = false;

                        for(int i = 0; i <contatos.size(); i++) {
                            if (contatos.get(i).getNome().equalsIgnoreCase(busca)) {
                                System.out.println("Econtrado: "+contatos.get(i)+"\n");

                                encontrado = true;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("Contato não encontrado\n");
                        }
                        break;

                    case 5:
                        System.out.println("\n===== Alterar =====");
                        System.out.println("1 - Profissional");
                        System.out.println("2 - Pessoal");
                        System.out.print("Escolha: ");
                        int escolha = sc.nextInt();
                        
                        System.out.print("Informe o numero do indice que deseja alterar: ");
                        int pos = sc.nextInt();
                        sc.nextLine();

                        if(pos>0 && pos<=contatos.size()) {
                            if (escolha == 1) {
                                System.out.println("Digite um novo nome: ");
                                String novoNome = sc.next();

                                System.out.println("Digite o novo número: ");
                                String novoNumero = sc.next();

                                System.out.println("Digite o novo parentesco: ");
                                String novoParentesco = sc.next();
                                contatos.set(pos-1, new ContatoPessoal(novoNome, novoNumero, novoParentesco));
                            }
                            else if(escolha==2) {

                                System.out.println("Digite um novo nome: ");
                                String novoNome = sc.next();

                                System.out.println("Digite o novo número: ");
                                String novoNumero = sc.next();

                                System.out.println("Digite uma nova Empresa: ");
                                String novaEmpresa = sc.next();

                                System.out.println("Digite um novo cargo: ");
                                String novoCargo = sc.next();
                                contatos.set(pos-1, new ContatoProfissional(novoNome, novoNumero, novaEmpresa, novoCargo));
                            }
                        }
                        break;

                    case 6:
                        System.out.println("\n===== Remover =====");
                        System.out.print("Informe o indice para remover: ");
                        int index = sc.nextInt();
                        sc.nextLine();

                        if (index>0 && index<=contatos.size()) {
                            contatos.remove(index-1);
                            System.out.println("Contato removido\n");
                        }
                        else {
                            System.out.println("Contato invalido\n");
                        }
                        break;

                    case 7:
                        System.out.println("Sistema Encerrado.....");
                        sc.close();
                        return;

                    default:
                        System.out.println("Opcao invalida\n");
                        break;
                    }
            }
        }
}
