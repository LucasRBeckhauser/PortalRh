package br.com.PortalRh.Projeto.model;

import java.time.LocalDate;

public class ASO {
    private String historicoDeSaude;
    private String processosMedicos;
    private LocalDate dataExamesComplementares;
    private String nomeMedicoEncarregado;
    private String crmMedicoEncarregado;
    private String nomeMedicoCoordenador;
    private String crmMedicoCoordenador;
    private String riscosOcupacionais;
    private String julgamentoFinal;
    private LocalDate dataAssinaturaMedico;

    // Getters and Setters
    public String getHistoricoDeSaude() {
        return historicoDeSaude;
    }

    public void setHistoricoDeSaude(String historicoDeSaude) {
        this.historicoDeSaude = historicoDeSaude;
    }

    public String getProcessosMedicos() {
        return processosMedicos;
    }

    public void setProcessosMedicos(String processosMedicos) {
        this.processosMedicos = processosMedicos;
    }

    public LocalDate getDataExamesComplementares() {
        return dataExamesComplementares;
    }

    public void setDataExamesComplementares(LocalDate dataExamesComplementares) {
        this.dataExamesComplementares = dataExamesComplementares;
    }

    public String getNomeMedicoEncarregado() {
        return nomeMedicoEncarregado;
    }

    public void setNomeMedicoEncarregado(String nomeMedicoEncarregado) {
        this.nomeMedicoEncarregado = nomeMedicoEncarregado;
    }

    public String getCrmMedicoEncarregado() {
        return crmMedicoEncarregado;
    }

    public void setCrmMedicoEncarregado(String crmMedicoEncarregado) {
        this.crmMedicoEncarregado = crmMedicoEncarregado;
    }

    public String getNomeMedicoCoordenador() {
        return nomeMedicoCoordenador;
    }

    public void setNomeMedicoCoordenador(String nomeMedicoCoordenador) {
        this.nomeMedicoCoordenador = nomeMedicoCoordenador;
    }

    public String getCrmMedicoCoordenador() {
        return crmMedicoCoordenador;
    }

    public void setCrmMedicoCoordenador(String crmMedicoCoordenador) {
        this.crmMedicoCoordenador = crmMedicoCoordenador;
    }

    public String getRiscosOcupacionais() {
        return riscosOcupacionais;
    }

    public void setRiscosOcupacionais(String riscosOcupacionais) {
        this.riscosOcupacionais = riscosOcupacionais;
    }

    public String getJulgamentoFinal() {
        return julgamentoFinal;
    }

    public void setJulgamentoFinal(String julgamentoFinal) {
        this.julgamentoFinal = julgamentoFinal;
    }

    public LocalDate getDataAssinaturaMedico() {
        return dataAssinaturaMedico;
    }

    public void setDataAssinaturaMedico(LocalDate dataAssinaturaMedico) {
        this.dataAssinaturaMedico = dataAssinaturaMedico;
    }

    public ASO() {
    }

    @Override
    public String toString() {
        return "ASO{" +
                "historicoDeSaude='" + historicoDeSaude + '\'' +
                ", processosMedicos='" + processosMedicos + '\'' +
                ", dataExamesComplementares=" + dataExamesComplementares +
                ", nomeMedicoEncarregado='" + nomeMedicoEncarregado + '\'' +
                ", crmMedicoEncarregado='" + crmMedicoEncarregado + '\'' +
                ", nomeMedicoCoordenador='" + nomeMedicoCoordenador + '\'' +
                ", crmMedicoCoordenador='" + crmMedicoCoordenador + '\'' +
                ", riscosOcupacionais='" + riscosOcupacionais + '\'' +
                ", julgamentoFinal='" + julgamentoFinal + '\'' +
                ", dataAssinaturaMedico=" + dataAssinaturaMedico +
                '}';
    }
}
