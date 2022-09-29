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
public enum RolEnum {
  
  NUTRICIONISTA("Nutricionista"), 
  PRACTICANTE("Practicante"), 
  ADMINISTRADOR("Administrador");
  
  private String rol;

  RolEnum(String rol) {
    this.rol = rol;
  }

  @Override
  public String toString() {
    return rol;
  }
  
}
