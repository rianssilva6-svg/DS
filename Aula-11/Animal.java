package Atividade_animal;

public class Animal {
    private String nome;
    private int idade;

    public Animal(String CTnome, int CTidade) {
        this.nome = CTnome;
        this.idade = CTidade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String CTnome) {
        this.nome = CTnome;
    }




    public int getIdade() {
        return idade;
    }
    public void setIdade(int CTidade) {
        this.idade = CTidade;
    }



    public void exibirInfo() {
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
    }
}
