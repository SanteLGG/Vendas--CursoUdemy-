package com.github.com.santelgg.vendas.domain.entity;

import com.sun.istack.NotNull;
import javax.persistence.*;

@Entity
@Table(name = "CLIENTE", schema = "vendas")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOME")
    private String nome;

    //getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
