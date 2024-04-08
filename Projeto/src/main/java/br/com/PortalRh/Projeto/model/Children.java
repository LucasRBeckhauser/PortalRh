package br.com.PortalRh.Projeto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Children extends EntityId {

    @Column(name = "nome_dep")
    private String nome;
    @Column(name = "idade_dep")
    private Integer idade;
    @ManyToOne
    private Person person;

    public Children() {
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

    public Person getPessoa() {
        return person;
    }

    public void setPessoa(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Dependente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", pessoa=" + person +
                '}';
    }
}
