package fundamentos;

public class ConversaoTiposPrimitivosNumerico {
    public static void main(String[] args) {

        double a = 1.1235235123562; //implícita
        System.out.println(a);

        float b = (float) 1.1235235123562; //explícita (CAST)
        System.out.println(b);

        int c = 127;
        byte d = (byte) c; //explícita (CAST)
        System.out.println(d);

        double e = 1.99999999999;
        int f = (int) e;
        System.out.println(f);
    }
}
