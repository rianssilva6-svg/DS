import java.util.Scanner;

public class Vetor01 {

    public static void main(String[] args) {

        int[] quartos = new int[5]; // Guarda os IDs dos quartos do hotel
        int[] camas = new int[5];   // Guarda as camas de cada quarto
        
        // Histórico de reservas (limite de 25)
        String[] nomesHospedes = new String[25];
        int[] quartosReservados = new int[25]; // NOVO: Vetor para guardar qual quarto o hóspede escolheu
        int totalReserva = 0;

        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 6) {
            System.out.println("\n===== Sistema de Hotel =====");
            System.out.println("1 - Registrar número dos quartos\n2 - Registrar a quantidade de camas\n3 - Reservar Quartos");
            System.out.println("4 - Consultar Reservas por Quarto\n5 - Consultar Reservas por Hóspedes\n6 - Encerrar o Programa");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n===== Registro de quarto =====");
                    for (int count = 0; count < quartos.length; count++) {
                        System.out.print("Digite o número do " + (count + 1) + "º quarto: ");
                        quartos[count] = sc.nextInt();
                    }
                    break;

                case 2:
                    System.out.println("\n===== Registro de Cama =====");
                    for (int count = 0; count < camas.length; count++) {
                        System.out.print("Digite a quantidade de camas do " + quartos[count] + "º quarto: ");
                        camas[count] = sc.nextInt();
                    }
                    break;

                case 3:
                    System.out.println("\n===== Reservar Quarto =====");
                    if (totalReserva >= 25) {
                        System.out.println("Limite Atingido!!");
                        break;
                    }
                    
                    System.out.print("Verifique o número do quarto: ");
                    int escolha = sc.nextInt();
                    int count;
                    
                    for (count = 0; count < quartos.length; count++) {
                        if (escolha == quartos[count]) {
                            if (camas[count] > 0) {
                                System.out.print("Digite o nome do hóspede: ");
                                sc.nextLine(); // Limpa o buffer do enter antes de ler o texto
                                String nome = sc.nextLine(); // nextLine permite nomes com espaço
                                
                                // Salva os dados nos vetores de limite 25
                                nomesHospedes[totalReserva] = nome;
                                quartosReservados[totalReserva] = escolha; // CORRIGIDO
                                totalReserva++;
                                camas[count]--;

                                System.out.println("Reserva realizada com sucesso!");
                            } else {
                                System.out.println("Não há camas disponíveis neste quarto!");
                            }
                            break; // Para a busca do quarto
                        }
                    }

                    if (count == quartos.length) {
                        System.out.println("Este quarto não existe!");
                    }
                    break;

                case 4:
                    System.out.println("\n===== Consultar Reservas por Quarto =====");
                    System.out.print("Digite o número do quarto: ");
                    int busca = sc.nextInt();

                    // Verifica se o quarto existe
                    int i;
                    for (i = 0; i < quartos.length; i++) {
                        if (quartos[i] == busca) {
                            break;
                        }
                    }

                    if (i == quartos.length) {
                        System.out.println("Este quarto não existe!");
                    } else {
                        int reservasEncontradas = 0;
                        for (int k = 0; k < totalReserva; k++) {
                            // CORRIGIDO: Agora compara com o histórico de reservas
                            if (quartosReservados[k] == busca) { 
                                System.out.println("- Hóspede: " + nomesHospedes[k]);
                                reservasEncontradas++;
                            }
                        }
                        
                        if (reservasEncontradas == 0) {
                            System.out.println("Não há reservas para este quarto!");
                        }
                    }
                    break;

                case 5:
                    System.out.println("\n===== Consultar Reservas por Hóspede =====");
                    System.out.print("Digite o nome do hóspede: ");
                    sc.nextLine(); // Limpa buffer
                    String buscaNome = sc.nextLine();
                    
                    int hospedeEncontrado = 0;
                    for (int k = 0; k < totalReserva; k++) {
                        if (nomesHospedes[k].equalsIgnoreCase(buscaNome)) {
                            // CORRIGIDO: Mostra o número usando o histórico de reservas
                            System.out.println("- Quarto reservado: " + quartosReservados[k]);
                            hospedeEncontrado++;
                        }
                    }

                    if (hospedeEncontrado == 0) {
                        System.out.println("Não há reservas para este hóspede!");
                    }
                    break;

                case 6:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente!");
                    break;
            }
        }
        sc.close();
    }
}