package Sistema_Funcionarios;

public class FuncionarioFreeLancer extends Funcionario implements Pagamento{


    public FuncionarioFreeLancer(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public void Pagar(double valor) {
    }

    public void Pagar(double valor, int horasTrabalhadas) {
        double total = valor*horasTrabalhadas;
        System.out.println("Valor a receber: R$"+total);
    }
    public void Pagar(double valor, int horasTrabalhadas, double bonus) {
        double totalBonus = (valor*horasTrabalhadas) + bonus;
        System.out.println("Valor a receber com bonus: R$"+totalBonus);
    }
}
