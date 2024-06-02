package br.com.senac.woodstock.woodstock.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.senac.woodstock.woodstock.Model.User;
import br.com.senac.woodstock.woodstock.service.UserService;

public class ClienteController {

    private UserService userService;

        @GetMapping("{id}")
    public ResponseEntity<User> getUserById( @PathVariable("id") Long id ){
        User user = this.userService.getUserById(id);
        return ResponseEntity.ok(user);
    }

        @DeleteMapping("{id}")
    public ResponseEntity<String> deleteUser( @PathVariable("id") Long id){
        this.userService.deleteUser(id);
        return new ResponseEntity<>("Usuário removido com sucesso", HttpStatus.OK);
    }
        @PutMapping
    public ResponseEntity<User> updateUser( @RequestBody User user ){
        return new ResponseEntity<>(this.userService.updateUser(user), HttpStatus.OK);
    }
    
}
