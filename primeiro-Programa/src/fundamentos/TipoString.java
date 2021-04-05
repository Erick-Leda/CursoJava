package fundamentos;

import java.util.Locale;

public class TipoString {

    public static void main(String[] args) {
        System.out.println("Olá Pessoal".charAt(4));

        String s = "Boa noite";
        s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s+("!!!"));
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.toUpperCase().endsWith("TARDE"));
        System.out.println(s.length());
        System.out.println(s.equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.9F;

        String maisUmaFrase ="Nome: "+ nome + "\nSobrenome: "+sobrenome+
                "\nIdade: "+idade+" \nSalario: " +salario+ "\n\n";

        System.out.println("Nome: "+ nome + "\nSobrenome: "+sobrenome+
                "\nIdade: "+idade+" \nSalario: " +salario+ "\n\n");

        System.out.printf("O senhor %s\n%s\n tem %d anos\n e recebe R$%.2f reais\n\n",
                nome, sobrenome, idade, salario);

        String frase = String.format("O senhor %s\n%s\n tem %d anos\n e recebe R$%.2f reais\n\n",
                nome, sobrenome, idade, salario);

        System.out.println(frase);
        System.out.println(maisUmaFrase);

        System.out.println("Frase qualquer".contains("qual"));

        System.out.println("Frase qualquer".indexOf("qual"));

        System.out.println("Frase qualquer".substring(6, 10));
    }


}
