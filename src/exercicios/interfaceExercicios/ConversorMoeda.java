package exercicios.interfaceExercicios;

public class ConversorMoeda implements ConversaoFinanceira{


    @Override
    public Double converterDolarParaReal(double valorDolar) {
        Double valorConvertido = (valorDolar * 5.25);
        return valorConvertido;
    }
}
