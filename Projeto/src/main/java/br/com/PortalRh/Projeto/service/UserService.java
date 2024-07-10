package br.com.PortalRh.Projeto.service;


import br.com.PortalRh.Projeto.controller.dtos.UserDTO;

import br.com.PortalRh.Projeto.enterprise.ValidationException;
import br.com.PortalRh.Projeto.model.User;

import br.com.PortalRh.Projeto.repository.UserRepository;

import br.com.PortalRh.Projeto.validation.User.passwordSpecification;
import br.com.PortalRh.Projeto.validation.ValidationResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ResponseEntity<User> create(UserDTO userDTO) {
        User user = new User (
                userDTO.getUsername(),
                userDTO.getPassword()

        );

        ValidationResult passwordValidationResult = new passwordSpecification().isSatisfiedBy(user);
        if (!passwordValidationResult.isValid()) {
            throw new ValidationException(passwordValidationResult.getMessage());
        }

        userRepository.save(user);
        return ResponseEntity.ok(user);
    }

    public List<User> findAll() {
        List<User> users = userRepository.findAll();
        return users;
    }

    public ResponseEntity<User> findById(Long id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            return ResponseEntity.ok(user.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<User> update(UserDTO userDTO, Long id) {
        Optional<User> optionalUser = userRepository.findById(id);

        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            userDTO.setUsername(userDTO.getUsername());
            userDTO.setPassword(userDTO.getPassword());


            userRepository.save(user);
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<Void> delete(Long id) {
        Optional<User> optionalUser = userRepository.findById(id);

        if (optionalUser.isPresent()) {
            userRepository.delete(optionalUser.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

