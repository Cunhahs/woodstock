package br.com.senac.woodstock.woodstock.repo;

import java.util.ArrayList;
import java.util.List;

import br.com.senac.woodstock.woodstock.Model.Produto;
import br.com.senac.woodstock.woodstock.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.senac.woodstock.woodstock.Model.Pedido;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findAllByUserId(String userId);
    Optional<Produto> findByProduto(String produto);
}
