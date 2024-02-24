package arvore;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class NoArvore {
    String codigo;
    String data;
    String pais;
    NoArvore esquerda;
    NoArvore direita;

    public NoArvore(String codigo, String data, String pais) {
        this.codigo = codigo;
        this.data = data;
        this.pais = pais;
        this.esquerda = null;
        this.direita = null;
    }
}

class ArvoreBinaria {
    NoArvore raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(String codigo, String data, String pais) {
        raiz = inserirRec(raiz, codigo, data, pais);
    }

    private NoArvore inserirRec(NoArvore no, String codigo, String data, String pais) {
        if (no == null) {
            return new NoArvore(codigo, data, pais);
        }

        if (codigo.compareTo(no.codigo) < 0) {
            no.esquerda = inserirRec(no.esquerda, codigo, data, pais);
        } else if (codigo.compareTo(no.codigo) > 0) {
            no.direita = inserirRec(no.direita, codigo, data, pais);
        }

        return no;
    }

    public void imprimirEmOrdem(NoArvore no) {
        if (no != null) {
            imprimirEmOrdem(no.esquerda);
            System.out.println("Código: " + no.codigo);
            System.out.println("Data: " + no.data);
            System.out.println("País: " + no.pais);
            System.out.println();
            imprimirEmOrdem(no.direita);
        }
    }
}

public class Arvore {
    public static void main(String[] args) {
        String caminhoArquivo = "Pedido.txt";
        ArvoreBinaria arvoreDePedidos = new ArvoreBinaria();

        try {
            File arquivo = new File(caminhoArquivo);
            Scanner leitor = new Scanner(arquivo);

            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String codigo = linha.substring(0, 5).trim();
                String data = linha.substring(14, 24).trim();
                String pais = linha.substring(71, 82).trim();
                arvoreDePedidos.inserir(codigo, data, pais);
            }

            leitor.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + caminhoArquivo);
        }

        arvoreDePedidos.imprimirEmOrdem(arvoreDePedidos.raiz);
    }
}
