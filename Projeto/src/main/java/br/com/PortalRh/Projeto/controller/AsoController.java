package br.com.PortalRh.Projeto.controller;

import java.util.List;

import br.com.PortalRh.Projeto.controller.dtos.AddressDTO;
import br.com.PortalRh.Projeto.controller.dtos.AsoDTO;
import br.com.PortalRh.Projeto.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import br.com.PortalRh.Projeto.model.Aso;
import br.com.PortalRh.Projeto.service.AsoService;

@RestController
@RequestMapping("/api/asos")
public class AsoController extends AbstractController{

    @Autowired
    private AsoService asoService;

    @PostMapping
    public ResponseEntity<Aso> createAso(@RequestBody AsoDTO asoDTO) {
        return asoService.create(asoDTO);
    }

    @GetMapping
    public ResponseEntity<List<AsoDTO>> getAllAsos() {
        List<Aso> all = asoService.findAll();
        List<AsoDTO> asoDTOs = AsoDTO.fromEntityList(all);
        return ResponseEntity.ok(asoDTOs);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Aso> getAsoById(@PathVariable Long id) {
        return asoService.findById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity <Aso> updateAso (@RequestBody AsoDTO asoDTO, @PathVariable Long id) {
        return asoService.update(asoDTO, id);
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity <Void> deleteAso (@PathVariable Long id) { return asoService.delete(id);}
}