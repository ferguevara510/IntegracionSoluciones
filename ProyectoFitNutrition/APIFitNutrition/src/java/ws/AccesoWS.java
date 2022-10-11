/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;
import pojos.RespuestaLogin;

/**
 *
 * @author kfgf1
 */
@Path("acceso")
public class AccesoWS {
  
  @Context
  private UriInfo context;
  
  @Path("escritorio")
  @POST
  @Produces(MediaType.APPLICATION_JSON)
  public RespuestaLogin iniciarSesionEscritorio(@FormParam("noPersonal") String noPersonal,
          @FormParam("clave") String clave) {
    RespuestaLogin respuesta=new RespuestaLogin();
    
    if(noPersonal.equals("s1234") && clave.equals("00000")){
      respuesta.setError(false);
      respuesta.setMensaje("Correcto.");
      respuesta.setNombres("Omar");
      respuesta.setApellidoP("Alonso");
      respuesta.setApellidoM("Lizardi");
    }else{
      respuesta.setError(true);
      respuesta.setMensaje("Incorrecto.");
    }
    return respuesta;
  }
    
}
