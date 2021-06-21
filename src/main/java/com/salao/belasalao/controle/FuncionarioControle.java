package com.salao.belasalao.controle;

import com.salao.belasalao.modelo.Cliente;
import com.salao.belasalao.modelo.Funcionario;
import com.salao.belasalao.servico.FuncionarioServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioControle {

    @Autowired
    private FuncionarioServico funcionarioServico;

    @GetMapping
    public List<Funcionario> buscarTodos(){
        return funcionarioServico.buscarTodos();
    }

}
