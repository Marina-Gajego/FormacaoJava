package exercicios.classes;

public class Carro {
    String modelo;
    int ano;
    String cor;

    public void exibeFichaTecnica(){
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Ano do carro: " + ano);
        System.out.println("Cor do carro " + cor);
    }

    public int idadeCarro(int ano){
        int anoAtual = 2024;
        int idade = (anoAtual - ano);
        return idade;
    }


}
