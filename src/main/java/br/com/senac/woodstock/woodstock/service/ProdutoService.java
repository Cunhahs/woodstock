package br.com.senac.woodstock.woodstock.service;

import br.com.senac.woodstock.woodstock.Model.Produto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProdutoService {

    Produto createProduto(Produto Produto);

    void deleteProduto(Long id);

    List<Produto> getAllProdutos();

    Produto getProdutoById(Long id);

    Produto updateProduto(Produto Produto);
}
