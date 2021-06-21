package com.salao.belasalao.controle;

import com.salao.belasalao.modelo.Gerente;
import com.salao.belasalao.servico.GerenteServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("gerente")
public class GerenteControle {

    @Autowired
    private GerenteServico gerenteServico;

    @GetMapping
    public Gerente buscarGerente() {
        return gerenteServico.buscarGerente();
    }

}
