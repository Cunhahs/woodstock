package br.com.senac.woodstock.woodstock.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProdutosController {
    @GetMapping("/produtos")
    public String produtos() {
        return "produtos";
    }
}
