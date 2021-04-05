package controle;

public class DesafioIf {
    public static void main(String[] args) {

        double nota = 1.3;

        if (nota >= 9.0); { // ; extra, causa um bug
            System.out.println("Aprovado");
        }
    }
}
