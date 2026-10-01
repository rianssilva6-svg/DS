import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int escolha = -1;

            String nome;
            int numero;
            double saldo;
            int limiteMax = 100;
            int verNumero;
            boolean numeroExistente = false;

            ArrayList<Conta> Contas = new ArrayList<>();

            while (escolha!=0) {

                try{
                    System.out.println("===== Registro Bancario =====");
                    System.out.println("1 - Cadastrar Conta");
                    System.out.println("2 - Buscar Conta");
                    System.out.println("3 - Remover Conta");
                    System.out.println("0 - Sair");
                    System.out.print("Escolha: ");
                    escolha = sc.nextInt();

                    switch (escolha) {

                        case 1:
                            if (Contas.size()<limiteMax) {
                                System.out.print("Digite o nome do titular: ");
                                nome = sc.next();

                                if (nome.trim().isEmpty()) {
                                    System.out.println("Este campo nao pode estar vazio!!");
                                    break;
                                }
                                System.out.print("Digite o numero da conta: ");
                                numero = sc.nextInt();

                                if (numero <0) {
                                    System.out.println("Valor invalido ao registrar o numero da conta!!");
                                    break;
                                }
                                else {
                                    numeroExistente = false;
                                    for (Conta conta : Contas) {
                                        if (conta.getNumero() == numero) {
                                            numeroExistente = true;
                                            break;
                                        }
                                    }
                                    if (numeroExistente) {
                                        System.out.println("Essa conta ja existe!!");
                                        break;
                                    }
                                }


                                System.out.print("Digite o saldo: R$");
                                saldo = sc.nextDouble();

                                if (saldo<0) {
                                    System.out.println("Saldo nao pode ser negativo!!");
                                    break;
                                }
                                sc.nextLine();

                                Contas.add(new Conta(nome, numero, saldo));

                                System.out.println("Registrado com sucesso!!");
                            }
                            else {
                                System.out.println("Limite maximo atingido!!");
                            }
                            break;


                        case 2:
                            if (Contas.isEmpty()) {
                                System.out.println("Nenhum registro encontrado!!");
                            }
                            else {
                                System.out.print("Digite o numero da conta que deseja buscar: ");
                                verNumero = sc.nextInt();

                                for (Conta conta : Contas) {
                                    if (conta.getNumero() == verNumero) {
                                        System.out.println("===== Registro encontrado!! =====");
                                        conta.exibirDado();
                                        break;
                                    }
                                    else {
                                        System.out.println("Nenhum registro encontrado!");
                                    }
                                }
                            }
                            break;


                        case 3:
                            if (Contas.isEmpty()) {
                                System.out.println("Nenhum registro encontrado!!");
                            }
                            else {
                                System.out.print("Digite o numero da conta para remover: ");
                                verNumero = sc.nextInt();
                                Conta contaParaRemover = null;
                                for (Conta c : Contas) {
                                    if (c.getNumero() == verNumero) {
                                        contaParaRemover = c;
                                        break;
                                    }
                                }

                                if (contaParaRemover != null) {
                                    Contas.remove(contaParaRemover);
                                    System.out.println("Conta removida com sucesso!");
                                } else {
                                    System.out.println("Conta não encontrada.");
                                }
                            }
                            break;

                        case 0:
                            System.out.println("Sistema Encerrado...");
                            break;


                        default:
                            System.out.println("Opcao invalida!! Digite novamente...");
                            break;
                    }

                }catch(InputMismatchException e) {
                    System.out.println("Erro inesperado!! A entrada de dados invalida");
                    sc.nextLine();
                }

                catch(Exception e) {
                    System.out.println("Erro inesperado!!"+e.getMessage());
                    sc.nextLine();
                }
            }
        sc.close();
    }
}
