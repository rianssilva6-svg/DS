import java.util.Scanner;

public class LojaApp {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");

        Scanner sc = new Scanner(System.in);

            System.out.println("===== Registro de Produtos =====");
            System.out.print("Digite o nome do produto: ");
            String nome = sc.next();

            System.out.print("Digite seu preco: R$ ");
            float preco = sc.nextFloat();

            System.out.print("Digite a quantidade: ");
            int quantidade = sc.nextInt();

            Loja produto1 = new Loja(nome, preco, quantidade);

            System.out.println("\n===== Produto Cadastrado =====");
            System.out.println("Nome: "+produto1.getNome());
            System.out.println("Preco: R$"+produto1.getPreco());
            System.out.println("Quantidade: "+produto1.getQuantidade());
            System.out.println("Valor total: R$"+(produto1.getPreco()*produto1.getQuantidade()));

        sc.close();
    }
}
