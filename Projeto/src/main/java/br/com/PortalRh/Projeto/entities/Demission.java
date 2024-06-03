package br.com.PortalRh.Projeto.entities;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "demissions")
public class Demission {
    @CreationTimestamp
    private LocalDate demissionDate;

    @OneToOne
    @JoinColumn(name = "demission_id")
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
