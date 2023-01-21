package com.github.com.santelgg.vendas.domain.repository;

import com.github.com.santelgg.vendas.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
