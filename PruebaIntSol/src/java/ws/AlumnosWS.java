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
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import pojo.Alumno;

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
    
    @Path("all") //ruta
    @GET //tipo de petición
    @Produces(MediaType.APPLICATION_JSON) //cómo se regresa(recuperar) la información
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
}