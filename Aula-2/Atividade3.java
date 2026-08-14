import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("===== Sistema de Compra =====");

            System.out.print("Digite o nome do cliente: ");
            String nome = sc.next();

            System.out.print("Digite o nome do produto: ");
            String produto = sc.next();

            System.out.printf("Digite a quantidade que comprou do produto %s: ",produto);
            int quantidade = sc.nextInt();

            System.out.printf("Digite o valor unitário do produto %s: ",produto);
            double valor = sc.nextDouble();

            double total = (quantidade*valor);

            System.out.println("===== Nota Fiscal =====");
            System.out.printf(
                "| Nome do cliente: %s%n| Produto: %s%n| Quantidade: %d%n| Valor unitário: %.2f%n| Total da compra: %.2f",nome,produto,quantidade,valor,total);



        sc.close();
    }
}
