public class Cliente {
    private String nome;
    private  String endereco;

    public Cliente(String CTnome, String CTendereco) {
        this.nome = CTnome;
        this.endereco = CTendereco;
    }


    
    public String getNome() {
        return nome;
    }
    public void setNome(String CTnome) {
        this.nome = CTnome;
    }



    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String CTendereco) {
        this.endereco = CTendereco;
    }



    public void exibirDados() {
        System.out.println("Nome: "+nome);
        System.out.println("Endereco: "+endereco);
    }
}
