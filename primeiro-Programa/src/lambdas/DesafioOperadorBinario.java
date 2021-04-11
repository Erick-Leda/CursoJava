package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioOperadorBinario {

    public static void main(String[] args) {
        /* Minha forma
        Produto p = new Produto("notebook", 3235.89, 0.13);
        UnaryOperator<Double> precReal = preco -> p.preco * (1 - p.desconto);
        UnaryOperator<Double> precImpost = preco -> preco >=2500 ? preco *(1 + 0.085) : preco;
        UnaryOperator<Double> precFrete = preco -> preco >=3000 ? preco + 100 : preco + 50;
        double precoFinal = Math.round(precReal
                .andThen(precImpost)
                .andThen(precFrete)
                .apply(1.0)*100.0)/100.0;
        System.out.println("O preco final é R$ "+precoFinal);
        */

        //Forma do professor
        Function<Produto, Double> precoFinal =
                produto -> produto.preco * (1 - produto.desconto);
        UnaryOperator<Double> impostoMunicipal =
                preco -> preco >= 2500 ? preco * 1.085 : preco;
        UnaryOperator<Double> frete =
                preco -> preco >= 3000 ? preco + 100 : preco + 50;
        UnaryOperator<Double> arredondar =
                preco -> Double.parseDouble(String.format("%.2f", preco));
        Function<Double, String> formatar =
                preco -> ("R$" +preco).replace(".", ",");

        Produto p = new Produto("notebook", 3235.89, 0.13);

        String preco = precoFinal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p);
        System.out.println("O preco final é " +preco);
    }
}
