package exercicios.interfaceExercicios;

public class main {
    public static void main(String[] args) {

        ConversorMoeda conversorMoeda = new ConversorMoeda();
        System.out.println("Dolar convertido em real: R$ " + conversorMoeda.converterDolarParaReal(150));
        System.out.println("-----------------");

        CalculadoraSalaRetangular calculadoraSalaRetangular = new CalculadoraSalaRetangular();
        System.out.println("Area: " + calculadoraSalaRetangular.calculaArea(2, 5));
        System.out.println("Perimetro: " + calculadoraSalaRetangular.calculaPerimetro(2, 5));
        System.out.println("-----------------");

        TabuadaMultiplicacao tabuadaMultiplicacao = new TabuadaMultiplicacao();
        tabuadaMultiplicacao.mostrarTabuada(5);
        System.out.println("-----------------");

        ConversorTemperaturaPadrao conversorTemperaturaPadrao = new ConversorTemperaturaPadrao();
        conversorTemperaturaPadrao.celsiusParaFahrenheit(30);
        conversorTemperaturaPadrao.fahrenheitParaCelsius(50);
        System.out.println("-----------------");

        Livro livro = new Livro();
        livro.calcularPrecoFinal(10);
        ProdutoFisico produtoFisico = new ProdutoFisico();
        produtoFisico.calcularPrecoFinal(85);
        System.out.println("-----------------");

        Produto produto = new Produto();
        System.out.println("Preço: " + produto.precoTotal(10));
        System.out.println("Desconto: " + produto.aplicarDesconto(15));
        Servico servico = new Servico();
        System.out.println("Preço: " + servico.precoTotal(15));
        System.out.println("Desconto: " + servico.aplicarDesconto(19));
    }
}
