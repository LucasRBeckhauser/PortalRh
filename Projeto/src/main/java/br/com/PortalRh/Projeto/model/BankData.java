package br.com.PortalRh.Projeto.model;

import br.com.PortalRh.Projeto.model.enuns.TipoConta;

public class BankData {
    private TipoConta tipoconta;
    private String banco;
    private String agencia;
    private String conta;

    //Getters and Setters
    public TipoConta getTipoconta() {
        return tipoconta;
    }

    public void setTipoconta(TipoConta tipoconta) {
        this.tipoconta = tipoconta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    //Constructor
    public BankData() {
    }

    // To String
    @Override
    public String toString() {
        return "DadosBancarios{" +
                "tipoconta=" + tipoconta +
                ", banco='" + banco + '\'' +
                ", agencia='" + agencia + '\'' +
                ", conta='" + conta + '\'' +
                '}';
    }
}
