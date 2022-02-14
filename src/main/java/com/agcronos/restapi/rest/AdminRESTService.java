package com.agcronos.restapi.rest;

import java.util.List;

import com.agcronos.restapi.database.repositoryAdmin;
import com.agcronos.restapi.model.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminRESTService {

  @Autowired
  private repositoryAdmin repositorioAdmin;

  @GetMapping
  public List<Admin>listar(){
    return repositorioAdmin.findAll();
  }

  @PostMapping
  public void salvar(@RequestBody Admin admin){
    repositorioAdmin.save(admin);
  }

  @PutMapping
  public void alterar(@RequestBody Admin admin){
    if(admin.getId()> 0)
    repositorioAdmin.save(admin);
  }

  @DeleteMapping
  public void deletar(@RequestBody Admin admin){
    repositorioAdmin.delete(admin);
  }
 
}
