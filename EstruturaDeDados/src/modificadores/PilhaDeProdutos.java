package modificadores;

import java.util.ArrayList;
import java.util.Stack;

public class PilhaDeProdutos {

	public static void empilharProdutos() {

		System.out.println("-------------------Pilhas-------------------");
        Stack<RegistradorDeProdutos> pilha = new Stack<>();
        ArrayList<RegistradorDeProdutos> listaDeProdutos = GravadorDeProdutos.gravarProdutos();
        for (RegistradorDeProdutos produtos : listaDeProdutos) {
            pilha.push(produtos);
        }

        System.out.println("-------------------Topo: -------------------");
        System.out.println("");
        RegistradorDeProdutos produtosTopo = pilha.peek();
        if (produtosTopo != null) {
            System.out.println("Código: " + produtosTopo.getCodigo());
            System.out.println("Descrição: " + produtosTopo.getDescricao());
            System.out.println("Preço: " + produtosTopo.getPreco());
            System.out.println("Quantidade: " + produtosTopo.getQtd());
            System.out.println("Categoria: " + produtosTopo.getCategoria());
            System.out.println("");
        }

        if (pilha.size() >= 5) {
            for (int i = 0; i < 5; i++) {
                pilha.pop();
            }
        }
        System.out.println("-------------------Depois de remover cinco elementos: -------------------");
        System.out.println("");
        for (int i = pilha.size() - 1; i >= 0; i--) {
            RegistradorDeProdutos produto = pilha.get(i);
            System.out.println("Código: " + produto.getCodigo());
            System.out.println("Descrição: " + produto.getDescricao());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("Quantidade: " + produto.getQtd());
            System.out.println("Categoria: " + produto.getCategoria());
            System.out.println("");
        }
	}
}