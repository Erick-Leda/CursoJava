package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class Wrappers {

    public static void main(String[] args) {

        //Scanner entrada = new Scanner(System.in);

        Byte b = 100; //byte
        Short s = 1000; //short
        //Integer.parseInt(entrada.next())
        Integer i = 10000; // int
        Long l = 100000L; // long

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);
        System.out.println(l / 3);

        //entrada.close();

        //Float
        Float f = 123.10F;
        System.out.println(f);

        //Double
        Double d = 50.20;
        System.out.println(d);

        //Boolean
        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        //char
        Character c = '#';
        System.out.println(c+"...");
    }
}
