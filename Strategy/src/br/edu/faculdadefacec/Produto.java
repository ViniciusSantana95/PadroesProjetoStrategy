package br.edu.faculdadefacec;

public class Produto {
    private String descricao;
    private String codigoBarra;
    private Double valor;

    public Produto(String descricao, String codigoBarra, Double valor) {
        this.descricao = descricao;
        this.codigoBarra = codigoBarra;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public Double getValor() {
        return valor;
    }
}
