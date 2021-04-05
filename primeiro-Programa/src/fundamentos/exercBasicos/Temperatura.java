package fundamentos.exercBasicos;

public class Temperatura {

    public static void main(String[] args) {
        double celsius;
        double fahrenheit;
        final double num = 32;
        final double num2 = 5/9.0;

        celsius = 35;
        //fahrenheit = 90;

        fahrenheit = (celsius * 9/5) + 32;

        //celsius = (fahrenheit - num) * num2;

       // System.out.println("O resultado é "+ celsius+ "ºC");
        System.out.println("O resultado é "+ fahrenheit+ "ºF");
    }
}
