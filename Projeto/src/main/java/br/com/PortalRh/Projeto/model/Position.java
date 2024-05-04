package br.com.PortalRh.Projeto.model;

import br.com.PortalRh.Projeto.model.enuns.TipoCargo;

public class Position extends EntityId{
    private String description;
    private String level;
    private Boolean commissioned;
    private TipoCargo positionType;

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

    public Boolean getCommissioned() {
        return commissioned;
    }

    public void setCommissioned(Boolean commissioned) {
        this.commissioned = commissioned;
    }

    public TipoCargo getPositionType() {
        return positionType;
    }

    public void setPositionType(TipoCargo positionType) {
        this.positionType = positionType;
    }

    public Position() {
    }

    @Override
    public String toString() {
        return "Position{" +
                "description='" + description + '\'' +
                ", level='" + level + '\'' +
                ", commissioned=" + commissioned +
                ", positionType=" + positionType +
                '}';
    }
}

