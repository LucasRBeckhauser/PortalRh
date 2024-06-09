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
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "cpf", nullable = false)
    private String cpf;

    @Column(name = "rg", nullable = false)
    private String rg;

    @Column(name = "voter_regist", nullable = false)
    private String voterRegist;

    @Column(name = "birthday", nullable = false)
    private LocalDate birthday;

    @Column(name = "reservist", nullable = false)
    private String reservist;

    @Column(name = "cnh", nullable = false)
    private String cnh;

    @Column(name = "race_color", nullable = false)
    private String raceColor;

    @Column(name = "religion", nullable = false)
    private String religion;

    @Column(name = "blood_donor", nullable = false)
    private Boolean bloodDonor;

    @Column(name = "nacionality", nullable = false)
    private String nacionality;

    @Column(name = "languages", nullable = false)
    private String languages;

    @Column(name = "overtime", nullable = false)
    private Integer overtime;

    @Column(name = "clock_in", nullable = false)
    private LocalTime clockIn;

    @Column(name = "clockOut", nullable = false)
    private LocalTime clockOut;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<PreviousExperience> previousExperiences;
    
    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<Language> language;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<SocialMedia> socialMedia;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<Certification> certification;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<Children> children;
    
    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<Address> addres;

    @OneToOne
    @JoinColumn(name = "parent_id")
    private Parent parent;

    @OneToOne
    @JoinColumn(name = "bank_data_id")
    private BankData bankData;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne
    @JoinColumn(name = "collaborator_id")
    private Collaborator collaborator;

    public Person() {}

    public Person(String name, String cpf, String rg, String voterRegist, LocalDate birthday, String reservist, String cnh, String raceColor, String religion, Boolean bloodDonor, String nacionality, String languages, Integer overtime, LocalTime clockIn, LocalTime clockOut, Parent parent, BankData bankData, User user, Collaborator collaborator) {
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
        this.nacionality = nacionality;
        this.languages = languages;
        this.overtime = overtime;
        this.clockIn = clockIn;
        this.clockOut = clockOut;
        this.parent = parent;
        this.bankData = bankData;
        this.user = user;
        this.collaborator = collaborator;
    }

    public Person(Builder builder) {
        this.name = builder.name;
        this.cpf = builder.cpf;
        this.rg = builder.rg;
        this.voterRegist = builder.voterRegist;
        this.birthday = builder.birthday;
        this.reservist = builder.reservist;
        this.cnh = builder.cnh;
        this.raceColor = builder.raceColor;
        this.religion = builder.religion;
        this.bloodDonor = builder.bloodDonor;
        this.nacionality = builder.nacionality;
        this.languages = builder.languages;
        this.overtime = builder.overtime;
        this.clockIn = builder.clockIn;
        this.clockOut = builder.clockOut;
        this.parent = builder.parent;
        this.bankData = builder.bankData;
        this.user = builder.user;
        this.collaborator = builder.collaborator;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getVoterRegist() {
        return voterRegist;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getReservist() {
        return reservist;
    }

    public String getCnh() {
        return cnh;
    }

    public String getRaceColor() {
        return raceColor;
    }

    public String getReligion() {
        return religion;
    }

    public Boolean getBloodDonor() {
        return bloodDonor;
    }

    public String getNacionality() {
        return nacionality;
    }

    public String getLanguages() {
        return languages;
    }

    public Integer getOvertime() {
        return overtime;
    }

    public LocalTime getClockIn() {
        return clockIn;
    }

    public LocalTime getClockOut() {
        return clockOut;
    }

    public Parent getParent() {
        return parent;
    }

    public BankData getBankData() {
        return bankData;
    }

    public User getUser() {
        return user;
    }

    public Collaborator getCollaborator() {
        return collaborator;
    }



    public static class Builder {
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
        private String languages;
        private Integer overtime;
        private LocalTime clockIn;
        private LocalTime clockOut;
        private Parent parent;
        private BankData bankData;
        private User user;
        private Collaborator collaborator;

        public Builder() {}

        public Builder name(String name) {
            this.name = name;
            return this;
        }
    
        public Builder cpf(String cpf) {
            this.cpf = cpf;
            return this;
        }
    
        public Builder rg(String rg) {
            this.rg = rg;
            return this;
        }
    
        public Builder voterRegist(String voterRegist) {
            this.voterRegist = voterRegist;
            return this;
        }
    
        public Builder birthday(LocalDate birthday) {
            this.birthday = birthday;
            return this;
        }
    
        public Builder reservist(String reservist) {
            this.reservist = reservist;
            return this;
        }
    
        public Builder cnh(String cnh) {
            this.cnh = cnh;
            return this;
        }
    
        public Builder raceColor(String raceColor) {
            this.raceColor = raceColor;
            return this;
        }
    
        public Builder religion(String religion) {
            this.religion = religion;
            return this;
        }
    
        public Builder bloodDonor(Boolean bloodDonor) {
            this.bloodDonor = bloodDonor;
            return this;
        }
    
        public Builder nacionality(String nacionality) {
            this.nacionality = nacionality;
            return this;
        }
    
        public Builder languages(String languages) {
            this.languages = languages;
            return this;
        }
    
        public Builder overtime(Integer overtime) {
            this.overtime = overtime;
            return this;
        }
    
        public Builder clockIn(LocalTime clockIn) {
            this.clockIn = clockIn;
            return this;
        }
    
        public Builder clockOut(LocalTime clockOut) {
            this.clockOut = clockOut;
            return this;
        }

        public Builder parent(Parent parent) {
            this.parent = parent;
            return this;
        }
    
        public Builder bankData(BankData bankData) {
            this.bankData = bankData;
            return this;
        }
    
        public Builder user(User user) {
            this.user = user;
            return this;
        }
    
        public Builder collaborator(Collaborator collaborator) {
            this.collaborator = collaborator;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
