/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxclientei;

import com.google.gson.Gson;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import modelo.ConexionServiciosWeb;
import pojos.Respuesta;
import utilidades.Constantes;

/**
 * FXML Controller class
 *
 * @author kfgf1
 */
public class FXMLFormularioAlumnoController implements Initializable {

  @FXML
  private TextField tfMatricula;
  @FXML
  private TextField tfNombre;
  @FXML
  private TextField tfApellidos;
  @FXML
  private TextField tfEdad;
  @FXML
  private Button btnGuardarDatos;

  /**
   * Initializes the controller class.
   */
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    // TODO
  }  

  @FXML
  private void clickGuardarDatos(ActionEvent event) {
    String matricula = tfMatricula.getText();
    String nombre = tfNombre.getText();
    String apellidos = tfApellidos.getText();
    String edad = tfEdad.getText();
    
    guardarAlumnoWS(matricula, nombre, apellidos, edad);
  }
  
  private void guardarAlumnoWS(String matricula, String nombre, String apellidos, String edad){
    String url = Constantes.URL_BASE+"alumnos/registrar";
    String parametros = "matricula="+matricula+"&nombre="+nombre+"&apellidos="+apellidos+"&edad="+edad;
    try {
      String resultado = ConexionServiciosWeb.consumirServiciosPOST(url, parametros);
      Gson gson = new Gson();
      Respuesta respuestaWS = gson.fromJson(resultado, Respuesta.class);
      String info = "Matricula alumno: "+ respuestaWS.getAlumno().getMatricula()
              +"\nNombre: "+respuestaWS.getAlumno().getNombre()
              +"\nApellidos: "+respuestaWS.getAlumno().getApellidos()
              +"\nEdad: "+respuestaWS.getAlumno().getEdad();
      mostrarAlerta("Resultado WS", info);
    } catch (Exception e) {
      mostrarAlerta("ERROR", "Error en peticón POST: "+e.getMessage());
    }
  }
  
  private void mostrarAlerta(String titulo, String mensaje){
    Alert dialogoAlerta = new Alert(Alert.AlertType.INFORMATION);
    dialogoAlerta.setContentText(mensaje);
    dialogoAlerta.setHeaderText("Hola");
    dialogoAlerta.showAndWait();
  }

   
}
