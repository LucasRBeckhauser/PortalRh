package br.com.PortalRh.Projeto.repository;
import br.com.PortalRh.Projeto.models.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
