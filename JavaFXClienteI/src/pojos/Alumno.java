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
public class Alumno {
  
  private String matricula;
  private String nombre;
  private String apellidos;
  private Integer edad;

  public Alumno() {
  }

  public Alumno(String matricula, String nombre, String apellidos, Integer edad) {
    this.matricula = matricula;
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.edad = edad;
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public Integer getEdad() {
    return edad;
  }

  public void setEdad(Integer edad) {
    this.edad = edad;
  }

}
