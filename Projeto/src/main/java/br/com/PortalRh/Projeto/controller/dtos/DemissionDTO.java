package br.com.PortalRh.Projeto.controller.dtos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.PortalRh.Projeto.model.Demission;


public class DemissionDTO {

    LocalDate demissionDate;

    String reasonDemission;

    public DemissionDTO() {}

    public DemissionDTO(LocalDate demissionDate, String reasonDemission) {
        this.demissionDate = demissionDate;
        this.reasonDemission = reasonDemission;
    }

    public LocalDate getDemissionDate() {
        return demissionDate;
    }

    public void setDemissionDate(LocalDate demissionDate) {
        this.demissionDate = demissionDate;
    }

    public String getReasonDemission() {
        return reasonDemission;
    }

    public void setReasonDemission(String reasonDemission) {
        this.reasonDemission = reasonDemission;
    }

    public static DemissionDTO fromEntity(Demission demission) {
        return new DemissionDTO(
                demission.getDemissionDate(),
                demission.getReasonDemission()
        );
    }

    public static List<DemissionDTO> fromEntityList(List<Demission> demissions){
        List<DemissionDTO> demissionDTOList = new ArrayList<>();
        for (Demission demission : demissions) {
            demissionDTOList.add(fromEntity(demission));
        }
        return demissionDTOList;
    }

    public Demission toEntity() {
        Demission demission = new Demission();
        demission.setDemissionDate(this.demissionDate);
        demission.setReasonDemission(this.reasonDemission);
        return demission;
    }

    public static List<Demission> toEntityList(List<DemissionDTO> demissionDTOS) {
        List<Demission> demissions = new ArrayList<>();
        for (DemissionDTO demissionDTO : demissionDTOS) {
            demissions.add(demissionDTO.toEntity());
        }
        return demissions;
    }

}
