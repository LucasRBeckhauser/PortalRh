package br.com.PortalRh.Projeto.controller.dtos;

import java.time.LocalDate;

public record AsoDTO(
    String healthHistory,
    String medicalProcesses,
    LocalDate supplementaryExamsDate,
    String responsibleDoctorName,
    String responsibleDoctorCrm,
    String coordinatingDoctorName,
    String coordinatingDoctorCrm,
    String occupationalRisks,
    String finalJudgment,
    LocalDate doctorSignatureDate
) {}