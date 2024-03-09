package br.com.PortalRh.Projeto.model;

import br.com.PortalRh.Projeto.model.enuns.TipoCargo;

public class Cargo{
    private String descricao;
    private String nivel;
    private Boolean comissionado;
    private TipoCargo tipoCargo;

    // Getters and Setters

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Boolean getComissionado() {
        return comissionado;
    }

    public void setComissionado(Boolean comissionado) {
        this.comissionado = comissionado;
    }

    public TipoCargo getTipoCargo() {
        return tipoCargo;
    }

    public void setTipoCargo(TipoCargo tipoCargo) {
        this.tipoCargo = tipoCargo;
    }

    // Constructor vazio
    public Cargo() {
    }


    @Override
    public String toString() {
        return "Cargo{" +
                "descricao='" + descricao + '\'' +
                ", nivel='" + nivel + '\'' +
                ", comissionado=" + comissionado +
                ", tipoCargo=" + tipoCargo +
                '}';
    }
}
