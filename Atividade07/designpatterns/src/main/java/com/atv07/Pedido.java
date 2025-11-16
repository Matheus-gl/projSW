package com.atv07;

import java.util.Date;
import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    public Date dataCriacao = new Date();

    @ElementCollection
    public List<String> itens;

    @Enumerated(EnumType.STRING)
    public TipoPedido tipoPedido;
}
