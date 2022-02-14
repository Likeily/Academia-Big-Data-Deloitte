package com.agcronos.restapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Servicos {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String tipoServico;

  @Column(nullable = false)
  private String ordemServico;

  private String responsavel;

  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String getTipoServico() {
    return tipoServico;
  }
  public void setTipoServico(String tipoServico) {
    this.tipoServico = tipoServico;
  }
  public String getOrdemServico() {
    return ordemServico;
  }
  public void setOrdemServico(String ordemServico) {
    this.ordemServico = ordemServico;
  }
  public String getResponsavel() {
    return responsavel;
  }
  public void setResponsavel(String responsavel) {
    this.responsavel = responsavel;
  }
  
}
