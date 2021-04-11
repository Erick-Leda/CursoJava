package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    public static void main(String[] args) {


        List<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Ana");
        lista.add(u1);
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Paulo"));
        lista.add(new Usuario("Júlio"));
        lista.add(new Usuario("Júlio"));

        System.out.println(lista.get(3)); // acessar pelo índice

        System.out.println("Removido " + lista.remove(1));
        lista.remove(new Usuario("Paulo"));
        System.out.println(lista.remove(new Usuario("Júlio")));

        System.out.println("Tem a "+new Usuario("Ana")+ " ? "+ lista.contains(new Usuario("Ana")));

        for (Usuario usuario : lista) {
            System.out.println(usuario);
        }
    }
}
