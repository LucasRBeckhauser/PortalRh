package br.com.PortalRh.Projeto.model;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "people")
public class Person extends EntityId {
    @Column(name = "name")
    private String name;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "rg")
    private String rg;

    @Column(name = "voter_regist")
    private String voterRegist;

    @Column(name = "birthday")
    private LocalDate birthday;

    @Column(name = "reservist")
    private String reservist;

    @Column(name = "cnh")
    private String cnh;

    @Column(name = "race_color")
    private String raceColor;

    @Column(name = "religion")
    private String religion;

    @Column(name = "blood_donor")
    private Boolean bloodDonor;

    @Column(name = "nacionality")
    private String nacionality;

    @Column(name = "languages")
    private String languages;

    @Column(name = "overtime")
    private Integer overtime;

    @Column(name = "clock_in")
    private LocalTime clockIn;

    @Column(name = "clockOut")
    private LocalTime clockOut;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<PreviousExperience> previousExperiences;
    
    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<Language> language;

    @OneToOne(mappedBy = "person", cascade = CascadeType.ALL)
    private Parent parent;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<SocialMedia> socialMedia;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<Certification> certification;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<Children> children;

    @OneToOne(mappedBy = "person", cascade = CascadeType.ALL)
    private BankData bankData;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<Address> addres;

    @OneToOne(mappedBy = "person", cascade = CascadeType.ALL)
    private User user;

    @OneToOne
    @JoinColumn(name = "person_id")
    private Collaborator collaborator;
    
}
