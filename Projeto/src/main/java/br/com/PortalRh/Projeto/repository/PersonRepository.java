package br.com.PortalRh.Projeto.repository;
import br.com.PortalRh.Projeto.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
