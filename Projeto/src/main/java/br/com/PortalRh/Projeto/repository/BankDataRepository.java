package br.com.PortalRh.Projeto.repository;

import br.com.PortalRh.Projeto.entities.BankData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankDataRepository extends JpaRepository <BankData, Long> {
}
