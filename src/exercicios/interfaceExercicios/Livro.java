package exercicios.interfaceExercicios;

public class Livro implements Calculavel{
    private String autor;

    @Override
    public double calcularPrecoFinal(double preco) {
        return preco * 0.9;
    }
}
