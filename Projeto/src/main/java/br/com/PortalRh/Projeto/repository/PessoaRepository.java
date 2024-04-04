package br.com.PortalRh.Projeto.repository;
import br.com.PortalRh.Projeto.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
