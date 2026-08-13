import java.util.Scanner;

public class atividade {
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);

            System.out.println("===== Sistema de calculo =====");

            System.out.print("informe o primeiro número: ");
            double n1 = sc.nextDouble();

            System.out.print("informe o segundo número: ");
            double n2 = sc.nextDouble();

            double soma = (n1+n2);
            double sub = (n1-n2);
            double multi = (n1*n2);
            double div = (n1/n2);

            System.out.println("A soma: "+soma+"\nA subtração: "+sub+"\nA multiplicação: "+multi+"\nA divisão: "+div);


            System.out.println("\n");
            

            System.out.println("===== Sistema de média =====");

            System.out.print("informe o primeiro número: ");
            double nota1 = sc.nextDouble();

            System.out.print("informe o segundo número: ");
            double nota2 = sc.nextDouble();

            double media = (nota1+nota2) / 2;
            System.out.println("Olá, sua média é: "+media);


            System.out.println("\n");


            System.out.println("===== Sistema de média =====");

            System.out.print("informe o primeiro número: ");
            nota1 = sc.nextDouble();

            System.out.print("informe o segundo número: ");
            nota2 = sc.nextDouble();

            System.out.print("informe o 3° número: ");
            double nota3 = sc.nextDouble();

            media = (nota1+nota2+nota3) / 3;
            System.out.println("Olá, sua média é: "+media);


            System.out.println("\n");


            System.out.println("===== Calculando Trabalho =====");
            System.out.print("Digite a força do objeto: ");
            float forca = sc.nextFloat();

            System.out.print("Digite a distancia: ");
            float distancia = sc.nextFloat();

            float trabalho = forca * distancia;

            System.out.println("O Calculo do trabalho é de: "+trabalho);


            System.out.println("\n");


            System.out.println("===== Calculo de IMC =====");
            System.out.print("Informe o seu peso: ");
            float peso = sc.nextFloat();

            System.out.print("Digite a sua altura: ");
            float altura = sc.nextFloat();

            float imc = peso / (altura*2);

            if (imc < 18.5) {
                System.out.println("Muito abaixo do peso!!");
            }
            else if (imc >= 18.5 && imc <= 24.9) {
                System.out.println("Peso normal");
            }
            else {
                System.out.println("Sobrepeso");
            }
        sc.close();
    }
}
