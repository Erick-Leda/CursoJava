package lambdas;

import java.util.Arrays;
import java.util.List;

public class ForEach {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

        System.out.println("Forma tradicional do ForEach...");
        for (String nome: aprovados) {
            System.out.println(nome);
        }

        System.out.println("\nLambda #01...");
        aprovados.forEach(nome -> System.out.println(nome + "!!!"));

        meuImprimir("\nLambda #02...");
        aprovados.forEach(nome -> meuImprimir(nome + "!!!"));

        System.out.println("\n Method Reference...");
        aprovados.forEach(System.out::println);

        System.out.println("\n Method Reference #02...");
        aprovados.forEach(ForEach::meuImprimir);
    }

    static void meuImprimir(String nome) {
        System.out.println("Oi! Meu nome é " +nome);
    }
}
