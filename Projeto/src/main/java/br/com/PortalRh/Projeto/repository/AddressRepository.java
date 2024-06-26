package br.com.PortalRh.Projeto.repository;

import br.com.PortalRh.Projeto.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
