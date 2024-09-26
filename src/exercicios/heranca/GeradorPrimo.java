package exercicios.heranca;

import java.util.Random;

public class GeradorPrimo extends NumerosPrimos{

    public int gerarProximoPrimo(){
        Random random = new Random();
        int numeroAleatorio = random.nextInt(500 - 0 + 1) + 0;
        return numeroAleatorio;
    }
}
