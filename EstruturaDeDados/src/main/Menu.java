/* -------------------GRUPO------------------- */

//Pedro Lucas Santos De Souza Silva - 01606360
//Nicholas De Araujo Ferreira - 01594221
//Francisco Vieira Da Silva Júnior - 01602940
//William Coelho De Morais - 01263977

package main;

import modificadores.FilaDeProdutos;
import modificadores.GravadorDeProdutos;
import modificadores.PilhaDeProdutos;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("### MENU ###");
            System.out.println("1. Chamar Gravador");
            System.out.println("2. Chamar Fila");
            System.out.println("3. Chamar Pilha");
            System.out.println("0. Sair do programa");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Chamando Gravador...");
                    GravadorDeProdutos.gravarProdutos();
                    break;
                case 2:
                    System.out.println("Chamando Fila...");
                    FilaDeProdutos.enfileirarProdutos();
                    break;
                case 3:
                    System.out.println("Chamando Pilha...");
                    PilhaDeProdutos.empilharProdutos();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Escolha novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}