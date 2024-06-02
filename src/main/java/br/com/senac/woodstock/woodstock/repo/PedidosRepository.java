package br.com.senac.woodstock.woodstock.repo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import br.com.senac.woodstock.woodstock.Model.Pedido;

@Repository
public class PedidosRepository {
    private List<Pedido> pedidos;

    public PedidosRepository() {
        this.pedidos = new ArrayList<>();
    }

    public void addPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public Object findAll() {
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }
}
