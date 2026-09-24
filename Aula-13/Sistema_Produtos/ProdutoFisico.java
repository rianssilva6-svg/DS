public class ProdutoFisico extends Produto implements Venda{

    public ProdutoFisico(String codigo, String nome, double preco) {
        super(codigo, nome, preco);
    }

    @Override
    public void vendas(double preco){
    }
    public void vendas(double preco, double frete){
        double valorFrete = preco+frete;
        System.out.println("Valor do produto com frete: R$"+valorFrete);
    }

    public void vendas(double preco, double frete, int quantidade){
        double valorFrete = (preco*quantidade)+frete;
        System.out.println("Valor total do produto com frete: R$"+valorFrete);
    }
    public void vendas(double preco, double desconto, double frete, int quantidade){
        double valorDesconto = (preco*quantidade) + frete - desconto;
        System.out.println("Valor do produto com desconto: R$"+valorDesconto);
    }
}
