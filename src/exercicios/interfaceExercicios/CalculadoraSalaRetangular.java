package exercicios.interfaceExercicios;

public class CalculadoraSalaRetangular implements CalculoGeometrico{
    @Override
    public Double calculaArea(double altura, double largura) {
        return altura * largura;
    }

    @Override
    public Double calculaPerimetro(double altura, double largura) {
        return (altura * 2) + (largura * 2);
    }
}
