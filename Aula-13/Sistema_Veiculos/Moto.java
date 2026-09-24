public class Moto extends Veiculo implements Aluguel{

    public Moto(String placa, String modelo, int ano, double valor_diaria) {
        super(placa, modelo, ano, valor_diaria);
    }

    @Override
    public void aluguel(double valor) {
    }
    public void aluguel(double valor, int dia) {
        double valorTotal = (valor*dia);
        System.out.println("Valor total do aluguel do veiculo: R$"+valorTotal);
    }
    public void aluguel(double valor, int dia, double desconto) {
        double valorTotal = (valor*dia) - desconto;
        System.out.println("Valor total do aluguel com desconto do veiculo: R$"+valorTotal);
    }
}
