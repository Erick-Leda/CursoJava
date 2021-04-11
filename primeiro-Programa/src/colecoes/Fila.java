package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        // Offer e Add -> adicionam elementos na fila
        // Diferença é o comportamento ocorre quando a fila está cheia
        fila.add("Amalia"); // Retorna falso
        fila.offer("Bia"); // Lança uma exceção

        fila.offer("Daniel");

        fila.add("Jorge");

        fila.offer("Flávio");

        // Peek e Element -> obter o próximo elemento da fila sem remover
        // Diferença é o comportamento ocorre quando a fila está vazia!

        System.out.println(fila.peek()); // Retorna null
        System.out.println(fila.element()); // Lança uma exceção


        // Poll e Remove -> obter o próximo elemento da fila e remove
        // Diferença é o comportamento ocorre quando a fila está vazia!

        System.out.println(fila.poll()); // Retorna null
        System.out.println(fila.remove()); // Lança uma exceção

        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove());

        //fila.clear();
        //fila.size();
        //fila.isEmpty();
        //fila.contains(...);

    }
}
