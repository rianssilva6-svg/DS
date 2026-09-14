import java.util.ArrayList;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            ArrayList<Integer> numeros = new ArrayList<>();

            numeros.add(5);
            numeros.add(4);
            numeros.add(3);

            System.out.println("\n===== Lista =====");
            for (Integer numero : numeros) {
                System.out.println(numero);
            }

            numeros.set(2, 5);

            System.out.println("\n===== Lista =====");
            for (Integer numero : numeros) {
                System.out.println(numero);
            }

            System.out.print("\nDigite o numero que deseja remover: ");
            int numeroRemover = sc.nextInt();

            numeros.remove(Integer.valueOf(numeroRemover));

            System.out.println("\n===== Lista apos remover =====");
            for (Integer numero : numeros) {
                System.out.println(numero);
            }


        sc.close();
    }
}