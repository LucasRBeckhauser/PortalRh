package br.com.PortalRh.Projeto.controller;

import br.com.PortalRh.Projeto.controller.dtos.UserDTO;
import br.com.PortalRh.Projeto.model.User;
import br.com.PortalRh.Projeto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController extends AbstractController {


    @Autowired
    private UserService userService;


    @PostMapping
    public ResponseEntity<User> createUser (@RequestBody UserDTO userDTO) {
        return userService.create(userDTO);
    }

    @GetMapping
    public ResponseEntity<List<UserDTO>> getAllUsers() {
        List<User> all = userService.findAll();
        List<UserDTO> userDTOS = UserDTO.fromEntityList(all);
        return ResponseEntity.ok(userDTOS);
    }

    @PutMapping ("/{id}")
    public ResponseEntity <User> updateUser (@RequestBody UserDTO userDTO, @PathVariable Long id) {
        return userService.update(userDTO, id);
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity <Void> deleteUser (@PathVariable Long id) { return userService.delete(id);}
}

