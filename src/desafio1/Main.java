package desafio1;

public class Main {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("Baby");
        musica.setArtista("Justin Bieber");
        musica.setAlbum("My Word 2.0");
        musica.setGenero("Pop");
        musica.setDuracao(3);

        //simula as reproduções
        for (int i = 0; i < 100; i++){
            musica.reproduzir();
        }

        //simula as curtidas
        for (int i = 0; i < 100; i++){
            musica.curtir();
        }

        Podcast podcast = new Podcast();
        podcast.setDescricao("Podcast sobre o curso de java alura");
        podcast.setHost("Alura");
        podcast.setClassificacao(5);
        podcast.setDuracao(100);
        podcast.setTitulo("Aprendendo Java Alura");

        //simula as reproduções
        for (int i = 0; i < 550; i++){
            podcast.reproduzir();
        }

        //simula as curtidas
        for (int i = 0; i < 300; i++){
            podcast.curtir();
        }

        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.inclui(musica);
        minhasPreferidas.inclui(podcast);

    }
}
