package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = entrada.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = entrada.nextDouble();

        System.out.println("Digite a operação ( + ) ( - ) ( * ) ( / ) ( % )");
        String s = entrada.next();

        double soma = num1 + num2;
        double sub = num1 - num2;
        double mult = num1 * num2;
        double div = num1 / num2;
        double mod = num1 % 2;

        double resultadoFinal = s.equals("+") ? num1 + num2 : s.equals("-") ? num1 - num2 : s.equals("*")
                ? num1 * num2 : s.equals("/") ? num1 / num2 : s.equals("%") ? num1%num2 : 0 ;

        System.out.printf("%.2f %s %.2f = ? %n", num1, s, num2);

        System.out.println("Resultado: "+resultadoFinal);
        entrada.close();
    }
}
