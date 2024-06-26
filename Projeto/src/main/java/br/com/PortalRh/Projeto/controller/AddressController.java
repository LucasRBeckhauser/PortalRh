package br.com.PortalRh.Projeto.controller;

import java.util.List;

import br.com.PortalRh.Projeto.controller.dtos.AddressDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import br.com.PortalRh.Projeto.model.Address;
import br.com.PortalRh.Projeto.service.AddressService;

@RestController
@RequestMapping("/api/addresses")
public class AddressController extends AbstractController{

    @Autowired
    private AddressService addressService;

    @PostMapping
    public ResponseEntity<Address> createAddress(@RequestBody AddressDTO addressDTO) {
        return addressService.create(addressDTO);
    }

    @GetMapping
    public ResponseEntity<List<AddressDTO>> getAllAddresses() {
        List<Address> all = addressService.findAll();
        List<AddressDTO> addressDTOs = AddressDTO.fromEntityList(all);
        return ResponseEntity.ok(addressDTOs);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Address> getAddressById(@PathVariable Long id) {
        return addressService.findById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Address> updateAddress(@RequestBody AddressDTO addressDTO, @PathVariable Long id) {
        return addressService.update(addressDTO, id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAddress(@PathVariable Long id) {
        return addressService.delete(id);
    }
}