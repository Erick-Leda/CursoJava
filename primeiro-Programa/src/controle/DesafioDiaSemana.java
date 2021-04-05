package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o dia da semana: ");
        String dia = entrada.next();

        dia.trim();

        if (dia.equalsIgnoreCase("domingo")){
            System.out.println("1");
        } else if(dia.equalsIgnoreCase("segunda-feira") || dia.equalsIgnoreCase("segundafeira")){
            System.out.println("2");
        } else if(dia.equalsIgnoreCase("terça-feira") || dia.equalsIgnoreCase("terçafeira")){
            System.out.println("3");
        } else if(dia.equalsIgnoreCase("quarta-feira") || dia.equalsIgnoreCase("quartafeira")){
            System.out.println("4");
        } else if(dia.equalsIgnoreCase("quinta-feira") || dia.equalsIgnoreCase("quintafeira")){
            System.out.println("5");
        } else if(dia.equalsIgnoreCase("sexta-feira") || dia.equalsIgnoreCase("sextafeira")){
            System.out.println("6");
        } else if(dia.equalsIgnoreCase("sábado") || dia.equalsIgnoreCase("sabado")){
            System.out.println("7");
        } else{
            System.out.println("Comando Inválido");
        }


    }
}
