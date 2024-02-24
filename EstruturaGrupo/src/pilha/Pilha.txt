package pilha;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Stack;
import java.util.Scanner;

public class Pilha {
    public static void main(String[] args) {

        String caminhoArquivo = "Pedido.txt";
        Stack<RegistradorDePedidos> pilhaDePedidos = new Stack<>();

        try {
            File arquivo = new File(caminhoArquivo);
            Scanner leitor = new Scanner(arquivo);

            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String codigo = linha.substring(0, 5).trim();
                String data = linha.substring(14, 24).trim();
                String pais = linha.substring(71, 82).trim();
                RegistradorDePedidos pedido = new RegistradorDePedidos(codigo, data, pais);
                pilhaDePedidos.push(pedido);
            }

            leitor.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + caminhoArquivo);
        }

        for (RegistradorDePedidos pedido : pilhaDePedidos) {
            System.out.println("Código: " + pedido.getCodigo());
            System.out.println("Data: " + pedido.getData());
            System.out.println("País: " + pedido.getPais());
            System.out.println("");
        }
    }
}