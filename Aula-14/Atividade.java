import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int op = -1;
            double saque = 0;
            double deposito = 0;
            double total = 0;

            while (op!=0) {
                try {
                    System.out.println("===== Banco =====");
                    System.out.println("1 - Depositar");
                    System.out.println("2 - Sacar");
                    System.out.println("0 - Sair");
                    System.out.print("Escolha: ");
                    op = sc.nextInt();

                    switch (op) {
                        case 1:
                            System.out.print("Digite a quantidade que deseja depositar: ");
                            deposito = sc.nextDouble();
                            if (deposito <=0) {
                                System.out.println("Valor invalido, Deposite um valor acima de 0!!");
                            }
                            else {
                                total += deposito;
                                System.out.printf("Depositado com sucesso!! R$%.2f%n",total);
                            }
                            break;

                        case 2:
                            if (total == 0) {
                                System.out.println("Sem dinheiro!!");
                            }
                            else {
                                System.out.print("Digite a quantidade que deseja retirar: ");
                                saque = sc.nextDouble();
                                    if (saque <=0) {
                                        System.out.println("Digite um valor acima de 0!!");
                                    }
                                    else if (total<saque) {
                                        System.out.println("O valor do saque e maior do que o valor depositado!!");
                                    }
                                    else {
                                        System.out.printf("Valor solicitado: R$%.2f%n",saque);
                                        total = total - saque;
                                        System.out.printf("Valor reservado: R$%.2f%n",total);
                                    }
                            }
                            break;

                        case 0:
                            System.out.println("Sistema Finalizado...");
                            break;

                        default:
                            System.out.println("Valor invalido!! Tente novamente...");
                            break;
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Erro: Voce deve digitar um valor numerico para depositar ou sacar!!");
                    sc.nextLine();

                } catch (Exception e) {
                    System.out.println("Erro: "+e.getMessage());
                    sc.nextLine();

                } finally {
                    System.out.println("Operacao Encerrada...");
                }
            }

        sc.close();
    }
}
