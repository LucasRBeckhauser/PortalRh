package br.com.PortalRh.Projeto.model;

import java.time.LocalDate;
import java.util.List;

public class Admission {

    //Será implementada
    //private Colaborator colaborator

    private LocalDate dataAdmissao;


    private List<ASO> asoList;

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public List<ASO> getAsoList() {
        return asoList;
    }

    public void setAsoList(List<ASO> asoList) {
        this.asoList = asoList;
    }


    public Admission() {
    }

    @Override
    public String toString() {
        return "Admission{" +
                "dataAdmissao=" + dataAdmissao +
                ", asoList=" + asoList +
                '}';
    }
}
