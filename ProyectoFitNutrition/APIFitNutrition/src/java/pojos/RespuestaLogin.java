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
public class RespuestaLogin {
  
  private Boolean error;
  private String mensaje;
  private String nombres;
  private String apellidoP;
  private String apellidoM;
  private String token;

  public RespuestaLogin() {
  }

  public RespuestaLogin(Boolean error, String mensaje, String nombres, String apellidoP, String apellidoM, String token) {
    this.error = error;
    this.mensaje = mensaje;
    this.nombres = nombres;
    this.apellidoP = apellidoP;
    this.apellidoM = apellidoM;
    this.token = token;
  }

  public Boolean getError() {
    return error;
  }

  public void setError(Boolean error) {
    this.error = error;
  }

  public String getMensaje() {
    return mensaje;
  }

  public void setMensaje(String mensaje) {
    this.mensaje = mensaje;
  }

  public String getNombres() {
    return nombres;
  }

  public void setNombres(String nombres) {
    this.nombres = nombres;
  }

  public String getApellidoP() {
    return apellidoP;
  }

  public void setApellidoP(String apellidoP) {
    this.apellidoP = apellidoP;
  }

  public String getApellidoM() {
    return apellidoM;
  }

  public void setApellidoM(String apellidoM) {
    this.apellidoM = apellidoM;
  }

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }
  
}
