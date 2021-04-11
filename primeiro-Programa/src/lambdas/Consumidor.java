package lambdas;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

    public static void main(String[] args) {


        Consumer<Produto> imprimirNome = p -> System.out.println(p.nome + "!!!");

        Produto p1 = new Produto("Caneta", 2.34, 0.10);

        imprimirNome.accept(p1);

        Produto p2 = new Produto("Lápis", 2.34, 0.08);
        Produto p3 = new Produto("Mouse", 20.34, 0.30);
        Produto p4 = new Produto("Celular", 2000.34, 0.15);
        Produto p5 = new Produto("Fones", 200.34, 0.20);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        produtos.forEach(imprimirNome);

        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println);
    }
}
