package br.com.PortalRh.Projeto.controller;


import br.com.PortalRh.Projeto.model.Collaborator;
import br.com.PortalRh.Projeto.controller.dtos.CollaboratorDTO;
import br.com.PortalRh.Projeto.service.CollaboratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/collaborators")
public class CollaboratorController extends AbstractController{

    @Autowired
    private CollaboratorService collaboratorService;


    @PostMapping
    public ResponseEntity<Collaborator> createCollaborator(@RequestBody CollaboratorDTO collaboratorDTO) {
        return collaboratorService.create(collaboratorDTO);
    }

    @GetMapping
    public ResponseEntity<List<CollaboratorDTO>> getAllCollaborators() {
        List<Collaborator> all = collaboratorService.findAll();
        List<CollaboratorDTO> collaboratorDTOS = CollaboratorDTO.fromEntityList(all);
        return ResponseEntity.ok(collaboratorDTOS);
    }

    @PutMapping ("/{id}")
    public ResponseEntity <Collaborator> updateCollaborator (@RequestBody CollaboratorDTO collaboratorDTO, @PathVariable Long id) {
        return collaboratorService.update(collaboratorDTO, id);
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity <Void> deleteCollaborator (@PathVariable Long id) { return collaboratorService.delete(id);}
}
