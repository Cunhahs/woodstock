package br.com.senac.woodstock.woodstock.service;

import br.com.senac.woodstock.woodstock.Model.Pedido;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface PedidoService {

    Pedido createPedido(Pedido pedido);

    void deletePedido(Long id);

    List<Pedido> getAllPedidos();

    Pedido getPedidoById(Long id);

    Pedido updatePedido(Pedido Pedido);
}
