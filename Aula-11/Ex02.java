import java.util.ArrayList;

public class Ex02 {
    public static void main(String[] args) {
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

        numeros.remove(1);

        System.out.println("\n===== Lista apos remover =====");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}
