package exercicios.interfaceExercicios;

public class Produto implements Vendavel{
    double preco = 5;

    @Override
    public double precoTotal(int quantidade) {
        return preco * quantidade;
    }

    @Override
    public double aplicarDesconto(double percentualDesconto) {
        return preco -= preco * (percentualDesconto / 100.0);
    }
}
