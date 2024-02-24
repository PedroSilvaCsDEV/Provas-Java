package modificadores;

import java.util.ArrayList;

import leitor.LeitorDoArquivo;

public class GravadorDeProdutos {

    public static ArrayList<RegistradorDeProdutos> gravarProdutos() {

        ArrayList<RegistradorDeProdutos> listaDeProdutos = LeitorDoArquivo.lerProdutos();

        listaDeProdutos.add(new RegistradorDeProdutos(78, "Produto A", 10.99, 100, 1));
        listaDeProdutos.add(new RegistradorDeProdutos(79, "Produto B", 5.99, 50, 2));
        listaDeProdutos.add(new RegistradorDeProdutos(80, "Produto C", 7.49, 75, 3));

        for (RegistradorDeProdutos produto : listaDeProdutos) {
            System.out.println("Código: " + produto.getCodigo());
            System.out.println("Descrição: " + produto.getDescricao());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("Quantidade: " + produto.getQtd());
            System.out.println("Categoria: " + produto.getCategoria());
            System.out.println("");
        }

        return listaDeProdutos;
    }
}