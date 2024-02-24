package prova;

import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vetor [] = new int[15];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = input.nextInt();
            if (vetor[i] % 2 == 0) {
                vetor[i] = vetor[i] * 3;
            } else {
                vetor[i] = vetor[i] * 2;
            }
            System.out.println(vetor[i]);
        }
        input.close();
    }
}