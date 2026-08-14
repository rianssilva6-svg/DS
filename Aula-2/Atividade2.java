import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("===== Sistema de notas =====");
            System.out.print("Digite o nome do aluno: ");
            String nome = sc.next();

            System.out.printf("Digite a primeira nota do %s: ",nome);
            double nota1 = sc.nextDouble();

            System.out.printf("Digite a segunda nota do %s: ",nome);
            double nota2 = sc.nextDouble();

            double media = (nota1+nota2) / 2;

            System.out.println("===== Resultado =====");
            System.out.printf(" | Nome: %s%n | Nota 1: %.2f%n | Nota 2: %.2f%n | Média: %.2f%n",nome,nota1,nota2,media);

        
        sc.close();
    }
}
