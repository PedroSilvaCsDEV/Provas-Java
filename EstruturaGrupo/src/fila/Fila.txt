package fila;

import java.util.LinkedList;
import java.util.Queue;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fila {
    public static void main(String[] args) {

        String caminhoArquivo = "Pedido.txt";
        Queue<RegistradorDePedidos> filaDePedidos = new LinkedList<>();

        try {
            File arquivo = new File(caminhoArquivo);
            Scanner leitor = new Scanner(arquivo);

            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String codigo = linha.substring(0, 5).trim();
                String data = linha.substring(14, 24).trim();
                String pais = linha.substring(71, 82).trim();
                RegistradorDePedidos pedido = new RegistradorDePedidos(codigo, data, pais);
                filaDePedidos.add(pedido);
            }

            leitor.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + caminhoArquivo);
        }

        for (RegistradorDePedidos pedido : filaDePedidos) {
            System.out.println("Código: " + pedido.getCodigo());
            System.out.println("Data: " + pedido.getData());
            System.out.println("País: " + pedido.getPais());
            System.out.println("");
        }
    }
}