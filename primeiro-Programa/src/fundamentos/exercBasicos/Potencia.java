package fundamentos.exercBasicos;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Digite um valor: ");

        double val = s.nextDouble();

        System.out.printf("O valor é %f", Math.pow(val, 2));
        System.out.printf("O valor é %f", Math.pow(val, 3));

    }
}
