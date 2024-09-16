package exercicios.classes;

public class Musica {
    String titulo;
    String artista;
    int anoLanc;
    double avaliacao;
    int numAvaliacoes;

    public void exibeFichaTecnica(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista + " + artista);
        System.out.println("Ano de lançamento: " + anoLanc);
        System.out.println("Avaliações: " + avaliacao);
        System.out.println("Numero de avaliações: " + numAvaliacoes);
    }

    public void avalia(double numero){
        avaliacao += numero;
        numAvaliacoes++;
    }

    public double media(){
        double media = (avaliacao/numAvaliacoes);
        return media;
    }

}
