package br.edu.faculdadefacec;

public class MeioPagamentoPixStrategy implements MeioPagamentoStrategy{

    private int numeroConta;
    private String password;

    public MeioPagamentoPixStrategy(int numeroConta, String password) {
        this.numeroConta = numeroConta;
        this.password = password;
    }

    @Override
    public void pagar(Double valor) {
        System.out.println(valor + "R$ pago via PIX conta origem" + this.numeroConta);
    }
}
