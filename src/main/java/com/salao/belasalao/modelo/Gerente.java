package com.salao.belasalao.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Gerente {
    @Id
    private Integer id;

    @Column(name = "nome_gerente")
    private String nomeGerente;

    public Gerente() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeGerente() {
        return nomeGerente;
    }

    public void setNomeGerente(String nomeGerente) {
        this.nomeGerente = nomeGerente;
    }

    public Gerente(Integer id, String nomeGerente) {
        this.id = id;
        this.nomeGerente = nomeGerente;
    }
}
