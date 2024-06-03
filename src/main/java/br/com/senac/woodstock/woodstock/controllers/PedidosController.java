package br.com.senac.woodstock.woodstock.controllers;

    import br.com.senac.woodstock.woodstock.Model.User;
    import br.com.senac.woodstock.woodstock.repo.PedidoRepository;
    import br.com.senac.woodstock.woodstock.repo.UserRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.security.core.Authentication;
    import org.springframework.security.core.context.SecurityContextHolder;
    import org.springframework.security.core.userdetails.UserDetails;
    import org.springframework.stereotype.Controller;
    import org.springframework.ui.Model;
    import org.springframework.web.bind.annotation.*;
    import br.com.senac.woodstock.woodstock.Model.Pedido;

    import java.util.Optional;

@Controller
    @RequestMapping("/pedidos")
    public class PedidosController {

        @Autowired
        UserRepository userRepository;

        @Autowired
        PedidoRepository pedidoRepository;


        @GetMapping
        public String listar(Model model) {

            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            // Verificar se o usuário está autenticado
            if (authentication != null && authentication.isAuthenticated()) {
                // Recuperar os detalhes do usuário autenticado
                UserDetails userDetails = (UserDetails) authentication.getPrincipal();

                // Recuperar o nome de usuário do UserDetails (ou outras informações do usuário)
                String username = userDetails.getUsername();

                // Aqui você pode usar o nome de usuário para buscar o ID do usuário no seu sistema
                // Exemplo fictício: substitua esta linha pelo código para buscar o ID do usuário no seu sistema
                Optional<User> idDoUsuario = userRepository.findByUsername(username);

                // Agora você pode usar o ID do usuário para buscar os pedidos
                model.addAttribute("pedidos", pedidoRepository.findAllByUserId(idDoUsuario.get().getId()));
            }            return "pedidos";
        }

    @PostMapping
    public String salvar(@ModelAttribute("pedido") Pedido pedido) {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.isAuthenticated()) {
            UserDetails userDetails = (UserDetails) authentication.getPrincipal();

            String username = userDetails.getUsername();
            Optional<User> idDoUsuario = userRepository.findByUsername(username);

            //AMARRANDO USUÁRIO LOGADO NO PEDIDO
            pedido.setUser(idDoUsuario.get());

            pedidoRepository.saveAndFlush(pedido);

        }
        return "pedidos";
    }




}


