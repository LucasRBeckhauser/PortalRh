package br.com.PortalRh.Projeto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Certification extends EntityId {

    @Column(name = "titulo")
    private String titulo;
    @Column(name = "competencias")
    private String competencias;
    @Column(name = "carga_horaria", columnDefinition = "REAL")
    private Double cargaHoraria;
    @Column(name = "descricao_certif")
    private String descricao;
    @ManyToOne
    private Person person;

    public Certification() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCompetencias() {
        return competencias;
    }

    public void setCompetencias(String competencias) {
        this.competencias = competencias;
    }

    public Double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Certificacao{" +
                "titulo='" + titulo + '\'' +
                ", competencias='" + competencias + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
