package br.com.PortalRh.Projeto.controller;

import java.util.List;

import br.com.PortalRh.Projeto.controller.dtos.AddressDTO2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.PortalRh.Projeto.model.Address;
import br.com.PortalRh.Projeto.service.AddressService;

@RestController
@RequestMapping("/api/address")
public class AddressController extends AbstractController{


    @Autowired
    private AddressService addressService;

    @PostMapping
    public ResponseEntity<Address> createAddress(@RequestBody AddressDTO2 addressDTO) {
        return addressService.create(addressDTO);
    }

    @GetMapping
    public ResponseEntity<List<AddressDTO2>> getAllAddresses() {
        List<Address> all = addressService.findAll();
        List<AddressDTO2> addressDTO2s = AddressDTO2.fromEntityList(all);
        return ResponseEntity.ok(addressDTO2s);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Address> getAddressById(@PathVariable Long id) {
        return addressService.findById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Address> updateAddress(@RequestBody AddressDTO2 addressDTO, @PathVariable Long id) {
        return addressService.update(addressDTO, id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAddress(@PathVariable Long id) {
        return addressService.delete(id);
    }
}