package br.com.senac.woodstock.woodstock.repo;

import java.util.List;

import br.com.senac.woodstock.woodstock.Model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.senac.woodstock.woodstock.Model.Pedido;

import java.util.Optional;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findAllByUserId(String userId);
    Optional<Produto> findByProduto(Produto produto);
}
