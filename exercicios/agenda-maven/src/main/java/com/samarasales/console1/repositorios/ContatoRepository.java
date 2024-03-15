package com.samarasales.console1.repositorios;

import com.samarasales.console1.entidades.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Long> {
}
