package com.salao.belasalao.controle;

import com.salao.belasalao.modelo.Atendimento;
import com.salao.belasalao.servico.AtendimentoServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/atendimento")
public class AtendimentoControle {


    @Autowired
    private AtendimentoServico atendimentoServico;

    @GetMapping
    public List<Atendimento> buscarTodos(){
        return atendimentoServico.buscarTodos();
    }

    @PostMapping
    public Atendimento salvar(@RequestBody Atendimento atendimento) {
        return atendimentoServico.salvar(atendimento);
    }

    @GetMapping("/{id}")
    public Atendimento buscarId(@PathVariable Integer id){
        return atendimentoServico.buscarId(id);
    }

    @PutMapping("/{id}")
    public Atendimento editar(@PathVariable Integer id, @RequestBody Atendimento atendimento){
        return atendimentoServico.alterar(id, atendimento);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Integer id){
        atendimentoServico.excluir(id);
    }
}
