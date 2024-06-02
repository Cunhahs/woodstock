package br.com.senac.woodstock.woodstock.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    String id;
    String dataPedido;
    String valorTotal;

    
    public Pedido(){}
    
    public Pedido(String dataPedido, String valorTotal) {
        this.dataPedido = dataPedido;
        this.valorTotal = valorTotal;
    }
}

