import java.util.Scanner;

public class PagamentoApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.print("\033[H\033[2J");

            System.out.print("Digite o valor do pagamento: R$");
            double valor = sc.nextDouble();

            Pix pix = new Pix();
            pix.pagar(valor);

            



        sc.close();
    }
}
