package br.com.senac.woodstock.woodstock.service;

import br.com.senac.woodstock.woodstock.Model.Pedido;
import br.com.senac.woodstock.woodstock.Model.Produto;
import br.com.senac.woodstock.woodstock.repo.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoImpl {

        @Autowired
        PedidoRepository pedidoRepository;

    public List<Pedido> findAllByUsuarioId(String user_id) {
        return pedidoRepository.findAllByUserId(user_id);
    }
    public Optional<Produto> findByProduto(Produto produto) {return pedidoRepository.findByProduto(produto);}
}
