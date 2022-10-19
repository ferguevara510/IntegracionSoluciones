/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import mybatis.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import pojos.Medico;

/**
 * REST Web Service
 *
 * @author kfgf1
 */
@Path("medicos")
public class MedicosWS {

  @Context
  private UriInfo context;

  public MedicosWS() {
  }
  
  @Path("all")
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public List<Medico> buscarTodos(){
    List<Medico> listaMedicos = null;
    SqlSession conexionBD = MyBatisUtil.getSession();
    if (conexionBD != null) {
      try {
        listaMedicos = conexionBD.selectList("medicos.getAllMedicos");
      } catch (Exception e) {
        e.printStackTrace();
      } finally{
        conexionBD.close();
      }
    }
    return listaMedicos;
  }
  
  @Path("byId/{id}")
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Medico buscarMedico(@PathParam("id") Integer idMedico){
    Medico medico = null;
    SqlSession conexionBD = MyBatisUtil.getSession();
    if (conexionBD != null) {
      try {
        medico = conexionBD.selectOne("medicos.getById", idMedico);
      } catch (Exception e) {
        e.printStackTrace();
      } finally{
        conexionBD.close();
      }
    }
    return medico;
  }

  @Path("registrar")
  @POST
  @Produces(MediaType.APPLICATION_JSON)
  public String registrar(@FormParam("noPersonal") String noPersonal,
          @FormParam("nombre") String nombre, @FormParam("apellidoPaterno") String apellidoP,
          @FormParam("apellidoMaterno") String apellidoM,
          @FormParam("fechaNacimiento") String fechaN, @FormParam("genero") String genero,
          @FormParam("domicilio") String domicilio, @FormParam("cedula") String cedula,
          @FormParam("clave") String clave, @FormParam("idRol") String idRol) {
    return "";
  }

  @Path("modificar")
  @PUT
  @Produces(MediaType.APPLICATION_JSON)
  public String modificar(@FormParam("idMedico") Integer idMedico,
          @FormParam("nombre") String nombre, @FormParam("apellidoPaterno") String apellidoP,
          @FormParam("apellidoMaterno") String apellidoM,
          @FormParam("fechaNacimiento") String fechaN, @FormParam("genero") String genero,
          @FormParam("domicilio") String domicilio, @FormParam("cedula") String cedula,
          @FormParam("clave") String clave, @FormParam("idRol") String idRol) {
    return "";
  }

  @Path("eliminar")
  @DELETE
  @Produces(MediaType.APPLICATION_JSON)
  public String eliminar(@FormParam("idMedico") Integer idMedico) {
    return "";
  }
  
}
