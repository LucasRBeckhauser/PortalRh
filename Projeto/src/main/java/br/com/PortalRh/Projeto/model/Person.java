package br.com.PortalRh.Projeto.model;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Person extends EntityId {

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
    private List<Certification> certificacoes;
    @Column(name = "nacionalidade")
    private String nacionalidade;
    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL)
    private List <PrevExp> prevExpAnteriores = new ArrayList<>();
    @Column(name = "idiomas")
    private String idiomas;
    @Column(name = "hora_extra")
    private Integer horaExtra;
    @Column(name = "entrada")
    private LocalTime entrada;
    @Column(name = "saida")
    private LocalTime saida;
    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL)
    private List<Children> children = new ArrayList<>();
    @ManyToOne
    private Parent parent;
    @ManyToOne
    private List<SocialMedia> redesSociais = new ArrayList<>();

    public Person() {
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

    public List<Certification> getCertificacoes() {
        return certificacoes;
    }

    public void addCertificacoes(Certification certification) {
        certificacoes.add(certification); }

    public void removeCertificacoes(Certification certification) {
        certificacoes.remove(certification); }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public List<PrevExp> getExpAnteriores() {
        return prevExpAnteriores;
    }

    public void addExpAnterior(PrevExp prevExp) {
        prevExpAnteriores.add(prevExp); }

    public void removeExpAnterior(PrevExp prevExp) {
        prevExpAnteriores.remove(prevExp); }

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

    public List<Children> getDependentes() {
        return children;
    }

    public void addDependente(Children children) {
        this.children.add(children); }

    public void removeExpAnterior(Children children) {
        this.children.remove(children); }

    public Parent getFiliacao() {
        return parent;
    }

    public void setFiliacao(Parent parent) {
        this.parent = parent;
    }

    public List<SocialMedia> getRedeSocial() {
        return redesSociais;
    }

    public void addRedeSocial(SocialMedia socialMedia) {
        redesSociais.add(socialMedia); }

    public void removeRedeSocial(SocialMedia socialMedia) {
        redesSociais.remove(socialMedia); }

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
                ", expAnteriores=" + prevExpAnteriores +
                ", idiomas='" + idiomas + '\'' +
                ", horaExtra=" + horaExtra +
                ", entrada=" + entrada +
                ", saida=" + saida +
                ", dependente=" + children +
                ", filiacao=" + parent +
                '}';
    }
}
