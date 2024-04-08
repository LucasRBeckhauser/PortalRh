package br.com.PortalRh.Projeto.repository;

import br.com.PortalRh.Projeto.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
