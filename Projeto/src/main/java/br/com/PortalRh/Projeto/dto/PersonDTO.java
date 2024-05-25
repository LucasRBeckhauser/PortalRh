package br.com.PortalRh.Projeto.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class PersonDTO {
    private String name;
    private String cpf;
    private String rg;
    private String voterRegist;
    private LocalDate birthday;
    private String reservist;
    private String cnh;
    private String raceColor;
    private String religion;
    private Boolean bloodDonor;
    private String nacionality;
    private List<PrevExpDTO> prevExp;
    private String languages;
    private Integer horaExtra;
    private LocalTime clockIn;
    private LocalTime clockOut;
    private ParentDTO parent;
    private List<SocialMediaDTO> socialMedia;
    private List<CertificationDTO> certifications;
    private List<ChildrenDTO> children;

    // Getters and Setters
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

    public List<PrevExpDTO> getPrevExp() {
        return prevExp;
    }

    public void setPrevExp(List<PrevExpDTO> prevExp) {
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

    public ParentDTO getParent() {
        return parent;
    }

    public void setParent(ParentDTO parent) {
        this.parent = parent;
    }

    public List<SocialMediaDTO> getSocialMedia() {
        return socialMedia;
    }

    public void setSocialMedia(List<SocialMediaDTO> socialMedia) {
        this.socialMedia = socialMedia;
    }

    public List<CertificationDTO> getCertifications() {
        return certifications;
    }

    public void setCertifications(List<CertificationDTO> certifications) {
        this.certifications = certifications;
    }

    public List<ChildrenDTO> getChildren() {
        return children;
    }

    public void setChildren(List<ChildrenDTO> children) {
        this.children = children;
    }
}
