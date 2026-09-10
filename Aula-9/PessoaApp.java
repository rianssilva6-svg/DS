import java.util.Scanner;

public class PessoaApp {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");

        Scanner sc = new Scanner(System.in);

            System.out.print("Digite o codigo da pessoa: ");
            int codigo = sc.nextInt();
            System.out.print("Digite o nome: ");
            String nome = sc.next();

            Pessoa p1 = new Pessoa(codigo, nome);
            Pessoa p2 = new Pessoa(2, "Carlos");


            //Acessador
            System.out.println("Pessoa: "+p1.getCodigo()+" | nome: "+p1.getNome());

            //Modificador
            p1.setNome("Pedro");


            System.out.println("Pessoa: "+p2.getCodigo()+" | nome: "+p1.getNome());
        sc.close();
    }
}
