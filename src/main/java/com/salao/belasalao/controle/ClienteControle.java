package com.salao.belasalao.controle;

import com.salao.belasalao.modelo.Cliente;
import com.salao.belasalao.servico.ClienteServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteControle {

    @Autowired
    private ClienteServico clienteServico;

    @GetMapping
    public List<Cliente> buscarTodos(){
        return clienteServico.buscarTodos();
    }

}
