public class PedidoDelivery extends Pedido implements Pagamento {

    private String endereco;
    private double taxaEntrega;

    public PedidoDelivery(int numero, String cliente, double valor, String endereco, double taxaEntrega) {
        super(numero, cliente, valor);
        this.endereco = endereco;
        this.taxaEntrega = taxaEntrega;
    }

    public double calcularTotal() {
        return getValor()+taxaEntrega;
    }
    
    @Override
    public void Pagar(double valor) {
        System.out.printf("Pagamento em dinheiro realizado: R$%.2f%n",valor);
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

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Endereco: "+endereco);
        System.out.printf("Taxa de entrega: R$%.2f%n",taxaEntrega);
        System.out.printf("Taxa com entrega: R$%.2f%n",calcularTotal());
    }
}
