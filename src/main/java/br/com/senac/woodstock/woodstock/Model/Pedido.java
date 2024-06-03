package br.com.senac.woodstock.woodstock.Model;

import br.com.senac.woodstock.woodstock.Model.Produto;
import br.com.senac.woodstock.woodstock.Model.User;
import jakarta.persistence.*;

@Entity
@Table(name = "Orders")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido")
    private Long id;

    @Column(name = "data_pedido", nullable = false)
    private String dataPedido;

    @Column(name = "quantidade_produto_pedido", nullable = false)
    private int quantidadeProdutoPedido;

    @Column(name = "valor_pedido", nullable = false)
    private String valorPedido;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "produto_id", nullable = false)
    private Produto produto;

    public void setUser(User user) {
        this.user = user;
    }

    // Construtores, getters e setters
}
