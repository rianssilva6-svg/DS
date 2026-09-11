package Atividade_funcionarios;
public class Tecnico extends Funcionarios{
    private String setor;

    public Tecnico(String nome, double salario, String setor) {
        super(nome, salario);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }
    public  void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Setor: "+setor);
    }
}
