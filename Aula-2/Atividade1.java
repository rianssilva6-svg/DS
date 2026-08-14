import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.print("Digite o nome do produto: ");
            String produto = sc.next();

            System.out.print("Digite a sua quantidade: ");
            int quantidade = sc.nextInt();

            System.out.print("Digite o seu valor: ");
            double preco = sc.nextDouble();

            System.out.println("===== Exibição do Produto =====");
            System.out.printf(
                " | Produto: %s%n | Quantidade: %d%n | Preço unitário: %.2f",produto,quantidade,preco);

        sc.close();
    }
}
