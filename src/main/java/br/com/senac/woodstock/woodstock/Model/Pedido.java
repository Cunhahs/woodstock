package br.com.senac.woodstock.woodstock.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "Orders")
public class Pedido{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido")
    private Long idPedido;

    @Column(name = "data_pedido")
    private String dataPedido;

    @Column(name = "valor_pedido")
    private String valorPedido;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_user_id"))
    private User user;

    public Pedido() {

    }
}

