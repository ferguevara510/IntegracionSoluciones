/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;
import modelo.enums.GeneroEnum;
import modelo.enums.RolEnum;

/**
 *
 * @author kfgf1
 */
public class Medico {
  
  private String nombreMedico;
  private String apellidosMedico;
  private Date fechaNacMedico;
  private GeneroEnum generoMedico;
  private String domicilioMedico;
  private String numPersonal;
  private String numCedulaProfesional;
  private String contraseñaMedico;
  private RolEnum rol;
  //private String fotografía;

  public Medico() {
  }

  public Medico(String nombreMedico, String apellidosMedico, Date fechaNacMedico, GeneroEnum generoMedico, String domicilioMedico, String numPersonal, String numCedulaProfesional, String contraseñaMedico, RolEnum rol) {
    this.nombreMedico = nombreMedico;
    this.apellidosMedico = apellidosMedico;
    this.fechaNacMedico = fechaNacMedico;
    this.generoMedico = generoMedico;
    this.domicilioMedico = domicilioMedico;
    this.numPersonal = numPersonal;
    this.numCedulaProfesional = numCedulaProfesional;
    this.contraseñaMedico = contraseñaMedico;
    this.rol = rol;
  }

  public String getNombreMedico() {
    return nombreMedico;
  }

  public void setNombreMedico(String nombreMedico) {
    this.nombreMedico = nombreMedico;
  }

  public String getApellidosMedico() {
    return apellidosMedico;
  }

  public void setApellidosMedico(String apellidosMedico) {
    this.apellidosMedico = apellidosMedico;
  }

  public Date getFechaNacMedico() {
    return fechaNacMedico;
  }

  public void setFechaNacMedico(Date fechaNacMedico) {
    this.fechaNacMedico = fechaNacMedico;
  }

  public GeneroEnum getGeneroMedico() {
    return generoMedico;
  }

  public void setGeneroMedico(GeneroEnum generoMedico) {
    this.generoMedico = generoMedico;
  }

  public String getDomicilioMedico() {
    return domicilioMedico;
  }

  public void setDomicilioMedico(String domicilioMedico) {
    this.domicilioMedico = domicilioMedico;
  }

  public String getNumPersonal() {
    return numPersonal;
  }

  public void setNumPersonal(String numPersonal) {
    this.numPersonal = numPersonal;
  }

  public String getNumCedulaProfesional() {
    return numCedulaProfesional;
  }

  public void setNumCedulaProfesional(String numCedulaProfesional) {
    this.numCedulaProfesional = numCedulaProfesional;
  }

  public String getContraseñaMedico() {
    return contraseñaMedico;
  }

  public void setContraseñaMedico(String contraseñaMedico) {
    this.contraseñaMedico = contraseñaMedico;
  }

  public RolEnum getRol() {
    return rol;
  }

  public void setRol(RolEnum rol) {
    this.rol = rol;
  }

  @Override
  public String toString() {
    return "Medico{" + "nombreMedico=" + nombreMedico + ", apellidosMedico=" + apellidosMedico + ", fechaNacMedico=" + fechaNacMedico + ", generoMedico=" + generoMedico + ", domicilioMedico=" + domicilioMedico + ", numPersonal=" + numPersonal + ", numCedulaProfesional=" + numCedulaProfesional + ", contrase\u00f1aMedico=" + contraseñaMedico + ", rol=" + rol + '}';
  }
  
}
