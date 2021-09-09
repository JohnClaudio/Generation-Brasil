package GenerationTurma32.POO.ProdutoEletronico;

public class ProdutoEletronico {
    private String nomeProduto;
    private Double preco;
    private String data_fabricacao;
    private String Categoria;

    public ProdutoEletronico (String nomeProduto,Double preco, String data_fabricacao, String categoria)
    {
        setNomeProduto(nomeProduto);
        setPreco(preco);
        setData_fabricacao(data_fabricacao);
        setCategoria(categoria);

    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getData_fabricacao() {
        return data_fabricacao;
    }

    public void setData_fabricacao(String data_fabricacao) {
        this.data_fabricacao = data_fabricacao;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public void imprimirDados(){
        System.out.println("o nome do produto é: " + getNomeProduto());
        System.out.println("o preco do produto é: " + getPreco());
        System.out.println("a data de fabricacao do produto é: " + getData_fabricacao());
        System.out.println("a categoria do produto é: " + getCategoria());
    }


}
