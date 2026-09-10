import java.util.Scanner;

public class CarroApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.print("\033[H\033[2J");
            System.out.println("===== Registro de Carros =====");

            System.out.print("Digite a marca do carro: ");
            String marca = sc.next();

            System.out.print("Digite o modelo: ");
            String modelo = sc.next();

            System.out.print("Digite o ano de fabricacao: ");
            int ano = sc.nextInt();

            Carro veiculo1 = new Carro(marca, modelo, ano);
            System.out.println("\n===== Carro Registrado =====");
            System.out.println("Marca do veiculo: "+veiculo1.getMarca());
            System.out.println("Modelo: "+veiculo1.getModelo());
            System.out.println("Ano de fabricacao: "+veiculo1.getAnoFabricacao());

        sc.close();
    }
}
