package br.com.PortalRh.Projeto.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class ExpAnterior extends EntityId {

    @Column(name = "empresa")
    private String empresa;
    @Column(name = "meses_exp")
    private Integer mesesExp;
    @Column(name = "anos_exp")
    private Integer anosExp;
    @Column(name = "descricao_exp")
    private String descricao;
    @ManyToOne
    private Pessoa pessoa;

    public ExpAnterior() {
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Integer getMesesExp() {
        return mesesExp;
    }

    public void setMesesExp(Integer mesesExp) {
        this.mesesExp = mesesExp;
    }

    public Integer getAnosExp() {
        return anosExp;
    }

    public void setAnosExp(Integer anosExp) {
        this.anosExp = anosExp;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "ExpAnteriores{" +
                "empresa='" + empresa + '\'' +
                ", mesesExp=" + mesesExp +
                ", anosExp=" + anosExp +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}