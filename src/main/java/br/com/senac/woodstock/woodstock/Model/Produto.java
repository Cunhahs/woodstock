package br.com.senac.woodstock.woodstock.Model;

import jakarta.persistence.*;


@Entity
@Table(name = "Produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int quantidade;

    @Column(nullable = false, length = 50)
    private String descricao;

    @Column(nullable = false)
    private int valor;

    // Construtores, getters e setters
}

