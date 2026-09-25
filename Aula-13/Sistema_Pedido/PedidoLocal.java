public class PedidoLocal extends Pedido implements Pagamento{

    public PedidoLocal(int numero, String cliente, double valor) {
        super(numero, cliente, valor);
    }

    public void Pagar(double valor) {
        System.out.printf("Pagamento em Dinheiro Realizado: R$%.2f%n",valor);
    }
    public void Pagar(double valor, String chavePix) {
        System.out.printf("Pagamento Via Pix Realizado: R$%.2f%n",valor);
        System.out.println("Chave Pix: "+chavePix);
    }
    public void Pagar(double valor, int parcelas) {
        double valorParcela = valor/parcelas;
        System.out.printf("Pagamento em Cartao Realizado: R$%.2f%n",valor);
        System.out.println("Parcelas: "+parcelas);
        System.out.printf("Valor de cada parcela: R$%.2f%n",valorParcela);
    }


}
