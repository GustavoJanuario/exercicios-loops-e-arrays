package exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros.
Calcule e mostre a quantidade de números pares e a quantidade de números impares.
 */
public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int par = 0;
        int impar = 0;
        int contador = 1;

        System.out.print("Digite a quantidade de números: ");
        quantNumeros = scan.nextInt();

        do {
            System.out.print("Digite o " + contador + "º número: ");
            numero = scan.nextInt();
            contador++;

            if (numero % 2 == 0) par++;
            else impar++;

        } while(contador <= quantNumeros);

        System.out.println("Total de números pares: " + par);
        System.out.println("Total de números ímpares: " + impar);

    }
}
