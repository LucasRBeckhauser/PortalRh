package br.com.PortalRh.Projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.PortalRh.Projeto.model.BankData;

@Repository
public interface BankDataRepository extends JpaRepository<BankData, Long> {}
