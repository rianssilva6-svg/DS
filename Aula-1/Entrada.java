import java.util.Scanner;

public class Entrada
{
    
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);

            System.out.print("informe o nome: ");
            String nome = sc.nextLine();

            System.out.print("informe n1: ");
            double n1 = sc.nextDouble();

            System.out.print("informe n2: ");
            double n2 = sc.nextDouble();

            double media = (n1+n2)/2;

            System.out.println("Olá "+nome+" Sua média é: "+media);

        sc.close();
    }
}
