package desafioFinal;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " é sucesso abusoluto, todos amam!!!");
        }else{
            System.out.println(audio.getTitulo() + " tem uma galera curtindo!!");
        }
    }
}
