package br.com.PortalRh.Projeto.controller.dtos;

import br.com.PortalRh.Projeto.model.*;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.validator.constraints.br.CPF;

public class PersonDTO {
    String name;

    @CPF
    String cpf;

    String rg;

    String voterRegist;

    LocalDate birthday;

    String reservist;

    String cnh;

    String raceColor;

    String religion;

    Boolean bloodDonor;

    String nationality;

    String languages;


    Integer overtime;

    LocalTime clockIn;

    LocalTime clockOut;

    Parent parent;

    BankData bankData;

    User user;

    Collaborator collaborator;

    public PersonDTO() {}

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



    public static PersonDTO fromEntity(Person person) {
        return new PersonDTO(
                person.getName(),
                person.getCpf(),
                person.getRg(),
                person.getVoterRegist(),
                person.getBirthday(),
                person.getReservist(),
                person.getCnh(),
                person.getRaceColor(),
                person.getReligion(),
                person.getBloodDonor(),
                person.getNacionality(),
                person.getLanguages(),
                person.getOvertime(),
                person.getClockIn(),
                person.getClockOut(),
                person.getParent(),
                person.getBankData(),
                person.getUser(),
                person.getCollaborator()
        );
    }

    public static List<PersonDTO> fromEntityList(List<Person> persons){
        List<PersonDTO> personDTOList = new ArrayList<>();
        for (Person person : persons) {
            personDTOList.add(fromEntity(person));
        }
        return personDTOList;
    }

    public Person toEntity() {
        Person person = new Person();
        person.setName(this.name);
        person.setCpf(this.cpf);
        person.setRg(this.rg);
        person.setVoterRegist(this.voterRegist);
        person.setBirthday(this.birthday);
        person.setCnh(this.cnh);
        person.setRaceColor(this.raceColor);
        person.setReligion(this.religion);
        person.setBloodDonor(this.bloodDonor);
        person.setNacionality(this.nationality);
        person.setLanguages(this.languages);
        person.setOvertime(this.overtime);
        person.setClockIn(this.clockIn);
        person.setClockOut(this.clockOut);
        person.setParent(this.parent);
        person.setBankData(this.bankData);
        person.setUser(this.user);
        person.setCollaborator(this.collaborator);

        return person;
    }

    public static List<Person> toEntityList(List<PersonDTO> personDTOS) {
        List<Person> persons = new ArrayList<>();
        for (PersonDTO personDTO : personDTOS) {
            persons.add(personDTO.toEntity());
        }
        return persons;
    }
}