package fundamentos.exercBasicos;

import javax.swing.*;

public class Imc {

    public static void main(String[] args) {

        String peso = JOptionPane.showInputDialog(
                "Digite o seu peso:");
        String altura = JOptionPane.showInputDialog(
                "Digite sua altura:");

        double pes = Double.parseDouble(peso);
        double alt = Double.parseDouble(altura);

        double imc = pes / Math.pow(alt, 2);

        System.out.println("Seu imc é " +imc);



    }
}
