package colecoes;

import java.util.HashSet;

public class Hash {

    public static void main(String[] args) {

        HashSet<Usuario> usuarios = new HashSet<Usuario>();

        usuarios.add(new Usuario("Jorge"));
        usuarios.add(new Usuario("Gilson"));
        usuarios.add(new Usuario("Carlos"));

        System.out.println(usuarios.contains(new Usuario("Gilson")));
    }
}
