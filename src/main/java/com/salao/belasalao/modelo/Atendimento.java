package com.salao.belasalao.modelo;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table
public class Atendimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="nome_cliente")
    private String nomeCliente;

    @Column(name="apelido_cliente")
    private String apelidoCliente;

    @Column(name="data_atendimento")
    private LocalDate dataAtendimento;

    @Column(name="horario_atendimento")
    private LocalTime horarioAtendimento;

    @Column(name="nome_funcionario")
    private String nomeFuncionario;

    @Column(name="nome_servico")
    private String nomeServico;

    @Column(name="valor_servico")
    private String valorServico;

    public Atendimento() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getApelidoCliente() {
        return apelidoCliente;
    }

    public void setApelidoCliente(String apelidoCliente) {
        this.apelidoCliente = apelidoCliente;
    }

    public LocalDate getDataAtendimento() {
        return dataAtendimento;
    }

    public void setDataAtendimento(LocalDate dataAtendimento) {
        this.dataAtendimento = dataAtendimento;
    }

    public LocalTime getHorarioAtendimento() {
        return horarioAtendimento;
    }

    public void setHorarioAtendimento(LocalTime horarioAtendimento) {
        this.horarioAtendimento = horarioAtendimento;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getValorServico() {
        return valorServico;
    }

    public void setValorServico(String valorServico) {
        this.valorServico = valorServico;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public Atendimento(Integer id, String nomeCliente, String apelidoCliente, LocalDate dataAtendimento, LocalTime horarioAtendimento, String nomeFuncionario, String nomeServico, String valorServico) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.apelidoCliente = apelidoCliente;
        this.dataAtendimento = dataAtendimento;
        this.horarioAtendimento = horarioAtendimento;
        this.nomeFuncionario = nomeFuncionario;
        this.nomeServico = nomeServico;
        this.valorServico = valorServico;
    }
}

