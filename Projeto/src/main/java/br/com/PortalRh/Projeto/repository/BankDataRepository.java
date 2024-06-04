package br.com.PortalRh.Projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.PortalRh.Projeto.model.BankData;

public interface BankDataRepository extends JpaRepository<BankData, Long> {}
