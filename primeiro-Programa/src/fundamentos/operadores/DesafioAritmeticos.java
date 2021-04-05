package fundamentos.operadores;

public class DesafioAritmeticos {
    public static void main(String[] args) {

//      double a = Math.pow((6 * (3 + 2)), 2) / ( 3 * 2);
//      double b = Math.pow(((1 - 5) * 2 - (1 - 5) * 7)/2,2);

        double a = Math.pow(6*(3+2), 2);

        double b = 3*2;

        double c = ((1-5)*(2-7)/2);

        double d = Math.pow(c, 2);

        double e = Math.pow(10, 3);

        double f = Math.pow((a/b - d) ,3);

        double calc = f/e;

        System.out.println(calc);
    }
}
