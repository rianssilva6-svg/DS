import java.util.ArrayList;
import java.util.Scanner;

public class ProdutoApp {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");

        ArrayList<ProdutoFisico> listaProdutoFisico = new ArrayList<>();
        ArrayList<ProdutoDigital> listaProdutoDigital = new ArrayList<>();

        String codigo;
        String nome;
        double preco;
        int quantidade;
        double frete;

        boolean cadastroProdutoFisico = false;
        boolean cadastroProdutoDigital = false;

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("===== Sistema de Produtos =====");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Escolher Produto");
            System.out.println("3 - Mostrar Dados dos Produtos");
            System.out.println("4 - Realizar Venda");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");
            int escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("===== Cadastrar Produtos =====");
                    System.out.println("1 - Produto Fisico");
                    System.out.println("2 - Produto Digital");
                    System.out.print("Escolha: ");

                    int op = sc.nextInt();

                    if (op == 1) {
                        System.out.print("Digite o codigo do produto: ");
                        codigo = sc.next();
                        System.out.print("Digite o nome do produto: ");
                        nome = sc.next();
                        System.out.print("Digite o preco: ");
                        preco = sc.nextDouble();
                        listaProdutoFisico.add(new ProdutoFisico(codigo, nome, preco));
                        System.out.println("Cadastro concluido!!");
                        cadastroProdutoFisico = true;
                    }
                    else if (op == 2) {
                        System.out.print("Digite o codigo do produto: ");
                        codigo = sc.next();
                        System.out.print("Digite o nome do produto: ");
                        nome = sc.next();
                        System.out.print("Digite o preco: ");
                        preco = sc.nextDouble();
                        listaProdutoDigital.add(new ProdutoDigital(codigo, nome, preco));
                        System.out.println("Cadastro concluido!!");
                        cadastroProdutoDigital = true;
                    }
                    else {
                        System.out.println("Escolha invalida!!");
                    }
                    break;
                case 2:

                    break;
                case 3:
                    System.out.println("===== Catalogo de Produtos =====");
                    if (!cadastroProdutoDigital && !cadastroProdutoFisico) {
                        System.out.println("Cadastre os produtos primeiro!!");
                    }
                    else{
                        System.out.println("===== Produto Fisico =====");
                        for (ProdutoFisico produtoFisico : listaProdutoFisico) {
                            produtoFisico.exibirDados();
                            System.out.println("\n");
                        }
                        System.out.println("===== Produto Digital =====");
                        for (ProdutoDigital produtoDigital : listaProdutoDigital) {
                            produtoDigital.exibirDados();
                            System.out.println("\n");
                        }
                    }
                    break;
                case 4:
                    System.out.println("===== Compras =====");
                    System.out.println("1 - Produto Fisico");
                    System.out.println("2 - produto Digital");
                    System.out.print("Escolha: ");
                    op = sc.nextInt();

                    if (op==1) {
                        if (!cadastroProdutoFisico) {
                            System.out.println("Cadastre os produtos primeiro!!");
                        }
                        else {
                            for (ProdutoFisico produtoFisico : listaProdutoFisico) {
                                produtoFisico.exibirDados();

                                System.out.print("Digite o codigo do produto: ");
                                String verCodigo = sc.next();

                                if (produtoFisico.getCodigo().equals(verCodigo)) {
                                    System.out.print("Digite a quantidade: ");
                                    quantidade = sc.nextInt();
                                    System.out.print("Digite o valor do frete: ");
                                    frete = sc.nextDouble();

                                    produtoFisico.vendas(produtoFisico.getPreco(), frete, quantidade);
                                }

                            }
                        }
                    }
                    break;

                case 5:
                    System.out.println("Programa Finalizado....");
                    sc.close();
                    return;

                default:
                    System.out.println("Escolha invalida!! Digite novamente");
                    break;
            }
        }

    }
}
