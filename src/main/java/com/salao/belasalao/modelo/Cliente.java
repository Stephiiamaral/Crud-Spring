package com.salao.belasalao.modelo;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="nome_cliente")
    private String nomeCliente;

    @Column(name="apelido_cliente")
    private String apelidoCliente;

    @Column(name="data_nascimento")
    private Date dataNascimento;

    public Cliente() {
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

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    public Cliente(Integer id, String nomeCliente, String apelidoCliente, Date dataNascimento) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.apelidoCliente = apelidoCliente;
        this.dataNascimento = dataNascimento;
    }
}
