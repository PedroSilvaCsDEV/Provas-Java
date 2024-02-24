package modificadores;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class FilaDeProdutos {

	public static void enfileirarProdutos() {

		System.out.println("-------------------Filas-------------------");
        Queue<RegistradorDeProdutos> fila = new LinkedList<>();
        ArrayList<RegistradorDeProdutos> listaDeProdutos = GravadorDeProdutos.gravarProdutos();
        for (RegistradorDeProdutos produtos : listaDeProdutos) {
            fila.add(produtos);
        }

        System.out.println("-------------------Topo: -------------------");
        System.out.println("");
        RegistradorDeProdutos produtosTopo = fila.peek();
        if (produtosTopo != null) {
            System.out.println("Código: " + produtosTopo.getCodigo());
            System.out.println("Descrição: " + produtosTopo.getDescricao());
            System.out.println("Preço: " + produtosTopo.getPreco());
            System.out.println("Quantidade: " + produtosTopo.getQtd());
            System.out.println("Categoria: " + produtosTopo.getCategoria());
            System.out.println("");
        }

        if (fila.size() >= 5) {
            for (int i = 0; i < 5; i++) {
                fila.remove();
            }
        }
        System.out.println("-------------------Depois de remover cinco elementos: -------------------");
        System.out.println("");
        for (RegistradorDeProdutos produtos : fila) {
            System.out.println("Código: " + produtos.getCodigo());
            System.out.println("Descrição: " + produtos.getDescricao());
            System.out.println("Preço: " + produtos.getPreco());
            System.out.println("Quantidade: " + produtos.getQtd());
            System.out.println("Categoria: " + produtos.getCategoria());
            System.out.println("");
        }
	}
}