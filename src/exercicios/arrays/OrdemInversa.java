package exercicios.arrays;
/*
Faça um Programa que leia um vetor de 5 números inteiros e mostre-os na ordem inversa.
 */
public class OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-5, -6, 15, 50, 8};

        int count = 0;

        System.out.print("Vetor: ");
        while(count < vetor.length) {
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.print("\nVetor Invertido: ");
        for(int i = (vetor.length - 1); i >= 0; i-- ) {
            System.out.print(vetor[i] + " ");
        }

    }
}
