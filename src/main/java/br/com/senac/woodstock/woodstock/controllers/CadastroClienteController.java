package br.com.senac.woodstock.woodstock.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import br.com.senac.woodstock.woodstock.Model.User;


@Controller
public class CadastroClienteController {
    @GetMapping("/cadastro")
    public String cadastroCliente(Model model) {
        User user = new User();
        model.addAttribute(user);
        return "cadastroCliente";
    }
}
