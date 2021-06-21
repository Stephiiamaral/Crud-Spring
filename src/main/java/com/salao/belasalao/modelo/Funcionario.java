package com.salao.belasalao.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Funcionario {

    @Id
    private Integer id;

    @Column(name="nome_funcionario")
    private String nomeFuncionario;

    private String cargo;

    @Column(name = "hora_trabalho")
    private String horaTrabalho;

    public Funcionario() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getHoraTrabalho() {
        return horaTrabalho;
    }

    public void setHoraTrabalho(String horaTrabalho) {
        this.horaTrabalho = horaTrabalho;
    }

    public Funcionario(Integer id, String nomeFuncionario, String cargo, String horaTrabalho) {
        this.id = id;
        this.nomeFuncionario = nomeFuncionario;
        this.cargo = cargo;
        this.horaTrabalho = horaTrabalho;
    }
}
