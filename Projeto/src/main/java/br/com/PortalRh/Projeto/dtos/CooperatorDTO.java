package br.com.PortalRh.Projeto.dtos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import br.com.PortalRh.Projeto.entities.enums.ContractModality;
import br.com.PortalRh.Projeto.entities.enums.Shift;

public class CooperatorDTO {
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
    private List<CertificationDto> certifications;
    private List<ChildrenDto> childrem;
    
    private double wage;
    private String pisPasep;
    private PositionDTO position;
    private ContractModality contractModel;
    private Shift shift;

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

    public List<CertificationDto> getCertifications() {
        return certifications;
    }

    public void setCertifications(List<CertificationDto> certifications) {
        this.certifications = certifications;
    }

    public List<ChildrenDto> getChildrem() {
        return childrem;
    }

    public void setChildrem(List<ChildrenDto> childrem) {
        this.childrem = childrem;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public String getPisPasep() {
        return pisPasep;
    }

    public void setPisPasep(String pisPasep) {
        this.pisPasep = pisPasep;
    }

    public PositionDTO getPosition() {
        return position;
    }

    public void setPosition(PositionDTO position) {
        this.position = position;
    }

    public ContractModality getContractModel() {
        return contractModel;
    }

    public void setContractModel(ContractModality contractModel) {
        this.contractModel = contractModel;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }

    @Override
    public String toString() {
        return "CooperatorDTO{" +
                "name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", voterRegist='" + voterRegist + '\'' +
                ", birthday=" + birthday +
                ", reservist='" + reservist + '\'' +
                ", cnh='" + cnh + '\'' +
                ", raceColor='" + raceColor + '\'' +
                ", religion='" + religion + '\'' +
                ", bloodDonor=" + bloodDonor +
                ", nacionality='" + nacionality + '\'' +
                ", prevExp=" + prevExp +
                ", languages='" + languages + '\'' +
                ", horaExtra=" + horaExtra +
                ", clockIn=" + clockIn +
                ", clockOut=" + clockOut +
                ", parent=" + parent +
                ", socialMedia=" + socialMedia +
                ", certifications=" + certifications +
                ", childrem=" + childrem +
                ", wage=" + wage +
                ", pisPasep='" + pisPasep + '\'' +
                ", position=" + position +
                ", contractModel=" + contractModel +
                ", shift=" + shift +
                '}';
    }
}
