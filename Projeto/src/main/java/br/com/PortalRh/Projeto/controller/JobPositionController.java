package br.com.PortalRh.Projeto.controller;

import br.com.PortalRh.Projeto.controller.dtos.DemissionDTO;
import br.com.PortalRh.Projeto.model.Demission;
import br.com.PortalRh.Projeto.model.JobPosition;
import br.com.PortalRh.Projeto.controller.dtos.JobPositionDTO;
import br.com.PortalRh.Projeto.service.JobPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/jobPositions")
public class JobPositionController extends AbstractController{


    @Autowired
    private JobPositionService jobPositionService;

    @PostMapping
    public ResponseEntity<JobPosition> createJobPosition(@RequestBody JobPositionDTO jobPositionDTO) {
        return jobPositionService.create(jobPositionDTO);
    }

    @GetMapping
    public ResponseEntity<List<JobPositionDTO>> getAllJobPositions() {
        List<JobPosition> all = jobPositionService.findAll();
        List<JobPositionDTO> jobPositionDTOS = JobPositionDTO.fromEntityList(all);
        return ResponseEntity.ok(jobPositionDTOS);
    }

    @GetMapping("/{id}")
    public ResponseEntity<JobPosition> getJobPositionById(@PathVariable Long id) {
        return jobPositionService.findById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<JobPosition> updateJobPosition(@RequestBody JobPositionDTO jobPositionDTO, @PathVariable Long id) {
        return jobPositionService.update(jobPositionDTO, id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteParent(@PathVariable Long id) {
        return jobPositionService.delete(id);
    }
}
