package arrays;

import java.util.Scanner;

public class DesafioArray {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Quantas notas você quer informar ? ");
        int quan = s.nextInt();

        double[] notas = new double[quan];

        for (int i = 0; i < notas.length; i++){
            System.out.println("Digite a "+ (i+1)+"º"+ " nota: ");
            notas[i] = s.nextDouble();
        }

        System.out.println("As notas do aluno são: ");
        for (double nota : notas) {
            System.out.print(nota+" ");
        }
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        System.out.println("\nA média do aluno é: "+soma/quan);
    }
}
