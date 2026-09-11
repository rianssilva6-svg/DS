package Atividade_veiculos;
import java.util.Scanner;

public class VeiculoApp {
    public static void main(String[] args) {

        String marca;
        int ano;
        float cilindrada;
        int qtdPorta;

        System.out.print("\033[H\033[2J");
        Scanner sc = new Scanner(System.in);

            int op;
            do {
                System.out.println("===== Registro de Veiculos =====");
                System.out.println("1 - Moto");
                System.out.println("2 - Carro");
                System.out.println("0 - Sair");
                System.out.print("Escolha: ");

                while (!sc.hasNextInt()) {
                    System.out.println("Valor invalida!! Digite apenas numeros");
                    sc.next();
                }
                op = sc.nextInt();
                sc.nextLine();

                switch (op) {
                    case 1:
                        System.out.print("Informe a Marca: ");
                        marca = sc.nextLine();

                        System.out.print("Informe o ano: ");
                        ano = sc.nextInt();

                        System.out.print("Informe a cilindrada: ");
                        cilindrada = sc.nextFloat();

                        Moto veiculoMoto = new Moto(marca, ano, cilindrada);
                        veiculoMoto.setMarca(marca);
                        veiculoMoto.setAno(ano);
                        veiculoMoto.setCilindrada(cilindrada);

                        System.out.println("\n ===== Registro do Veiculo Moto ====");
                        veiculoMoto.exibirDados();
                        System.out.println("\n");
                        break;

                    case 2:
                        System.out.print("Informe a Marca: ");
                        marca = sc.nextLine();

                        System.out.print("Informe o ano: ");
                        ano = sc.nextInt();

                        System.out.print("Informe a quantidade de portas: ");
                        qtdPorta = sc.nextInt();

                        Carro veiculoCarro = new Carro(marca, ano, qtdPorta);
                        veiculoCarro.setMarca(marca);
                        veiculoCarro.setAno(ano);
                        veiculoCarro.setQtdPorta(qtdPorta);

                        System.out.println("\n ===== Registro do Veiculo Moto ====");
                        veiculoCarro.exibirDados();
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
