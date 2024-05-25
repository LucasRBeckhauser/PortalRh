package br.com.PortalRh.Projeto.entities;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Person extends EntityId {

    @Column(name = "nome")
    private String name;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "rg")
    private String rg;
    @Column(name = "titulo_eleitor")
    private String voterRegist;
    @Column(name = "data_nascimento")
    private LocalDate birthday;
    @Column(name = "carteira_reservista")
    private String reservist;
    @Column(name = "cnh")
    private String cnh;
    @Column(name = "raca_cor")
    private String raceColor;
    @Column(name = "religiao")
    private String religion;
    @Column(name = "doador_sangue")
    private Boolean bloodDonor;
    @Column(name = "nacionalidade")
    private String nacionality;
    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<PrevExp> prevExp = new ArrayList<>();
    @Column(name = "idiomas")
    private String languages;
    @Column(name = "hora_extra")
    private Integer horaExtra;
    @Column(name = "entrada")
    private LocalTime clockIn;
    @Column(name = "saida")
    private LocalTime clockOut;
    @ManyToOne
    private Parent parent;
    @ManyToOne
    private SocialMedia socialMedia;
    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<Certification> certifications = new ArrayList<>();
    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<Children> childrem = new ArrayList<>();

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getVoterRegist() {
        return voterRegist;
    }

    public void setVoterRegist(String voterRegist) {
        this.voterRegist = voterRegist;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getReservist() {
        return reservist;
    }

    public void setReservist(String reservist) {
        this.reservist = reservist;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getRaceColor() {
        return raceColor;
    }

    public void setRaceColor(String raceColor) {
        this.raceColor = raceColor;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public Boolean getBloodDonor() {
        return bloodDonor;
    }

    public void setBloodDonor(Boolean bloodDonor) {
        this.bloodDonor = bloodDonor;
    }

    public String getNacionality() {
        return nacionality;
    }

    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }

    public List<PrevExp> getPrevExp() {
        return prevExp;
    }

    public void setPrevExp(List<PrevExp> prevExp) {
        this.prevExp = prevExp;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public Integer getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(Integer horaExtra) {
        this.horaExtra = horaExtra;
    }

    public LocalTime getClockIn() {
        return clockIn;
    }

    public void setClockIn(LocalTime clockIn) {
        this.clockIn = clockIn;
    }

    public LocalTime getClockOut() {
        return clockOut;
    }

    public void setClockOut(LocalTime clockOut) {
        this.clockOut = clockOut;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public SocialMedia getSocialMedia() {
        return socialMedia;
    }

    public void setSocialMedia(SocialMedia socialMedia) {
        this.socialMedia = socialMedia;
    }

    public List<Certification> getCertifications() {
        return certifications;
    }

    public void addCertificate(Certification certification) { certifications.add(certification); }

    public void  removeCertificate(Certification certification) { certifications.remove(certification); }

    public List<Children> getChildrem() {
        return childrem;
    }

    public void addChild(Children filho) { childrem.add(filho); }

    public void  removeChild(Children filho) { childrem.remove(filho); }
}
