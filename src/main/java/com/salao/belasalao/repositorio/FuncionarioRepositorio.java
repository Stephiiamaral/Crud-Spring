package com.salao.belasalao.repositorio;

import com.salao.belasalao.modelo.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepositorio extends JpaRepository<Funcionario, Integer> {
}
