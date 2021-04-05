package arrays;

public class Foreach {

    public static void main(String[] args) {

        double[] notas = { 9.5, 6.4, 8.3 };

//        for (int i = 0; i < notas.length; i++){
//            System.out.println(notas[i]);
//        }

        for (double nota: notas) {
            System.out.print(nota + " ");
        }
    }
}
