package exercicios.construtor;

public class ProdutoPerecivel extends produto{
    private String dataValidade;

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public ProdutoPerecivel(int quantidade, double preco, String nome) {
        super(quantidade, preco, nome);
    }

    @Override
    public String toString() {
        return "Produto: " + getNome() + " Preço: " + getPreco() + " Quantidade: " + getQuantidade() + " Validade: " + getDataValidade();
    }
}
