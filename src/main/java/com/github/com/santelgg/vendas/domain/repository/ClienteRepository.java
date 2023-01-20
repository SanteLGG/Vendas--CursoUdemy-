package com.github.com.santelgg.vendas.domain.repository;

import com.github.com.santelgg.vendas.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
