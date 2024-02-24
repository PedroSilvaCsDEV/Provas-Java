package leitor;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import modificadores.RegistradorDeProdutos;

public class LeitorDoArquivo {

    public static ArrayList<RegistradorDeProdutos> lerProdutos() {

        String caminhoArquivo = "Produto.txt";
        ArrayList<RegistradorDeProdutos> listaDeProdutos = new ArrayList<>();

        try {
            File arquivo = new File(caminhoArquivo);
            Scanner leitor = new Scanner(arquivo);

            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                int codigo = Integer.parseInt(linha.substring(0, 2));
                String nome = linha.substring(3, 34);
                String valors = linha.substring(36, 41);
                double valor = Double.parseDouble(valors) / 100;
                int qtd = Integer.parseInt(linha.substring(43, 45));
                int categoria = Integer.parseInt(linha.substring(46, 47));
                RegistradorDeProdutos produto = new RegistradorDeProdutos(codigo, nome, valor, qtd, categoria);
                listaDeProdutos.add(produto);
            }

            leitor.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + caminhoArquivo);
        }
        return listaDeProdutos;
    }
}