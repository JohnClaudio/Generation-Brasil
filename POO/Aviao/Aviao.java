package GenerationTurma32.POO.Aviao;

public class Aviao {

    private String modelo;
    private String fabricante;
    private String data_fabricacao;
    private String cor;
    private Double peso;


    public Aviao(String modelo, String fabricante, String data_fabricacao, String cor, Double peso){

        setModelo(modelo);
        setData_fabricacao(data_fabricacao);
        setFabricante(fabricante);
        setCor(cor);
        setPeso(peso);

    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }


    public String getData_fabricacao() {
        return data_fabricacao;
    }

    public void setData_fabricacao(String data_fabricacao) {
        this.data_fabricacao = data_fabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void imprimirDados(){
        System.out.println("Modelo do aviao: " +  getModelo());
        System.out.println("Fabricante do aviao: " +  getFabricante());
        System.out.println("Data de fabricacao do aviao: " +  getData_fabricacao());
        System.out.println("Cor do aviao: " +  getCor());
        System.out.println("Peso do aviao: " +  getPeso());

    }
}
