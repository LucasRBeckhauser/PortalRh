package br.com.PortalRh.Projeto.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "parents")
public class Parent extends EntityId {
    @Column(name = "fathers_name", nullable = false)
    private String fathersName;
  
    @Column(name = "fathers_phone", nullable = false)
    private String fathersPhone;
  
    @Column(name = "mothers_name", nullable = false)
    private String mothersName;

    @Column(name = "mothers_phone", nullable = false)
    private String mothersPhone;

    @OneToOne(mappedBy = "parent", cascade = CascadeType.ALL)
    private Person person;

    public Parent() {}

    public Parent(String fathersName, String fathersPhone, String mothersName, String mothersPhone) {
        this.fathersName = fathersName;
        this.fathersPhone = fathersPhone;
        this.mothersName = mothersName;
        this.mothersPhone = mothersPhone;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getFathersPhone() {
        return fathersPhone;
    }

    public void setFathersPhone(String fathersPhone) {
        this.fathersPhone = fathersPhone;
    }

    public String getMothersName() {
        return mothersName;
    }

    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }

    public String getMothersPhone() {
        return mothersPhone;
    }

    public void setMothersPhone(String mothersPhone) {
        this.mothersPhone = mothersPhone;
    }
    
    @Override
    public String toString() {
        return "Parent [fathersName=" + fathersName 
                + ", fathersPhone=" + fathersPhone + ", mothersName=" + mothersName
                + ", mothersPhone=" + mothersPhone + ", person=" + person + "]";
    }
    
}
