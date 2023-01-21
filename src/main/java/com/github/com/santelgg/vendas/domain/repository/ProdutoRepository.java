package com.github.com.santelgg.vendas.domain.repository;

import com.github.com.santelgg.vendas.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {


}
