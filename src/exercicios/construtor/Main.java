package exercicios.construtor;

import java.util.ArrayList;
import java.util.List;


//Crie uma classe `Produto` com atributos como nome, preco, e quantidade. Em seguida, crie uma lista de objetos Produto utilizando a classe ArrayList. Adicione alguns produtos, imprima o tamanho da lista e recupere um produto pelo índice.
//Implemente o metodo toString() na classe `Produto` para retornar uma representação em texto do objeto. Em seguida, imprima a lista de produtos utilizando o método System.out.println().
//Modifique a classe `Produto` para incluir um construtor que aceite parâmetros para inicializar os atributos. Em seguida, crie objetos Produto utilizando esse novo construtor.
//Crie uma classe `ProdutoPerecivel` que herde de `Produto`. Adicione um atributo dataValidade e um construtor que utilize o construtor da classe mãe (super) para inicializar os atributos herdados. Crie um objeto ProdutoPerecivel e imprima seus valores.


public class Main {
    public static void main(String[] args) {

        produto produto = new produto(5, 10, "Batata");
//        produto.setNome("Batata");
//        produto.setPreco(10);
//        produto.setQuantidade(5);

        produto produto1 = new produto(50, 3, "Alface");
//        produto1.setNome("ALface");
//        produto1.setPreco(3);
//        produto1.setQuantidade(50);

        produto produto2 = new produto(10, 5, "Tomate");
//        produto2.setNome("Tomate");
//        produto2.setPreco(5);
//        produto2.setQuantidade(10);

        List<produto> listaProduto = new ArrayList<>();
        listaProduto.add(produto);
        listaProduto.add(produto1);
        listaProduto.add(produto2);

        System.out.println("Tamanho da lista " + listaProduto.size());
        System.out.println("Produto: " + listaProduto.get(1));

        System.out.println(listaProduto);

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel(5, 50, "Espaguete");
        produtoPerecivel.setDataValidade("09/10/2024");
        System.out.println(produtoPerecivel);
    }
}
