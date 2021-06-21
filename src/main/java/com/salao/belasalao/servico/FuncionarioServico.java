package com.salao.belasalao.servico;

import com.salao.belasalao.modelo.Cliente;
import com.salao.belasalao.modelo.Funcionario;
import com.salao.belasalao.repositorio.FuncionarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioServico {

    @Autowired
    private FuncionarioRepositorio funcionarioRepositorio;

    public List<Funcionario> buscarTodos() {
        return funcionarioRepositorio.findAll();
    }

}
