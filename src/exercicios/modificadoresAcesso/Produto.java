package exercicios.modificadoresAcesso;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double aplicarDesconto(int desconto){
        double valorDesconto = (preco * desconto) / 100.0f;
        double valorFinal = preco - valorDesconto;
        return valorFinal;
    }

}
