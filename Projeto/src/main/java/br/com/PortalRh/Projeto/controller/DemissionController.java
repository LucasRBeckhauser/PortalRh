package br.com.PortalRh.Projeto.controller;

import br.com.PortalRh.Projeto.controller.dtos.BankDataDTO;
import br.com.PortalRh.Projeto.model.BankData;
import br.com.PortalRh.Projeto.model.Demission;
import br.com.PortalRh.Projeto.controller.dtos.DemissionDTO;
import br.com.PortalRh.Projeto.service.DemissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/demissions")
public class DemissionController extends AbstractController{

    @Autowired
    private DemissionService demissionService;


    @PostMapping
    public ResponseEntity<Demission> createDemission(@RequestBody DemissionDTO demissionDTO) {
        return demissionService.create(demissionDTO);
    }

    @GetMapping
    public ResponseEntity<List<DemissionDTO>> getAlldemissions() {
        List<Demission> all = demissionService.findAll();
        List<DemissionDTO> demissionDTOS = DemissionDTO.fromEntityList(all);
        return ResponseEntity.ok(demissionDTOS);
    }

    @PutMapping ("/{id}")
    public ResponseEntity <Demission> updateDemission (@RequestBody DemissionDTO demissionDTO, @PathVariable Long id) {
        return demissionService.update(demissionDTO, id);
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity <Void> deleteDemission (@PathVariable Long id) { return demissionService.delete(id);}
}
