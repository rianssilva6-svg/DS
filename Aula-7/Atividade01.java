import java.util.Scanner;

public class Atividade01 {

    public static void main(String[] args) {

        int[] quartos = new int[5];
        int [] reservas = new int[25];
        int[] camas = new int[5];

        Scanner sc = new Scanner(System.in);
            int opcao = 0;

            while (opcao!=6) {
                System.out.println("===== Sistema de Hotel =====");
                System.out.println("1 - Registrar número dos quartos\n2 - Registrar a quantidade de camas\n 3 - Reservar Quartos");
                System.out.println("6 - Consultar Reservas por Quarto\n5 - Consultar Reservas por Hóspedes\n6 - Encerrar o Programa");
                System.out.print("Escolha: ");
                opcao = sc.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("===== Registro de quarto =====");
                        for (int count = 0; count < quartos.length; count++) {
                            System.out.print("Digite o número do "+(count+1)+"º quarto: ");
                            quartos[count] = sc.nextInt();
                        }
                        break;
                    case 2:
                        System.out.println("===== Registro de Cama =====");
                        for (int count = 0; count < camas.length; count++) {
                            System.out.print("Digite a quantidade de camasdo "+(quartos[(count+1)]+"º quarto: "));
                            camas[count] = sc.nextInt();
                        }

                    default:
                        break;
                }
            }
        sc.close();
    }
}
