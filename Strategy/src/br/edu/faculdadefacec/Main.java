package br.edu.faculdadefacec;

public class Main {
    public static void main(String[] args) {
        //estrangulamento
        //sistema como uma arvore

        //sonar, sistema para encontrar bugs

        //elastic search
        //new realic

        //80 20 80% de resultado e 20% de esforço

        Carrinho carrinho = new Carrinho();

        Produto cocaCola = new Produto("Coca-cola 350 ml", "10001", 3.99);
        Produto xSalada = new Produto("X-Salada", "10002", 14.99);

        carrinho.adicionarProduto(cocaCola);
        carrinho.adicionarProduto(xSalada);

        MeioPagamentoMercadoPagoStrategy mercadoPago = new MeioPagamentoMercadoPagoStrategy("teste@email.com", "senha123");
        carrinho.pagar(mercadoPago);

        MeioPagamentoPixStrategy pix = new MeioPagamentoPixStrategy(123456, "senha123");

        carrinho.pagar(pix);



    }
}