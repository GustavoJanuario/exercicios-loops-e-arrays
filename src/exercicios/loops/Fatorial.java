package exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!=5.4.3.2.1=120
 */
public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        for(int i = fatorial; i >= 1; i--) {
            multiplicacao = multiplicacao * i;
        }
        System.out.print(fatorial + "! = ");

        for (int i = fatorial; i >1; i--) {
            System.out.print(i + ".");
        }

        System.out.println("1 = " + multiplicacao);
    }
}
