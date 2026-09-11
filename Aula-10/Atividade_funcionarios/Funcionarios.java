package Atividade_funcionarios;
public class Funcionarios {
    private String nome;
    private double salario;

    public Funcionarios(String CTnome, double CTsalario) {
        this.nome = CTnome;
        this.salario = CTsalario;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String CTnome) {
        this.nome = CTnome;
    }




    public double getSalario() {
        return salario;
    }
    public void setSalario(double CTsalario) {
        this.salario = CTsalario;
    }




    public void exibirDados() {
        System.out.println("Nome: "+nome);
        System.out.println("Salario: "+salario);
    }

}
