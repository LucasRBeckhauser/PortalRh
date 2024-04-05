package br.com.PortalRh.Projeto.model;

import br.com.PortalRh.Projeto.model.enuns.Estado;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Endereco extends EntityId{

    @Column(name = "numero_residencia")
    private Integer numeroResidencia;
    @Column(name = "nome_rua")
    private String nomeRua;
    @Column(name = "complemento")
    private String complemento;
    @Column(name = "bairro")
    private String bairro;
    @Column(name = "cidade")
    private String cidade;
    @Column(name = "uf")
    private Estado estado;
    @Column(name = "cep")
    private String cep;
    @Column(name = "pais")
    private String pais;


    // Getters and Setters
    public Integer getNumeroResidencia() {
        return numeroResidencia;
    }

    public void setNumeroResidencia(Integer numeroResidencia) {
        this.numeroResidencia = numeroResidencia;
    }

    public String getNomeRua() {
        return nomeRua;
    }

    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    // Constructor
    public Endereco() {
    }

    // To String

    @Override
    public String toString() {
        return "Address{" +
                "numeroResidencia=" + numeroResidencia +
                ", nomeRua='" + nomeRua + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado=" + estado +
                ", cep='" + cep + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
