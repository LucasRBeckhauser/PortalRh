package br.com.PortalRh.Projeto.model;
import br.com.PortalRh.Projeto.model.EntityId;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Pessoa extends EntityId {

    @Column(name = "nome")
    private String nome;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "rg")
    private String rg;
    @Column(name = "titulo_eleitor")
    private String tituloEleitor;
    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;
    @Column(name = "carteira_reservista")
    private String carteiraReservista;
    @Column(name = "cnh")
    private String cnh;
    @Column(name = "raca_cor")
    private String racaCor;
    @Column(name = "religiao")
    private String religiao;
    @Column(name = "doador_sangue")
    private Boolean doadorSangue;
    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL)
    private List<Certificacao> certificacoes;
    @Column(name = "nacionalidade")
    private String nacionalidade;
    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL)
    private List <ExpAnterior> expAnteriores = new ArrayList<>();
    @Column(name = "idiomas")
    private String idiomas;
    @Column(name = "hora_extra")
    private Integer horaExtra;
    @Column(name = "entrada")
    private LocalTime entrada;
    @Column(name = "saida")
    private LocalTime saida;
    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL)
    private List<Dependente> dependentes = new ArrayList<>();
    @ManyToOne
    private Filiacao filiacao;
    @ManyToOne
    private List<RedeSocial> redesSociais = new ArrayList<>();

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTituloEleitor() {
        return tituloEleitor;
    }

    public void setTituloEleitor(String tituloEleitor) {
        this.tituloEleitor = tituloEleitor;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCarteiraReservista() {
        return carteiraReservista;
    }

    public void setCarteiraReservista(String carteiraReservista) {
        this.carteiraReservista = carteiraReservista;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getRacaCor() {
        return racaCor;
    }

    public void setRacaCor(String racaCor) {
        this.racaCor = racaCor;
    }

    public String getReligiao() {
        return religiao;
    }

    public void setReligiao(String religiao) {
        this.religiao = religiao;
    }

    public Boolean getDoadorSangue() {
        return doadorSangue;
    }

    public void setDoadorSangue(Boolean doadorSangue) {
        this.doadorSangue = doadorSangue;
    }

    public List<Certificacao> getCertificacoes() {
        return certificacoes;
    }

    public void addCertificacoes(Certificacao certificacao) {
        certificacoes.add(certificacao); }

    public void removeCertificacoes(Certificacao certificacao) {
        certificacoes.remove(certificacao); }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public List<ExpAnterior> getExpAnteriores() {
        return expAnteriores;
    }

    public void addExpAnterior(ExpAnterior expAnterior) {
        expAnteriores.add(expAnterior); }

    public void removeExpAnterior(ExpAnterior expAnterior) {
        expAnteriores.remove(expAnterior); }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public Integer getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(Integer horaExtra) {
        this.horaExtra = horaExtra;
    }

    public LocalTime getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalTime entrada) {
        this.entrada = entrada;
    }

    public LocalTime getSaida() {
        return saida;
    }

    public void setSaida(LocalTime saida) {
        this.saida = saida;
    }

    public List<Dependente> getDependentes() {
        return dependentes;
    }

    public void addDependente(Dependente dependente) {
        dependentes.add(dependente); }

    public void removeExpAnterior(Dependente dependente) {
        dependentes.remove(dependente); }

    public Filiacao getFiliacao() {
        return filiacao;
    }

    public void setFiliacao(Filiacao filiacao) {
        this.filiacao = filiacao;
    }

    public List<RedeSocial> getRedeSocial() {
        return redesSociais;
    }

    public void addRedeSocial(RedeSocial redeSocial) {
        redesSociais.add(redeSocial); }

    public void removeRedeSocial(RedeSocial redeSocial) {
        redesSociais.remove(redeSocial); }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", tituloEleitor='" + tituloEleitor + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", carteiraReservista='" + carteiraReservista + '\'' +
                ", cnh='" + cnh + '\'' +
                ", racaCor='" + racaCor + '\'' +
                ", religiao='" + religiao + '\'' +
                ", doadorSangue=" + doadorSangue +
                ", certificacoes=" + certificacoes +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", expAnteriores=" + expAnteriores +
                ", idiomas='" + idiomas + '\'' +
                ", horaExtra=" + horaExtra +
                ", entrada=" + entrada +
                ", saida=" + saida +
                ", dependente=" + dependentes +
                ", filiacao=" + filiacao +
                '}';
    }
}
