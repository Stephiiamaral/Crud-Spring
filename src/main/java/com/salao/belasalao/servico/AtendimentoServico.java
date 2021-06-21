package com.salao.belasalao.servico;

import com.salao.belasalao.exception.NegocioException;
import com.salao.belasalao.modelo.Atendimento;
import com.salao.belasalao.repositorio.AtendimentoRepositorio;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class AtendimentoServico {

    @Autowired
    private AtendimentoRepositorio atendimentoRepositorio;

    @Autowired
    private MapperFacade mapperFacade;

    public List<Atendimento> buscarTodos() {
        return atendimentoRepositorio.findAll();
    }

    public Atendimento salvar(Atendimento atendimento) {
       return atendimentoRepositorio.save(atendimento);
    }

    @Transactional
    public Atendimento buscarId(Integer id){
        return atendimentoRepositorio.findById(id).orElseThrow(() -> new NegocioException("Not found entity"));
    }

    public void excluir(Integer id){
        atendimentoRepositorio.deleteById(id);
    }

    @Transactional
    public Atendimento alterar(Integer id, Atendimento atendimento) {
        Atendimento atendimentoBanco = atendimentoRepositorio.findById(id)
                .orElseThrow(()-> new NegocioException("Atendimento não encontrado."));
        mapperFacade.map(atendimento, atendimentoBanco);
        atendimentoRepositorio.save(atendimentoBanco);

        return atendimentoBanco;
    }
}