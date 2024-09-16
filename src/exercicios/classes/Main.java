package exercicios.classes;

//Crie uma classe Pessoa com um método que exibe "Olá, mundo!" no console.
//Crie uma classe Calculadora com um método que recebe um número como parâmetro e retorna o dobro desse número.
//Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.
//Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.
//Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações. Crie uma instância da classe Aluno, atribua valores aos seus atributos e utilize o método para exibir as informações.

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.digaOi();
        System.out.println("-----------------------------------------------");

        Calculadora calculadora1 = new Calculadora();
        int numero = 10;
        System.out.println("O dobro do numero é " + calculadora1.returnaDobro(numero));
        System.out.println("-----------------------------------------------");

        Musica musica1 = new Musica();
        musica1.titulo = "Baby";
        musica1.artista = "Justion Bieber";
        musica1.anoLanc = 2010;

        musica1.avalia(10);
        musica1.avalia(0);
        musica1.avalia(7);
        musica1.avalia(4);

        System.out.println("A media das avaliações é " + musica1.media());
        System.out.println("-----------------------------------------------");

        Carro carro1 = new Carro();
        carro1.modelo = "Audi A6 Sedã";
        carro1.ano = 2018;
        carro1.cor = "Azul";

        carro1.exibeFichaTecnica();
        System.out.println("A idade do carro é: " + carro1.idadeCarro(carro1.ano));
        System.out.println("-----------------------------------------------");

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Marina";
        aluno1.idade = 21;

        aluno1.informacoes();
    }
}
