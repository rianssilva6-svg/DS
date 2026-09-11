package Atividade_veiculos;
public class Moto extends Veiculo{
    private float cilindrada;

    public Moto(String marca, int ano, float cilindrada) {
        super(marca, ano);
        this.cilindrada = cilindrada;
    }

    public float getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(float cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override 
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cilindrada: "+cilindrada+"cc");
    }
}
