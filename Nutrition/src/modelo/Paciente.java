/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;
import modelo.enums.GeneroEnum;

/**
 *
 * @author kfgf1
 */
public class Paciente {
  
  private String nombrePaciente;
  private String apellidosPaciente;
  private Date fechaNacPaciente;
  private GeneroEnum generoPaciente;
  private float peso;
  private float estatura;
  private float tallaInicial;
  private String email;
  private String telefono;
  private String domicilioPaciente;
  private String usuario;
  private String contraseñaPaciente;
  private Medico medico;

  public Paciente() {
  }

  public Paciente(String nombrePaciente, String apellidosPaciente, Date fechaNacPaciente, GeneroEnum generoPaciente, float peso, float estatura, float tallaInicial, String email, String telefono, String domicilioPaciente, String usuario, String contraseñaPaciente, Medico medico) {
    this.nombrePaciente = nombrePaciente;
    this.apellidosPaciente = apellidosPaciente;
    this.fechaNacPaciente = fechaNacPaciente;
    this.generoPaciente = generoPaciente;
    this.peso = peso;
    this.estatura = estatura;
    this.tallaInicial = tallaInicial;
    this.email = email;
    this.telefono = telefono;
    this.domicilioPaciente = domicilioPaciente;
    this.usuario = usuario;
    this.contraseñaPaciente = contraseñaPaciente;
    this.medico = medico;
  }

  public String getNombrePaciente() {
    return nombrePaciente;
  }

  public void setNombrePaciente(String nombrePaciente) {
    this.nombrePaciente = nombrePaciente;
  }

  public String getApellidosPaciente() {
    return apellidosPaciente;
  }

  public void setApellidosPaciente(String apellidosPaciente) {
    this.apellidosPaciente = apellidosPaciente;
  }

  public Date getFechaNacPaciente() {
    return fechaNacPaciente;
  }

  public void setFechaNacPaciente(Date fechaNacPaciente) {
    this.fechaNacPaciente = fechaNacPaciente;
  }

  public GeneroEnum getGeneroPaciente() {
    return generoPaciente;
  }

  public void setGeneroPaciente(GeneroEnum generoPaciente) {
    this.generoPaciente = generoPaciente;
  }

  public float getPeso() {
    return peso;
  }

  public void setPeso(float peso) {
    this.peso = peso;
  }

  public float getEstatura() {
    return estatura;
  }

  public void setEstatura(float estatura) {
    this.estatura = estatura;
  }

  public float getTallaInicial() {
    return tallaInicial;
  }

  public void setTallaInicial(float tallaInicial) {
    this.tallaInicial = tallaInicial;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getDomicilioPaciente() {
    return domicilioPaciente;
  }

  public void setDomicilioPaciente(String domicilioPaciente) {
    this.domicilioPaciente = domicilioPaciente;
  }

  public String getUsuario() {
    return usuario;
  }

  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  public String getContraseñaPaciente() {
    return contraseñaPaciente;
  }

  public void setContraseñaPaciente(String contraseñaPaciente) {
    this.contraseñaPaciente = contraseñaPaciente;
  }

  public Medico getMedico() {
    return medico;
  }

  public void setMedico(Medico medico) {
    this.medico = medico;
  }

  @Override
  public String toString() {
    return "Paciente{" + "nombrePaciente=" + nombrePaciente + ", apellidosPaciente=" + apellidosPaciente + ", fechaNacPaciente=" + fechaNacPaciente + ", generoPaciente=" + generoPaciente + ", peso=" + peso + ", estatura=" + estatura + ", tallaInicial=" + tallaInicial + ", email=" + email + ", telefono=" + telefono + ", domicilioPaciente=" + domicilioPaciente + ", usuario=" + usuario + ", contrase\u00f1aPaciente=" + contraseñaPaciente + ", medico=" + medico + '}';
  }
  
}
