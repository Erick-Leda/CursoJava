package classe;

import java.util.Scanner;

public class DataTeste {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Data d1 = new Data();
        d1.dia = 15;
        d1.mes = 4;
        d1.ano = 1998;

        Data d2 = new Data();
        d2.dia = 2;
        d2.mes = 6;
        d2.ano = 1998;

        System.out.printf("%d/%d/%d%n", d1.dia, d1.mes, d1.ano);

        System.out.printf("%d/%d/%d", d2.dia, d2.mes, d2.ano);
    }
}
