import java.util.Scanner;

public class For06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

            System.out.println("Informe o número: ");
            int numero = teclado.nextInt();

            for (double count = 0.00; count <= 1; count+=0.10) {
                System.out.println(numero+" % "+count+" = "+(numero*count));
            }

        teclado.close();
    }
}
