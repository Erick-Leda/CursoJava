package fundamentos.operadores;

public class DesafioLogicos {

    public static void main(String[] args) {
        // Trabalho na terça (V ou F)
        // Trabalho na quinta (V ou F)

        //Se os dois forem V, comprar TV de 50' e tomar sorvete
        //Se só um for V, comprar TV de 32' e tomar sorvete
        //Se os dois forem F, sem TV e sem sorvete
        //Se não tomar sorvete, mais saudável

        boolean trab1= true;
        boolean trab2 = true;

        boolean comprouTV50 = trab1 && trab2;
        boolean comprouTV32 = trab1 ^ trab2;
        boolean comprousorvete = trab1 || trab2;

        boolean maissaudavel = !comprousorvete;

        System.out.println("\nComprou tv 50 ? "+comprouTV50);
        System.out.println("\nComprou tv 32 ? "+comprouTV32);
        System.out.println("\nComprou sorvete ? "+comprousorvete);
        System.out.println("\nMais saudavel ? "+maissaudavel);
    }
}
