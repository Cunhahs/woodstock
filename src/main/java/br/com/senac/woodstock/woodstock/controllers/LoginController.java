package br.com.senac.woodstock.woodstock.controllers;

import br.com.senac.woodstock.woodstock.Model.User;
import br.com.senac.woodstock.woodstock.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.logging.Logger;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;

   @GetMapping("/login")
    public String showLoginPage(Model model) {
        System.out.println("In showLoginPage");
        model.addAttribute("user", new User());
        return "login"; // Retorna a view 'login.html'
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("user") User user) {
        System.out.println("entrei no POST");
        boolean isValidUser = userService.validateUser(user.getUsername(), user.getPassword());
        if (isValidUser) {
            return "home"; // Redireciona para a página inicial ou dashboard
        } else {
            return "login"; // Retorna para a página de login
        }
    }
}
