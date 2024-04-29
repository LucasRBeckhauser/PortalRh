package br.com.PortalRh.Projeto.entities;

import br.com.PortalRh.Projeto.entities.enuns.TipoCargo;

public class Position {
    private String description;
    private String level;
    private Boolean commission;
    private TipoCargo positionType;

    public Position() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Boolean getCommission() {
        return commission;
    }

    public void setCommission(Boolean commission) {
        this.commission = commission;
    }

    public TipoCargo getPositionType() {
        return positionType;
    }

    public void setPositionType(TipoCargo positionType) {
        this.positionType = positionType;
    }

    @Override
    public String toString() {
        return "Position{" +
                "description='" + description + '\'' +
                ", level='" + level + '\'' +
                ", commission=" + commission +
                ", positionType=" + positionType +
                '}';
    }
}
