package br.com.senac.woodstock.woodstock.controllers;

    import org.springframework.stereotype.Controller;
    import org.springframework.ui.Model;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
    import br.com.senac.woodstock.woodstock.Model.Pedido;
    import br.com.senac.woodstock.woodstock.repo.PedidosRepository;
    
    @Controller
    @RequestMapping("/pedidos")
    public class PedidosController {
    
        private final PedidosRepository pedidoRepository;
    
        public PedidosController(PedidosRepository pedidoRepository) {
            this.pedidoRepository = pedidoRepository;
        }
    
        @GetMapping
        public String listar(Model model) {
            model.addAttribute("pedidos", pedidoRepository.findAll());
            return "pedidos/lista";
        }
    
        @PostMapping
        public String salvar(@RequestParam("nome") String nome, @RequestParam("valor") String valor) {
            Pedido pedido = new Pedido(nome, valor);
            pedidoRepository.addPedido(pedido);
            return "redirect:/pedidos";
        }
    }


