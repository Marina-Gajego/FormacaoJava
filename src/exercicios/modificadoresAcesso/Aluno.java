package exercicios.modificadoresAcesso;

public class Aluno {
    private String nome;
    private int nota1;
    private int nota2;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public int getNota1() {
        return nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public double calcularMedia(int nota1, int nota2){
        double media = (this.nota1 + this.nota2)/2;
        return media;
    }

}
