package exercicios.heranca;

public class ContaBancaria {
    protected double saldo;


    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        if (valor > saldo){
            System.out.println("O valor informado é maior que o saldo na conta");
        }else{
            saldo -= valor;
            System.out.println("Saque realizado" + saldo);
        }

    }

    public void consultarSaldo(){
        System.out.println("Saldo atual: R$ " + saldo);
    }

}
