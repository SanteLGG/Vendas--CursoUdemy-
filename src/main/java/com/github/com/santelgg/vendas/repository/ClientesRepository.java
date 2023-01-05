package com.github.com.santelgg.vendas.repository;

import com.github.com.santelgg.vendas.model.Cliente;
import org.springframework.stereotype.Repository;

/*
 *   Classe que possui:
 *      - Objeto que acessa a base de dados;
 *      - Realiza alteraçãoes na base de dados.
 */

@Repository
public class ClientesRepository {

    public void persistir(Cliente cliente) {
        //acessar a base e salvar o cliente
    }
}
