package exercicios.interfaceExercicios;

public class ProdutoFisico implements Calculavel{
    @Override
    public double calcularPrecoFinal(double preco) {
        return preco * 1.05;
    }
}
