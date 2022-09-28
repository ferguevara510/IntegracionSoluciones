/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxclientei;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author kfgf1
 */
public class FXMLInicioController implements Initializable {
    
    @FXML
    private Label lbResultado;
    @FXML
    private TextField tfMatricula;
    @FXML
    private Button btnBuscar;
    
    @FXML
    private void clickBuscarMatricula(ActionEvent event) {
      String matricula = tfMatricula.getText();
      if(!matricula.isEmpty() && matricula.length() == 9){
        consultarAlumnoWS(matricula);
      }else{
        mostrarAlerta("Campo incorrecto", "El formato de la matricula es incorrecto, favr de verificar");
      }
    }
    
    private void consultarAlumnoWS(String matricula){
      String url = "";
      try {
        
      } catch (Exception e) {
      }
    }
    
    private void mostrarAlerta(String titulo, String mensaje){
      Alert dialogoAlerta = new Alert(Alert.AlertType.INFORMATION);
      dialogoAlerta.setContentText(mensaje);
      dialogoAlerta.setHeaderText("Hola");
      dialogoAlerta.showAndWait();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
