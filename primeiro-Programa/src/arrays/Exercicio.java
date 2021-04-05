package arrays;

import java.util.Arrays;

public class Exercicio {

    public static void main(String[] args) {

        double[] notasAlunoA = new double[4];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 9.1;
        notasAlunoA[3] = 9.8;

        System.out.println(Arrays.toString(notasAlunoA));

        double totalAlunoA = 0;
        for (int i = 0; i<notasAlunoA.length; i++){
            totalAlunoA += notasAlunoA[i];
        }
        System.out.println("A média do aluno é: "+totalAlunoA/notasAlunoA.length);

        double[] notasAlunoB = {6.7, 5.7, 8.7, 9.0 };

        System.out.println(Arrays.toString(notasAlunoB));

        double totalAlunoB = 0;

        for (int i = 0; i<notasAlunoB.length; i++){
            totalAlunoB += notasAlunoB[i];
        }

        System.out.println("A média do aluno é: "+totalAlunoB/notasAlunoB.length);
    }
}
