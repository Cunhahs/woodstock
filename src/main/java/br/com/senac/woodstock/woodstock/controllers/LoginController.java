package br.com.senac.woodstock.woodstock.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.senac.woodstock.woodstock.Model.User;


@Controller
public class LoginController {
    
    @GetMapping("/login")
    public String login( @ModelAttribute("user") User user, BindingResult result, RedirectAttributes redirectAttributes ) {
        return "loginCliente";
    }
}