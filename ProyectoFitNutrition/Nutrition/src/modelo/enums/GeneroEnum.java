/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.enums;

/**
 *
 * @author kfgf1
 */
public enum GeneroEnum {
  
  FEMENINO("Femenino"),
  MASCULINO("Masculino");
  
  private String genero;

  GeneroEnum(String genero) {
    this.genero = genero;
  }

  @Override
  public String toString() {
    return genero;
  }
  
}
