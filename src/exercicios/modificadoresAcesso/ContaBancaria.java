package exercicios.modificadoresAcesso;

//Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (publico). Implemente métodos getters e setters para os atributos privados.

public class ContaBancaria {
    private int numeroCOnta;
    private double saldo;
    private String titular;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNumeroCOnta(int numeroCOnta) {
        this.numeroCOnta = numeroCOnta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroCOnta() {
        return numeroCOnta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
}
