package br.com.senac.woodstock.woodstock.repo;


import br.com.senac.woodstock.woodstock.Model.Produto;
import br.com.senac.woodstock.woodstock.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, String> {
    Optional<Produto> findByDescricao(String descricao);
}
