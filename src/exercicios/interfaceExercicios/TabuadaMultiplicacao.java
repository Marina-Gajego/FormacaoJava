package exercicios.interfaceExercicios;

public class TabuadaMultiplicacao implements Tabuada{
    @Override
    public void mostrarTabuada(int numero) {
        int resultado;
        for (int i = 0; i <= 10; i++){
            resultado = i * numero;
            System.out.println(numero + " * " + i + " = " + resultado);
        }
    }
}
