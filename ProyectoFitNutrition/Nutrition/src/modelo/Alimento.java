/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import modelo.enums.PorcionEnum;

/**
 *
 * @author kfgf1
 */
public class Alimento {
  
  private String nombreAlimento;
  private float calorias;
  private float cantidad;
  private PorcionEnum porcion;

  public Alimento() {
  }

  public Alimento(String nombreAlimento, float calorias, float cantidad, PorcionEnum porcion) {
    this.nombreAlimento = nombreAlimento;
    this.calorias = calorias;
    this.cantidad = cantidad;
    this.porcion = porcion;
  }

  public String getNombreAlimento() {
    return nombreAlimento;
  }

  public void setNombreAlimento(String nombreAlimento) {
    this.nombreAlimento = nombreAlimento;
  }

  public float getCalorias() {
    return calorias;
  }

  public void setCalorias(float calorias) {
    this.calorias = calorias;
  }

  public float getCantidad() {
    return cantidad;
  }

  public void setCantidad(float cantidad) {
    this.cantidad = cantidad;
  }

  public PorcionEnum getPorcion() {
    return porcion;
  }

  public void setPorcion(PorcionEnum porcion) {
    this.porcion = porcion;
  }

  @Override
  public String toString() {
    return "Alimento{" + "nombreAli=" + nombreAlimento + ", calorias=" + calorias + ", cantidad=" + cantidad + ", porcion=" + porcion + '}';
  }
  
}
