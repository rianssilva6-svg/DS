import java.util.ArrayList;
import java.util.Scanner;

public class VeiculoApp {
    public static void main(String[] args) {

        System.out.println("\033[H\033[2J");

        // Cadastro de veiculos
        ArrayList<Carro> ListaCarro = new ArrayList<>();
        ArrayList<Moto> ListaMoto = new ArrayList<>();

        // Variaveis
        String placa;
        String modelo;
        int ano;
        double valor_diaria;
        int dia;
        double desconto;
        String verPlaca;

        // Condições
        boolean cadastroCarro = false;
        boolean cadastroMoto = false;

        Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("===== Sistema de Aluguel de Veiculos =====");
                System.out.println("1 - Cadastrar Veiculos");
                System.out.println("2 - Mostrar dados dos veiculos");
                System.out.println("3 - Calcular aluguel com desconto");
                System.out.println("4 - Encerrar");
                System.out.print("Escolha: ");
                int escolha = sc.nextInt();

                switch (escolha) {
                    case 1:
                        System.out.println("===== Cadastrar Veiculo =====");
                        System.out.println("1 - Carro");
                        System.out.println("2 - Moto");
                        System.out.print("Escolha: ");
                        int op = sc.nextInt();

                        if (op==1) {
                            System.out.print("Digite a placa: ");
                            placa = sc.next();
                            System.out.print("Digite o modelo: ");
                            modelo = sc.next();
                            System.out.print("Digite o ano: ");
                            ano = sc.nextInt();
                            System.out.print("Digite o valor da diaria desse veiculo: ");
                            valor_diaria = sc.nextDouble();

                            ListaCarro.add(new Carro(placa.toLowerCase(), modelo, ano, valor_diaria));
                            System.out.println("Cadastro do veiculo carro confirmado");
                            cadastroCarro = true;
                            System.out.println("\n");
                        }
                        else if (op==2) {
                            System.out.print("Digite a placa: ");
                            placa = sc.next();
                            System.out.print("Digite o modelo: ");
                            modelo = sc.next();
                            System.out.print("Digite o ano: ");
                            ano = sc.nextInt();
                            System.out.print("Digite o valor da diaria desse veiculo: ");
                            valor_diaria = sc.nextDouble();

                            ListaMoto.add(new Moto(placa.toLowerCase(), modelo, ano, valor_diaria));
                            System.out.println("Cadastro do veiculo moto confirmado");
                            cadastroMoto = true;
                            System.out.println("\n");
                        }
                        else {
                            System.out.println("Escolha invalida!!");
                        }
                        break;


                    case 2:
                        if (!cadastroCarro && !cadastroMoto) {
                            System.out.println("Cadastre primeiro os veiculos!!");
                        }
                        else {
                            System.out.println("===== Carros Cadastradas =====");
                            for (Carro carro : ListaCarro) {
                                carro.exibirDados();
                                System.out.println("\n");
                            }

                            System.out.println("\n");
                            System.out.println("===== Motos Cadastradas =====");
                            for (Moto moto : ListaMoto) {
                                moto.exibirDados();
                                System.out.println("\n");
                            }

                        }
                        break;


                    case 3:
                        System.out.println("===== Pagamento com desconto =====");
                        System.out.println("===== Veiculos =====");
                        System.out.println("1 - Carro");
                        System.out.println("2 - Moto");
                        System.out.print("Qual o seu veiculo: ");
                        escolha = sc.nextInt();
                        if (escolha==1) {
                            System.out.print("Digite a placa: ");
                            verPlaca = sc.next();

                            for (Carro carro : ListaCarro) {
                                if (carro.getPlaca().equals(verPlaca.toLowerCase())) {
                                    System.out.print("Digite a quantidade de dias de uso: ");
                                    dia = sc.nextInt();
                                    System.out.print("Digite o valor do desconto: ");
                                    desconto = sc.nextDouble();

                                    carro.aluguel(carro.getValor_diaria(), dia, desconto);
                                    System.out.println("\n");
                                }
                            }
                        }
                        else if (escolha==2) {
                            System.out.print("Digite a placa: ");
                            verPlaca = sc.next();

                            for (Moto moto : ListaMoto) {
                                if (moto.getPlaca().equals(verPlaca.toLowerCase())) {
                                    System.out.print("Digite a quantidade de dias de uso: ");
                                    dia = sc.nextInt();
                                    System.out.print("Digite o valor do desconto: ");
                                    desconto = sc.nextDouble();

                                    moto.aluguel(moto.getValor_diaria(), dia, desconto);
                                    System.out.println("\n");
                                }
                            }
                        }
                        break;


                    case 4:
                        System.out.println("Sistema Encerrado....");
                        sc.close();
                        return;

                    default:
                        System.out.println("Escolha inválida!! Tente novamente...");
                        break;
                }
            }

    }
}
