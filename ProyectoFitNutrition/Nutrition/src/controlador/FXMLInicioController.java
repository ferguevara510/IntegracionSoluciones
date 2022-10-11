/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import modelo.ConexionServiciosWeb;
import pojos.RespuestaLogin;
import util.Constantes;
import util.Utilidades;

/**
 * FXML Controller class
 *
 * @author kfgf1
 */
public class FXMLInicioController implements Initializable {

  @FXML
  private Button iniciarSesionBtn;
  @FXML
  private TextField usuarioTf;
  @FXML
  private PasswordField contraseñaPf;

  /**
   * Initializes the controller class.
   */
  @FXML
    public void login() {
        //System.out.println("NP: "+textFieldNumeroP.getText());
        String noPersonal = usuarioTf.getText();
        String clave = contraseñaPf.getText();
        if (!noPersonal.equals("") && !clave.equals("")) {
            verificarInicioSesion(noPersonal, clave);
        } else {
            Utilidades.mostrarAlertaSimple(
                    "No se apendeje",
                    "Es necesario llenar ambos campos.",
                    Alert.AlertType.WARNING);
        }
    }
    
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    // TODO
  }  

  private void verificarInicioSesion(String noPersonal, String clave){
        try {
            String url = Constantes.URL_BASE + "acceso/escritorio";
            String parametros = "noPersonal=" + noPersonal + "&clave=" + clave;
            String resultado
                    = ConexionServiciosWeb.consumirServicioPOST(url, parametros);
            Gson gson = new Gson();
            RespuestaLogin respuestaLogin
                    = gson.fromJson(resultado, RespuestaLogin.class);
            //System.out.println(respuestaLogin.getError());
            if (!respuestaLogin.getError()) {
                try {
                    Parent root = FXMLLoader.load(getClass().
                            getResource("/vista/FXMLPrincipal.fxml"));
                    Stage escenario = new Stage();
                    Scene sceneFormulario = new Scene(root);
                    escenario.setScene(sceneFormulario);
                    escenario.showAndWait();
                    
                } catch (IOException ex) {
                    Utilidades.mostrarAlertaSimple(
                            "Error",
                            ex.getMessage(),
                            Alert.AlertType.ERROR);
                }
            } else {
                Utilidades.mostrarAlertaSimple(
                        "Alto ahí.",
                        "Acceso incorrecto.",
                        Alert.AlertType.ERROR);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


  @FXML
  private void clickiniciarSesion() {
    String noPersonal = usuarioTf.getText();
        String clave = contraseñaPf.getText();
        if (!noPersonal.equals("") && !clave.equals("")) {
            verificarInicioSesion(noPersonal, clave);
        } else {
            Utilidades.mostrarAlertaSimple(
                    "No se apendeje",
                    "Es necesario llenar ambos campos.",
                    Alert.AlertType.WARNING);
        }
  }
  
  private void irPantallaPrincipal(){
    try {
      Parent vistaPrincipal = FXMLLoader.load(getClass().getResource("/vista/FXMLPrincipal.fxml"));
      Scene escenaPrincipal = new Scene(vistaPrincipal);
      Stage escenarioBase = (Stage) usuarioTf.getScene().getWindow();
      escenarioBase.setScene(escenaPrincipal);
      escenarioBase.show();
    } catch (Exception ex) {
      Utilidades.mostrarAlertaSimple("Error", "Error al mostrar la pantalla principal", Alert.AlertType.ERROR);
    }
  }
  
}
