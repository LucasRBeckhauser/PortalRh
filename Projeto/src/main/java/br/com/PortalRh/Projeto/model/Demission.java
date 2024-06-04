package br.com.PortalRh.Projeto.model;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "demissions")
public class Demission extends EntityId{
    @CreationTimestamp
    private LocalDate demissionDate;

    @OneToOne(mappedBy = "demission", cascade = CascadeType.ALL)
    private Collaborator collaborator;

    public Demission() {
    }

    public Demission(LocalDate demissionDate, Collaborator collaborator) {
        this.demissionDate = demissionDate;
        this.collaborator = collaborator;
    }

    public LocalDate getDemissionDate() {
        return demissionDate;
    }

    public void setDemissionDate(LocalDate demissionDate) {
        this.demissionDate = demissionDate;
    }

    public Collaborator getCollaborator() {
        return collaborator;
    }

    public void setCollaborator(Collaborator collaborator) {
        this.collaborator = collaborator;
    }

    @Override
    public String toString() {
        return "Demission [demissionDate=" + demissionDate + ", collaborator=" + collaborator + "]";
    }
}
