package fundamentos.exercBasicos;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {

        Scanner val = new Scanner(System.in);
        System.out.println("Digite o valor da base do triangulo em cm: ");
        double base = val.nextDouble();

        System.out.println("Digite o valor da altura do triangulo em cm: ");
        double altura = val.nextDouble();

        double triang = (base*altura)/2;

        System.out.println("A área do triangulo é: "+triang);
    }
}
