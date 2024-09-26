package exercicios.interfaceExercicios;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    @Override
    public void celsiusParaFahrenheit(double temp) {
        double conversao = (temp * 9/5) + 32;
        System.out.println("Conversão: " + conversao);
    }

    @Override
    public void fahrenheitParaCelsius(double temp) {
        double conversao = (temp - 32) * 5/9;
        System.out.println("Conversão: " + conversao);
    }
}
