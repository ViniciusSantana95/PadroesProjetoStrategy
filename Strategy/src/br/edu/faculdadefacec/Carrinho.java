package br.edu.faculdadefacec;


import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Produto> lista = new ArrayList<>();

    public void adicionarProduto(Produto produto){
        this.lista.add(produto);
    }

    public void pagar(MeioPagamentoStrategy meioPagamento){
        meioPagamento.pagar(obterValorTotal());
    }

    public void removerProduto(Produto produto){
        this.lista.remove(produto);
    }

    private Double obterValorTotal(){
        Double total = 0.0;

        for(Produto produto : this.lista){
            total += produto.getValor();
        }
        return total;
    }
}
