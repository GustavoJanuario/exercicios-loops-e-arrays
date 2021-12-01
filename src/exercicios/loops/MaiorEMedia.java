package exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números e informe o maior número e a média desses números.
 */
public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0;
        int maior = 0;
        float soma = 0f;

        do {
            System.out.print("Número: ");
            numero = scan.nextInt();

            if(numero > maior) maior = numero;

            soma += numero;

            count = count + 1;
        } while(count < 5);

        System.out.println("O maior número digitado foi " + maior + " e a média foi " + soma/5);
    }
}
