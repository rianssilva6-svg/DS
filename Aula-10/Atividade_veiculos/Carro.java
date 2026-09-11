package Atividade_veiculos;
public class Carro extends Veiculo{
    private int qtdPorta;

    public Carro(String marca, int ano, int qtdPorta) {
        super(marca, ano);
        this.qtdPorta = qtdPorta;
    }

    public int getQtdPorta() {
        return qtdPorta;
    }
    public void setQtdPorta(int qtdPorta) {
        this.qtdPorta = qtdPorta;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Quantidade de portas: "+qtdPorta);
    }
}
