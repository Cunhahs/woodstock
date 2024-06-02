package br.com.senac.woodstock.woodstock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.senac.woodstock.woodstock.Model.Pedido;
import br.com.senac.woodstock.woodstock.repo.PedidoRepository;
import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido> findAllByUsuarioId(String user_id) {
        return pedidoRepository.findAllByUserId(user_id);
    }

}
