package ScreenMatch;

import ScreenMatch.modelos.Filme;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome("Vingadores");
        meuFilme.setAnoDeLancamento(2010);
        meuFilme.setDuracaoEmMinutos(135);
        meuFilme.isIncluidoNoPlano();

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(10);
        meuFilme.avalia(8);
        meuFilme.avalia(7);

        System.out.println("Média das avaliações do filme " + meuFilme.getNome() + " é " + meuFilme.pegaMedia());


    }
}
