package br.com.senac.woodstock.woodstock.controllers;

import br.com.senac.woodstock.woodstock.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import br.com.senac.woodstock.woodstock.Model.User;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class CadastroClienteController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/cadastro")
    public String createUser(@ModelAttribute("user") User user) {
        System.out.println("entrei");

       try {
           User savedUser = userRepository.save(user);
           System.out.println(savedUser.getUsername() + "Usuário criado");
           return "login";
       }

       catch (Exception e) {
           System.out.println(e.getMessage());
           return "cadastroCliente";
       }

    }

    @GetMapping("/cadastro")
    public String cadastroCliente(Model model) {
        User user = new User();
        model.addAttribute(user);
        return "cadastroCliente";
    }
}
