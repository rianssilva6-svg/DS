public class Formatacao {
    public static void main(String[] args) {
        String product = "Teclado";
        int quantidade = 2;
        double preco = 89.90;

        System.out.printf("Produto: %s%n",product);
        System.out.printf("Quantidade: %d%n",quantidade);
        System.out.printf("Preço: R$%.2f%n",preco);
    }
}
