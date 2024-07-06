package br.com.PortalRh.Projeto.controller.dtos;

import br.com.PortalRh.Projeto.model.BankData;
import br.com.PortalRh.Projeto.model.Collaborator;
import br.com.PortalRh.Projeto.model.Parent;
import br.com.PortalRh.Projeto.model.User;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.time.LocalTime;

import org.hibernate.validator.constraints.br.CPF;

public class PersonDTO {
    @NotBlank(message = "O nome não pode estar em branco")
    String name;
    @NotBlank(message = "O CPF não pode estar em branco")
    @CPF
    String cpf;
    @NotBlank(message = "O RG não pode estar em branco")
    String rg;
    @NotBlank(message = "O registro de eleitor não pode estar em branco")
    String voterRegist;
    @NotNull(message = "A data de nascimento não pode ser nula")
    LocalDate birthday;
    @NotBlank(message = "O reservista não pode estar em branco")
    String reservist;
    @NotBlank(message = "A CNH não pode estar em branco")
    String cnh;
    @NotBlank(message = "A cor/raça não pode estar em branco")
    String raceColor;
    @NotBlank(message = "A religião não pode estar em branco")
    String religion;
    @NotNull(message = "O campo de doador de sangue não pode ser nulo")
    Boolean bloodDonor;
    @NotBlank(message = "A nacionalidade não pode estar em branco")
    String nationality;
    @NotBlank(message = "Os idiomas falados não podem estar em branco")
    String languages;
    @NotNull(message = "As horas extras não podem ser nulas")
    @Min(value = 0, message = "As horas extras não podem ser negativas")
    Integer overtime;
    @NotNull(message = "O horário de entrada não pode ser nulo")
    LocalTime clockIn;
    @NotNull(message = "O horário de saída não pode ser nulo")
    LocalTime clockOut;
    @Valid @NotNull(message = "Os dados do pai não podem ser nulos")
    Parent parent;
    @Valid @NotNull(message = "Os dados bancários não podem ser nulos")
    BankData bankData;
    @Valid @NotNull(message = "O usuário não pode ser nulo")
    User user;
    @Valid @NotNull(message = "O colaborador não pode ser nulo")
    Collaborator collaborator;


//Constructors:

    public PersonDTO() {
    }

    public PersonDTO(String name, String cpf, String rg, String voterRegist, LocalDate birthday, String reservist, String cnh, String raceColor, String religion, Boolean bloodDonor, String nationality, String languages, Integer overtime, LocalTime clockIn, LocalTime clockOut, Parent parent, BankData bankData, User user, Collaborator collaborator) {
        this.name = name;
        this.cpf = cpf;
        this.rg = rg;
        this.voterRegist = voterRegist;
        this.birthday = birthday;
        this.reservist = reservist;
        this.cnh = cnh;
        this.raceColor = raceColor;
        this.religion = religion;
        this.bloodDonor = bloodDonor;
        this.nationality = nationality;
        this.languages = languages;
        this.overtime = overtime;
        this.clockIn = clockIn;
        this.clockOut = clockOut;
        this.parent = parent;
        this.bankData = bankData;
        this.user = user;
        this.collaborator = collaborator;
    }

//Getters and Setters:


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

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public Integer getOvertime() {
        return overtime;
    }

    public void setOvertime(Integer overtime) {
        this.overtime = overtime;
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

    public BankData getBankData() {
        return bankData;
    }

    public void setBankData(BankData bankData) {
        this.bankData = bankData;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Collaborator getCollaborator() {
        return collaborator;
    }

    public void setCollaborator(Collaborator collaborator) {
        this.collaborator = collaborator;
    }

//To string:

    @Override
    public String toString() {
        return "PersonDTO{" +
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
                ", nationality='" + nationality + '\'' +
                ", languages='" + languages + '\'' +
                ", overtime=" + overtime +
                ", clockIn=" + clockIn +
                ", clockOut=" + clockOut +
                ", parent=" + parent +
                ", bankData=" + bankData +
                ", user=" + user +
                ", collaborator=" + collaborator +
                '}';
    }
}






//        (
//    @NotBlank(message = "O nome não pode estar em branco")
//    String name,
//
//    @NotBlank(message = "O CPF não pode estar em branco")
//    @CPF
//    String cpf,
//
//    @NotBlank(message = "O RG não pode estar em branco")
//    String rg,
//
//    @NotBlank(message = "O registro de eleitor não pode estar em branco")
//    String voterRegist,
//
//    @NotNull(message = "A data de nascimento não pode ser nula")
//    LocalDate birthday,
//
//    @NotBlank(message = "O reservista não pode estar em branco")
//    String reservist,
//
//    @NotBlank(message = "A CNH não pode estar em branco")
//    String cnh,
//
//    @NotBlank(message = "A cor/raça não pode estar em branco")
//    String raceColor,
//
//    @NotBlank(message = "A religião não pode estar em branco")
//    String religion,
//
//    @NotNull(message = "O campo de doador de sangue não pode ser nulo")
//    Boolean bloodDonor,
//
//    @NotBlank(message = "A nacionalidade não pode estar em branco")
//    String nationality,
//
//    @NotBlank(message = "Os idiomas falados não podem estar em branco")
//    String languages,
//
//    @NotNull(message = "As horas extras não podem ser nulas")
//    @Min(value = 0, message = "As horas extras não podem ser negativas")
//    Integer overtime,
//
//    @NotNull(message = "O horário de entrada não pode ser nulo")
//    LocalTime clockIn,
//
//    @NotNull(message = "O horário de saída não pode ser nulo")
//    LocalTime clockOut,
//
//    @Valid @NotNull(message = "Os dados do pai não podem ser nulos")
//    Parent parent,
//
//    @Valid @NotNull(message = "Os dados bancários não podem ser nulos")
//    BankData bankData,
//
//    @Valid @NotNull(message = "O usuário não pode ser nulo")
//    User user,
//
//    @Valid @NotNull(message = "O colaborador não pode ser nulo")
//    Collaborator collaborator
//) {}