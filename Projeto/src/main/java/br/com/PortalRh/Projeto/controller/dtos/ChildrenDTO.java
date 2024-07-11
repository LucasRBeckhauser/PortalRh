package br.com.PortalRh.Projeto.controller.dtos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.PortalRh.Projeto.model.Children;
import br.com.PortalRh.Projeto.model.Person;

public class ChildrenDTO {
        String name;

        LocalDate age;

        Person person;

        public ChildrenDTO() {}

        public ChildrenDTO(String name, LocalDate age, Person person) {
                this.name = name;
                this.age = age;
                this.person = person;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public LocalDate getAge() {
                return age;
        }

        public void setAge(LocalDate age) {
                this.age = age;
        }

        public Person getPerson() {
                return person;
        }

        public void setPerson(Person person) {
                this.person = person;
        }

        public static ChildrenDTO fromEntity(Children children) {
                return new ChildrenDTO(
                        children.getName(),
                        children.getAge(),
                        children.getPerson()
                );

        }

        public static List<ChildrenDTO> fromEntityList(List<Children> childrens){
                List<ChildrenDTO> childrenDTOList = new ArrayList<>();
                for (Children children : childrens) {
                        childrenDTOList.add(fromEntity(children));
                }
                return childrenDTOList;
        }

        public Children toEntity() {
                Children children = new Children();
                children.setAge(this.age);
                children.setName(this.name);
                children.setPerson(this.person);
                return children;
        }

        public static List<Children> toEntityList(List<ChildrenDTO> childrenDTOS) {
                List<Children> children = new ArrayList<>();
                for (ChildrenDTO childrenDTO : childrenDTOS) {
                        children.add(childrenDTO.toEntity());
                }
                return children;
        }

}