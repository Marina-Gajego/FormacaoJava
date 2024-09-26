package exercicios.heranca;

public class main {
    public static void main(String[] args) {

        modeloCarro modeloCarro = new modeloCarro();
        modeloCarro.defineModelo("Porche");
        modeloCarro.definirPrecos(400, 200, 880);
        modeloCarro.exibirInfo();
        System.out.println("-------------------------------");

        gato gato = new gato();
        gato.emitirSom();
        gato.aranharMoveis();

        cachorro cachorro = new cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();
        System.out.println("-------------------------------");

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(100);
        contaCorrente.sacar(50);
        contaCorrente.consultarSaldo();
        contaCorrente.sacar(90);
        contaCorrente.cobrarTarifaMensal();
        System.out.println("-------------------------------");

        VerificadorPrimo verificadorPrimo = new VerificadorPrimo();
        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificaSeEhPrimo(17);

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.gerarProximoPrimo();
        System.out.println("O próximo primo é: " + proximoPrimo);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(10);

    }
}
