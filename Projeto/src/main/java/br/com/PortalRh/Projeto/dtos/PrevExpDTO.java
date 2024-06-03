package br.com.PortalRh.Projeto.dtos;

public class PrevExpDTO {
    private String company;
    private Integer expMonths;
    private Integer expYears;
    private String description;
    private Long personId;

    public PrevExpDTO() {
    }

    public PrevExpDTO(String company, Integer expMonths, Integer expYears, String description, Long personId) {
        this.company = company;
        this.expMonths = expMonths;
        this.expYears = expYears;
        this.description = description;
        this.personId = personId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Integer getExpMonths() {
        return expMonths;
    }

    public void setExpMonths(Integer expMonths) {
        this.expMonths = expMonths;
    }

    public Integer getExpYears() {
        return expYears;
    }

    public void setExpYears(Integer expYears) {
        this.expYears = expYears;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    @Override
    public String toString() {
        return "PrevExpDTO{" +
                "company='" + company + '\'' +
                ", expMonths=" + expMonths +
                ", expYears=" + expYears +
                ", description='" + description + '\'' +
                ", personId=" + personId +
                '}';
    }
}
