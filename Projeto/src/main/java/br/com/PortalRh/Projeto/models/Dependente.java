package br.com.PortalRh.Projeto.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Dependente extends EntityId{

    @Column(name = "nome_dep")
    private String nome;
    @Column(name = "idade_dep")
    private Integer idade;
    @ManyToOne
    private Pessoa pessoa;

    public Dependente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "Dependente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", pessoa=" + pessoa +
                '}';
    }
}
