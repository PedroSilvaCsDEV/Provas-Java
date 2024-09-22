package lista;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lista {
    public static void main(String[] args) {

        ArrayList<RegistradorDePedidos> pedidos = Lista.listaPedidos();

        for (RegistradorDePedidos pedido : pedidos) {
            System.out.println("Código: " + pedido.getCodigo());
            System.out.println("Data: " + pedido.getData());
            System.out.println("País: " + pedido.getPais());
            System.out.println("");
        }
    }

    public static ArrayList<RegistradorDePedidos> listaPedidos() {

        String caminhoArquivo = "Pedido.txt";
        ArrayList<RegistradorDePedidos> listaDePedidos = new ArrayList<>();

        try {
            File arquivo = new File(caminhoArquivo);
            Scanner leitor = new Scanner(arquivo);

            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String codigo = linha.substring(0, 5).trim();
                String data = linha.substring(14, 24).trim();
                String pais = linha.substring(71, 82).trim();
                RegistradorDePedidos pedido = new RegistradorDePedidos(codigo, data, pais);
                listaDePedidos.add(pedido);
            }

            leitor.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + caminhoArquivo);
        }
        return listaDePedidos;
    }
}