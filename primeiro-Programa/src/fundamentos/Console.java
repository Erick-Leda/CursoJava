package fundamentos;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.print(" dia !\n");

        System.out.println("Bom");
        System.out.println("dia!");

        System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3 ,4 ,5 ,6);
        System.out.printf("Salário: %.1f %n", 1234.5678);
        System.out.printf("Nome: %s %n", "Erick");

        Scanner entrada = new Scanner(System.in);

        System.out.printf("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.printf("Digite seu Sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.printf("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.printf("%s %s tem %d anos %n%n", nome, sobrenome, idade);

        System.out.println("O nome do usuario é: "+nome + " "+sobrenome+" e você tem "+idade+ " anos");

        entrada.close();
    }
}
