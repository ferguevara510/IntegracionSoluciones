/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import pojo.Alumno;
import pojo.Respuesta;

/**
 * REST Web Service
 *
 * @author kfgf1
 */
@Path("alumnos")
public class AlumnosWS {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of AlumnoWS
     */
    public AlumnosWS() {
    }

    /**
     * Retrieves representation of an instance of ws.AlumnoWS
     * @return an instance of java.lang.String
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        return "Hola mundo! Desde mi servicio en Java";        
    }

    /**
     * PUT method for updating or creating an instance of AlumnoWS
     * @param content representation for the resource
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
    */
    
    //la anotaciones es para darle información adicional al copilador de como tratar el sistema
    @Path("all") //ruta
    @GET //tipo de petición, los parametros viajan sobre el cuerpo 
    @Produces(MediaType.APPLICATION_JSON) //cómo se regresa(recuperar) la información el servicio 
    public List<Alumno> obtenerTodos(){
        List<Alumno> alumnos = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            Alumno alum = new Alumno();
            alum.setMatricula("s03298932"+i);
            alum.setNombre("Prueba"+i);
            alum.setApellidos("Apellidos"+i);
            alum.setEdad(i);
            alumnos.add(alum);
        }
        return alumnos;
    }
    
    //orden de las anotaciones no importa
    @Path("alumnobymatricula/{matricula}") //no se recomienda diagonales, se utiliza aquí la diagonal para mandar parámetro
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Alumno obtenerAlumno(@PathParam("matricula") String matricula){//el valor de 
            //PathParam debe ser igual al Path, no es necesario el valor que se manda sea igual al de los Path
        Alumno alumno = new Alumno();
        alumno.setMatricula(matricula);
        alumno.setNombre("Juanita");
        alumno.setApellidos("Perez Sanchez");
        alumno.setEdad(22);
        return alumno;
    }
    
    @Path("alumnodatos/{matricula},{nombre},{apellidos},{edad}") 
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Alumno obtenerAlumnoDatos(@PathParam("matricula") String matricula, @PathParam("nombre") String nombre, 
            @PathParam("apellidos") String apellidos, @PathParam("edad") Integer edad){
        Alumno alumno = new Alumno();
        alumno.setMatricula(matricula);
        alumno.setNombre(nombre);
        alumno.setApellidos(apellidos);
        alumno.setEdad(edad);
        return alumno;
    }
    
    @Path("registrar")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Respuesta registrar(@FormParam("matricula") String matricula, @FormParam("nombre") String nombre, @FormParam("apellidos") 
            String apellidos, @FormParam("edad") Integer edad){
        Respuesta respuesta = new Respuesta();
        Alumno alumno = new Alumno();
        
        alumno.setMatricula(matricula);
        alumno.setNombre(nombre);
        alumno.setApellidos(apellidos);
        alumno.setEdad(edad);
        
        respuesta.setError(false);
        respuesta.setMensaje("Alumno agregado correctamente...");
        respuesta.setAlumno(alumno);
        
        return respuesta;
    }
    
    //Tarea: Método PUT no debe modificar la matricula devolviendo datos y DELETE ingresa la matricula para eliminar devolver datos
    @Path("modificar/{matricula}")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Respuesta modificar (@FormParam("matricula") String matricula, @FormParam("nombre") String nombre, @FormParam("apellidos") 
            String apellidos, @FormParam("edad") Integer edad){
        Respuesta respuesta = new Respuesta();
        Alumno alumno = new Alumno();
        
        alumno.setMatricula(matricula);
        alumno.setNombre(nombre);
        alumno.setApellidos(apellidos);
        alumno.setEdad(edad);
                
        respuesta.setError(false);
        respuesta.setMensaje("Alumno modificado correctamente...");
        respuesta.setAlumno(alumno);
        
        return respuesta;
    }
    
    @Path("eliminar/{matricula}")
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public Respuesta eliminar (@PathParam("matricula") String matricula){
        Respuesta respuesta = new Respuesta();
        Alumno alumno = new Alumno();
        
        alumno.setMatricula(matricula);
        
        respuesta.setError(false);
        respuesta.setMensaje("Alumno eliminado correctamente...");
        respuesta.setAlumno(alumno);
        
        return respuesta;
    }
}