/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author kfgf1
 */
public class Respuesta {
    private Boolean error;
    private String mensaje;
    private Alumno alumno;

    public Respuesta() {
    }

    public Respuesta(Boolean error, String mensaje, Alumno alumno) {
        this.error = error;
        this.mensaje = mensaje;
        this.alumno = alumno;
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

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
}
