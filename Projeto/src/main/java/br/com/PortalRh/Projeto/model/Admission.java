package br.com.PortalRh.Projeto.model;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "admissions")
public class Admission extends EntityId{
    
    @CreationTimestamp
    @Column(name = "admission_date", nullable = false)
    private LocalDate AdmissionDate;

    @OneToOne
    @JoinColumn(name = "aso_id", nullable = false)
    private Aso aso;

    @OneToOne(mappedBy = "admission", cascade = CascadeType.ALL)
    private Collaborator collaborator;

    public Admission() {}

    public Admission(LocalDate admissionDate, Aso aso) {
        AdmissionDate = admissionDate;
        this.aso = aso;
    }

    public LocalDate getAdmissionDate() {
        return AdmissionDate;
    }

    public void setAdmissionDate(LocalDate admissionDate) {
        AdmissionDate = admissionDate;
    }

    public Aso getAso() {
        return aso;
    }

    public void setAso(Aso aso) {
        this.aso = aso;
    }

    public Collaborator getCollaborator() {
        return collaborator;
    }

    public void setCollaborator(Collaborator collaborator) {
        this.collaborator = collaborator;
    }

    @Override
    public String toString() {
        return "Admission [AdmissionDate=" + AdmissionDate + ", aso=" + aso + ", collaborator=" + collaborator + "]";
    }
}
