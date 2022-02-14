package com.agcronos.restapi.database;

import com.agcronos.restapi.model.Admin;

import org.springframework.data.jpa.repository.JpaRepository;

public interface repositoryAdmin extends JpaRepository<Admin, Long>{
  
}
