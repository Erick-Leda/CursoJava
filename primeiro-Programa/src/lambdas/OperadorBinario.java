package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

    public static void main(String[] args) {

        BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;

        System.out.println(media.apply(9.8, 5.6));

        BiFunction<Double, Double, String> resultado = (n1, n2) -> {
            double notaFinal = (n1 + n2)/2;
            return notaFinal >=7 ? "Aprovado" : "Reprovado";
        };

        System.out.println(resultado.apply(7.4,9.5));

        Function<Double, String> conceito = med -> med >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(media.andThen(conceito).apply(9.6, 8.3));
    }
}
