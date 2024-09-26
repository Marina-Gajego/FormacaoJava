package exercicios.interfaceExercicios;

public class Servico implements Vendavel{
    double valorHora = 15;

    @Override
    public double precoTotal(int quantidade) {
        return valorHora * quantidade;
    }

    @Override
    public double aplicarDesconto(double percentualDesconto) {
        return valorHora -= valorHora * (percentualDesconto/100.0);
    }
}
