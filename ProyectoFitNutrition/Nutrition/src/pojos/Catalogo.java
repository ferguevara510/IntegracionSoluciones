/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

/**
 *
 * @author kfgf1
 */
public class Catalogo {
  
  private Integer idCatalogo;
  private String nombre;

  public Catalogo() {
  }

  public Catalogo(Integer idCatalogo, String nombre) {
    this.idCatalogo = idCatalogo;
    this.nombre = nombre;
  }

  public Integer getIdCatalogo() {
    return idCatalogo;
  }

  public void setIdCatalogo(Integer idCatalogo) {
    this.idCatalogo = idCatalogo;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public String toString() {
    return nombre;
  }
}
