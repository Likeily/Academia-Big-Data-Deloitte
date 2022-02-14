package com.agcronos.restapi.rest;

import java.util.List;

import com.agcronos.restapi.database.repositoryOrdemServ;
import com.agcronos.restapi.model.Servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/servicos")
public class OrdemServicosRESTService {

  @Autowired
  private repositoryOrdemServ repositoryOrdemServ;
  
  @GetMapping
  public List<Servicos>listar(){
    return repositoryOrdemServ.findAll();
  }

  @PostMapping
  public void salvar(@RequestBody Servicos ordemServ){
    repositoryOrdemServ.save(ordemServ);
  }

  @PutMapping
  public void alterar(@RequestBody Servicos ordemServ){
    if(ordemServ.getId()> 0)
    repositoryOrdemServ.save(ordemServ);
  }

  @DeleteMapping
  public void deletar(@RequestBody Servicos ordemServ){
    repositoryOrdemServ.delete(ordemServ);
  }

}
