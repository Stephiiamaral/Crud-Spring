package com.salao.belasalao.servico;

import com.salao.belasalao.modelo.Cliente;
import com.salao.belasalao.repositorio.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServico {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    public List<Cliente> buscarTodos() {
        return clienteRepositorio.findAll();
    }

}
