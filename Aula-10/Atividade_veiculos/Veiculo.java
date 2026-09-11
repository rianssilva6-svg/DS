package Atividade_veiculos;
public class Veiculo {
    private String marca;
    private int ano;

    public Veiculo(String CTmarca, int CTano) {
        this.marca = CTmarca;
        this.ano = CTano;
    }



    public String getMarca() {
        return marca;
    }
    public void setMarca(String CTmarca) {
        this.marca = CTmarca;
    }




    public int getAno() {
        return ano;
    }
    public void setAno(int CTano) {
        this.ano = CTano;
    }



    
    public void exibirDados() {
        System.out.println("Marca: "+marca);
        System.out.println("Ano: "+ano);
    }

}
