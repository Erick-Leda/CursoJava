package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

    public static void main(String[] args) {

        SortedSet<String> listaAprovados = new TreeSet<>();
        listaAprovados.add("Jorge");
        listaAprovados.add("Martielo");
        listaAprovados.add("Predo");
        listaAprovados.add("Carlão");
        listaAprovados.add("Júlia");

        for (String candidato: listaAprovados){
            System.out.println(candidato);
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        //nums.get(1); /não é possível acessar pelo índice

        for (int num: nums){
            System.out.println(num);
        }
    }
}
