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
public enum PorcionEnum {
  
  PIEZA("Pieza"),
  GRAMOS("Gramos"), 
  PORCIONES("Porciones"), 
  MILILITROS("Mililitros");
  
  private String porcion;

  PorcionEnum(String porcion) {
    this.porcion = porcion;
  }

  @Override
  public String toString() {
    return porcion;
  }
  
}
