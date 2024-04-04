package br.com.PortalRh.Projeto.model;

import br.com.PortalRh.Projeto.model.EntityId;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Filiacao extends EntityId {

    @Column(name = "nome_pai")
    private String nomePai;
    @Column(name = "nome_mae")
    private String nomeMae;
    @Column(name = "tel_pai")
    private String telPai;
    @Column(name = "tel_mae")
    private String telMae;
    @OneToMany(mappedBy = "filiacao", cascade = CascadeType.ALL)
    private List<Pessoa> filhos = new ArrayList<>();

    public Filiacao() {
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getTelPai() {
        return telPai;
    }

    public void setTelPai(String telPai) {
        this.telPai = telPai;
    }

    public String getTelMae() {
        return telMae;
    }

    public void setTelMae(String telMae) {
        this.telMae = telMae;
    }

    public List<Pessoa> getFilho() {
        return filhos;
    }

    public void addPessoa(Pessoa filho) { filhos.add(filho); }

    public void  removePessoa(Pessoa filho) { filhos.remove(filho); }

    @Override
    public String toString() {
        return "Filiacao{" +
                "nomePai='" + nomePai + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                ", telPai='" + telPai + '\'' +
                ", telMae='" + telMae + '\'' +
                ", filho=" + filhos +
                '}';
    }
}
