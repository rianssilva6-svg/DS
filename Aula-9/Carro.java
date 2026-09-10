public class Carro {
    private String marca;
    private String modelo;
    private int anofabricacao;

    //Construtor
    public Carro(String CTmarca, String CTmodelo, int CTanofabricacao) {
        this.marca = CTmarca;
        this.modelo = CTmodelo;
        this.anofabricacao = CTanofabricacao;
    }


    //Estrutura da função da marca
    public String getMarca() {
        return marca;
    }
    public void setMarca(String CTmarca) {
        this.marca = CTmarca;
    }



    //Estrutura da função do modelo
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String CTmodelo) {
        this.modelo = CTmodelo;
    }



    //Estrutura da função do ano de fabricação
    public int getAnoFabricacao() {
        return anofabricacao;
    }
    public void setAnoFabricacao(int CTanofabricacao) {
        this.anofabricacao = CTanofabricacao;
    }

}
