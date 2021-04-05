package classe;

import java.util.Scanner;

public class ProdutoTeste {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Produto p1 = new Produto();
        p1.nome = "notebook";
        p1.preco = 4200.45;
        p1.desconto = 0.2;

        var p2 = new Produto();
        p2.nome = "caneta azul";
        p2.preco = 1.75;
        p2.desconto = 0.1;

        double precoFinal1 = p1.preco * (1- p1.desconto);
        double precoFinal2 = p2.preco * (1- p2.desconto);

        System.out.println(p1.nome);
        System.out.println(precoFinal1);

        System.out.println(p2.nome);
        System.out.println(precoFinal2);
    }
}
