package br.com.senac.woodstock.woodstock.controllers;

import br.com.senac.woodstock.woodstock.Model.User;
import br.com.senac.woodstock.woodstock.security.SecurityConfig;
import br.com.senac.woodstock.woodstock.service.Userimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @Autowired
    private Userimpl userimpl;

    @GetMapping("/login")
    public String showLoginPage(Model model) {
        System.out.println("In showLoginPage");
        model.addAttribute("user", new User());
        return "login"; // Retorna a view 'login.html'
    }

   @PostMapping("/login")
    public String login(@ModelAttribute("user") User user) {
         boolean b = userimpl.validateUser(user.getUsername(), user.getPassword());
        if (b) {
            return "redirect:/home"; // Redireciona para a página inicial ou dashboard se o usuário estiver autenticado
        } else {
            return "login"; // Retorna para a página de login
        }
    }
}