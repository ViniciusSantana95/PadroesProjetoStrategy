package br.edu.faculdadefacec;

public class MeioPagamentoMercadoPagoStrategy implements MeioPagamentoStrategy{

    private String email;
    private String password;

    public MeioPagamentoMercadoPagoStrategy(String email, String password){
        this.email = email;
        this.password = password;

    }
    @Override
    public void pagar(Double valor) {
        System.out.println(valor + "R$ pago via mercado pago " + "pelo usuário " + this.email);
    }

}
