import java.util.Scanner;

public class Cond05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.print("Informe o nome: ");
            String nome = sc.nextLine();

            System.out.print("Informe a senha: ");
            String senha = sc.nextLine();

            if (nome.equals("Rian")&& senha.equals("9750"))
                System.out.println("Acesso permitido");
            else if (nome.equals("Rochele") && senha.equals("1234"))
                System.out.println("Acesso permitido");
            else
                System.out.println("Acesso negado");

        sc.close();
    }
}
