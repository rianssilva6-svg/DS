public class ProdutoDigital extends Produto implements Venda{

    public ProdutoDigital(String codigo, String nome, double preco) {
        super(codigo, nome, preco);
    }

    @Override
    public void vendas(double preco){
        System.out.println("Valor do produto: R$"+preco);
    }
    public void vendas(double preco, int quantidade){
        double valorDesconto = preco*quantidade;
        System.out.println("Valor do produto com desconto: R$"+valorDesconto);
    }

    public void vendas(double preco, double desconto, int quantidade){
        double valorDesconto = (preco*quantidade)-desconto;
        System.out.println("Valor do produto com desconto: R$"+valorDesconto);
    }
}
