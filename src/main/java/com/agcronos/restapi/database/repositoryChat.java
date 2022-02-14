package com.agcronos.restapi.database;

import com.agcronos.restapi.model.Chat;

import org.springframework.data.jpa.repository.JpaRepository;

public interface repositoryChat extends JpaRepository<Chat, Long>{
  
}
