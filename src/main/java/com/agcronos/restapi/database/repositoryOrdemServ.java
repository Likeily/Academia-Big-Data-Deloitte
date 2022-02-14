package com.agcronos.restapi.database;

import com.agcronos.restapi.model.Servicos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface repositoryOrdemServ extends JpaRepository<Servicos, Long>{
  
}
