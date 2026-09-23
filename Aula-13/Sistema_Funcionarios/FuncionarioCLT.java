package Sistema_Funcionarios;
public class FuncionarioCLT extends Funcionario implements Pagamento{

    public FuncionarioCLT(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public void Pagar(double valor) {
        System.out.println("Valor a receber: R$"+valor);
    }
    
    public void Pagar(double valor, double bonus) {
        double totalBonus = valor+bonus;
        System.out.println("Valor a receber com bonus: R$"+totalBonus);
    }
}
