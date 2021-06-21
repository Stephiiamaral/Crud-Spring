package com.salao.belasalao.servico;

import com.salao.belasalao.exception.NegocioException;
import com.salao.belasalao.modelo.Cliente;
import com.salao.belasalao.modelo.Gerente;
import com.salao.belasalao.repositorio.GerenteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GerenteServico {

    @Autowired
    private GerenteRepositorio gerenteRepositorio;
    private static final Integer ID_GERENTE = 1;

    public Gerente buscarGerente() {
        return gerenteRepositorio.findById(ID_GERENTE).orElseThrow(() -> new NegocioException("Não pode haver mais de um gerente."));
    }
}
