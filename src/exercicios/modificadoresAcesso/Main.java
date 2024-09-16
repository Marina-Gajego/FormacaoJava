package exercicios.modificadoresAcesso;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria();
        contaBancaria1.setTitular("Marina");
        contaBancaria1.setNumeroCOnta(123);
        contaBancaria1.setSaldo(100000);

        System.out.println("Número da Conta: " + contaBancaria1.getNumeroCOnta());
        System.out.println("Saldo: " + contaBancaria1.getSaldo());
        System.out.println("Titular: " + contaBancaria1.getTitular());

        contaBancaria1.setSaldo(1500);
        System.out.println("Novo Saldo: " + contaBancaria1.getSaldo());
        System.out.println("--------------------");

        idadePessoa pessoa1 = new idadePessoa();

        pessoa1.setNome("Marina");
        pessoa1.setIdade(21);
        pessoa1.verifica();

        idadePessoa pessoa2 = new idadePessoa();

        pessoa2.setNome("Marina");
        pessoa2.setIdade(4);
        pessoa2.verifica();
        System.out.println("--------------------");

        Produto produto1 = new Produto();
        produto1.setNome("Laranja");
        produto1.setPreco(2);
        System.out.println("O valor após aplicar o desconto é de  R$" + produto1.aplicarDesconto(20));
        System.out.println("--------------------");

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Marina");
        aluno1.setNota1(10);
        aluno1.setNota2(4);
        System.out.println("A media é " + aluno1.calcularMedia(aluno1.getNota1(), aluno1.getNota2()));
        System.out.println("--------------------");

        Livro livro1 = new Livro();
        livro1.setAutor("J. K. Rowling");
        livro1.setTitulo("Harry Potter e a Pedra Filosofal");
        livro1.exibirDetalhes();

    }
}
