import java.util.ArrayList;

public class Ex01 {
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();

        //Adicionar
        nomes.add("Rodrigo");
        nomes.add("Carlos");
        nomes.add("Ana");

        //Listar
        System.out.println("Lista");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        //Alterar
        nomes.set(1, "Pedro");

        System.out.println("Lista");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        //Remover
        nomes.remove("Pedro");

        System.out.println("Lista apos remover");
        for (String nome : nomes) {
            System.out.println(nome);
        }

    }
}
