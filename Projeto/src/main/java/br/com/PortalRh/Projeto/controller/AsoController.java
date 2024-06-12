package br.com.PortalRh.Projeto.controller;

import br.com.PortalRh.Projeto.model.Aso;
import br.com.PortalRh.Projeto.model.dtos.AsoDTO;
import br.com.PortalRh.Projeto.service.AsoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("api/Aso's")
public class AsoController {

    @Autowired
    private AsoService asoService;


    @PostMapping
    public ResponseEntity <Aso> createAso (@RequestBody AsoDTO asoDTO) {
        return asoService.create(asoDTO);
    }

    @GetMapping
    public ResponseEntity<List<Aso>> getAllAso() {return asoService.findAll();}

    @PutMapping ("/{id}")
    public ResponseEntity <Aso> updateAso (@RequestBody AsoDTO asoDTO, @PathVariable Long id) {
        return asoService.update(asoDTO, id);
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity <Void> deleteAso (@PathVariable Long id) { return asoService.delete(id);}

}
