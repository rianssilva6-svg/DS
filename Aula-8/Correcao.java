import java.util.Scanner;

public class Correcao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int maxQuartos = 5;
            int maxReservas = 25;

            int[] numerosQuartos = new int[maxQuartos];
            int[] camasDisponiveis = new int[maxQuartos];

            String[] hospede = new String[maxQuartos];
            int[] quartoReserva = new int[maxQuartos];

            int quantidadeQuartos;
            int totalreserva=0;

            boolean quartosCadastrados = false;
            boolean camasCadastradas = false;

            int opcao;

            System.out.print("Informe a quantidade de quartos disponiveis (max 5): ");
            quantidadeQuartos = sc.nextInt();

            while (quantidadeQuartos<1 || quantidadeQuartos>5) {
                System.out.println("Quantidade inválida!! Digite um valor entre 1 e 5:");
                quantidadeQuartos=sc.nextInt();
            }
            do {
                System.out.println("===== Menu ====");
                System.out.println("1 - Registrar o número dos quartos\n2 - Registrar a quantidade de camas\n3 - Reservar quartos");
                System.out.println("4 - Consulta reservas por quarto\n5 - Consulta reservas por hóspede\n6 - Mostrar relatório geral\n7 - Encerrar");
                System.out.print("Escolha a opção: ");
                opcao=sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.println("\n===== Cadastro dos Quartos =====");
                        for(int contador = 0; contador <quantidadeQuartos; contador++) {
                            System.out.println("Informe o número do quarto: "+(contador+1)+" : ");
                            numerosQuartos[contador] = sc.nextInt();

                        }
                        quartosCadastrados=true;
                        System.out.println("Quartos cadastrados com sucesso!!");
                        break;
                
                    case 2:
                        if (!quartosCadastrados) {
                            System.out.println("Cadastre primeiro os números dos quartos!!");
                        }
                        else {
                            System.out.println("\n===== Cadastro de camas por quarto =====");
                            for(int cadCamas = 0; cadCamas < quantidadeQuartos; cadCamas++) {
                                System.out.println("Informe a quantidade de camas do quarto "+numerosQuartos[cadCamas]+" : ");
                                camasDisponiveis[cadCamas] = sc.nextInt();
                            }
                            camasCadastradas = true;
                            System.out.println("Quantidade de camas cadastrada com sucesso!!");
                        }
                        break;

                    case 3:
                        if (!quartosCadastrados) {
                            System.out.println("Cadastre primeiro o número de quartos!!");
                        }

                        else if (!camasCadastradas) {
                            System.out.println("Cadastre primeiro a quantidade de camas!!");
                        }

                        else if (totalreserva>=maxReservas) {
                            System.out.println("Limite maximo de reservas atingido!!");
                        }

                        else {
                            int numeroQuarto;
                            int posicaoQuarto=-1;

                            System.out.println("Informe o número do quarto para reserva: ");
                            numeroQuarto=sc.nextInt();
                            sc.nextLine();

                            for(int registro = 0; registro < quantidadeQuartos; registro++) {
                                if (numerosQuartos[registro]==numeroQuarto) {
                                posicaoQuarto=registro;
                                break;
                                }
                            }
                            if (posicaoQuarto== -1) {
                                System.out.println("Esse quarto já existe!!");
                            }
                            else if (camasDisponiveis[posicaoQuarto]<=0) {
                                System.out.println("Não há camas disponiveis neste quarto");
                            }
                            else {
                                System.out.println("Informe o nome do hóspede: ");
                                hospede[totalreserva] = sc.nextLine();
                                quartoReserva[totalreserva] = numeroQuarto;

                                camasDisponiveis[posicaoQuarto]--;
                                totalreserva++;

                                System.out.println("Reserva realizada com sucesso!!");
                            }
                        }
                        break;

                    case 4:
                        

                        break;

                        
                    default:
                        break;
                }




            }while(opcao!=7);

        sc.close();
    }

}

