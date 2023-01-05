package com.github.com.santelgg.vendas.service;

import ch.qos.logback.core.net.server.Client;
import com.github.com.santelgg.vendas.model.Cliente;
import com.github.com.santelgg.vendas.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 *   Classe que possui:
 *      - Regras de negócios;
 *      - Validações;
 *      - Gera os relatórios;
 *      - Possui o objeto que acessa a base de dados.
 */

@Service
public class ClientesService {

    @Autowired
    private ClientesRepository repository;

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        this.repository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente){
        //aplica validações
    }
}
