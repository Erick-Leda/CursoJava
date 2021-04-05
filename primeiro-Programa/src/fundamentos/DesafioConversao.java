package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu primeiro salario: ");
        String valorsal1 = scan.nextLine().replace(",", ".");

        System.out.print("Digite seu segundo salario: ");
        String valorsal2 = scan.nextLine().replace(",",".");

        System.out.print("Digite seu terceiro salario: ");
        String valorsal3 = scan.nextLine().replace(",",".");

        double sal1 = Double.parseDouble(valorsal1);
        double sal2 = Double.parseDouble(valorsal2);
        double sal3 = Double.parseDouble(valorsal3);

        double somasal = sal1+sal2+sal3;
        System.out.println("A soma dos três últimos salários é:" +somasal);
        System.out.println("A média dos três últimos salários é:" +somasal/3);

        scan.close();
    }
}
