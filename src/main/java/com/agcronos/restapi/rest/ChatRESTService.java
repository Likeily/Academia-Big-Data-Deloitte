package com.agcronos.restapi.rest;

import java.util.List;

import com.agcronos.restapi.database.repositoryChat;
import com.agcronos.restapi.model.Chat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chat")
public class ChatRESTService {
  
  @Autowired
  private repositoryChat repositoryChat;
  
  @GetMapping
  public List<Chat>listar(){
    return repositoryChat.findAll();
  }

  @PostMapping
  public void salvar(@RequestBody Chat chat){
    repositoryChat.save(chat);
  }

  @PutMapping
  public void alterar(@RequestBody Chat chat){
    if(chat.getId()> 0)
    repositoryChat.save(chat);
  }

  @DeleteMapping
  public void deletar(@RequestBody Chat chat){
    repositoryChat.delete(chat);
  }

}
