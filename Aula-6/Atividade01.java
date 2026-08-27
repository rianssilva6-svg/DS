

import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            String [] produto = new String[5];
            int [] quantidade = new int[5];

            int escolha = 0;

            while (escolha !=6) {

                System.out.println("===== Menu =====");
                System.out.println("1 - Cadastrar produto\n2 - Listar produtos\n3 - Pesquisar produto");
                System.out.println("4 - Alterar Produto\n5 - Remover produto\n6 - Sair\n");
                System.out.print("Escolha: ");
                escolha = sc.nextInt();


                switch (escolha) {
                    case 1:
                        System.out.println("===== Cadastro de produto =====");
                        for (int count = 0; count < produto.length; count++)
                        {
                            System.out.print("Digite o "+(count+1)+"º produto: ");
                            produto[count] = sc.next();
                            System.out.print("Digite a quantidade do "+(count+1)+" produto: ");
                            quantidade[count] = sc.nextInt();
                        }
                        break;
                    
                    case 2:
                        System.out.println("===== Lista de Produtos =====");
                        for (int lista = 0; lista < 5; lista++) {
                            System.out.println(produto[lista]+ " - "+quantidade[lista]);
                        }
                        break;
                    
                    case 3:
                        System.out.println("===== Pesquisar Produto =====");
                        System.out.print("Digite o nome do produto que deseja pesquisar: ");

                        sc.nextLine();
                        String pesquisa = sc.nextLine();

                        for (int count = 0; count < 5; count++) {
                            if (produto[count].equals(pesquisa)) {
                                System.out.println("Produto: "+produto[count]+" - "+quantidade[count]);
                            }
                        }
                        break;

                    case 4:
                        System.out.println("===== Atualizar Produto =====");
                        System.out.print("Digite o nome do produto que deseja trocar: ");

                        sc.nextLine();
                        String alterar = sc.next();

                        for (int count = 0; count < 5; count++) {
                            if (produto[count].equals(alterar)) {
                                System.out.print("Digite um novo nome: ");
                                produto[count] = sc.next();
                                System.out.print("Digite a nova quantidade");
                                quantidade[count] = sc.nextInt();
                                System.out.println("Sistema atualizado");
                            }
                        }
                        break;

                    case 5:
                        System.out.println("===== Remover Produto =====");
                        System.out.print("Digite o nome do produto que deseja remover: ");
                        String remover = sc.next();

                        for (int count = 0; count < 5; count++) {
                            if (produto[count].equals(remover)) {
                                produto[count] = null;
                                quantidade[count] = 0;
                                System.out.println("Produto removido");
                            }
                        }
                        break;

                    case 6:
                        System.out.println("Sistema Finalizado");
                        break;

                    default:
                        System.out.println("Opção incorreta");
                        break;
                }
            }
        sc.close();
    }

}
