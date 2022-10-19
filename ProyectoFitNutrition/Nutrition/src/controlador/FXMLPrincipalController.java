/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

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
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;
import util.Utilidades;

/**
 * FXML Controller class
 *
 * @author kfgf1
 */
public class FXMLPrincipalController implements Initializable {

  @FXML
  private Button pacientesBtn;
  @FXML
  private Button alimentosBtn;
  @FXML
  private Button medicosBtn;
  @FXML
  private Button cerrarSesionBtn;

  /**
   * Initializes the controller class.
   */
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    // TODO
  }  

  @FXML
  private void consultarPacientes(ActionEvent event) {
    try {
      Parent vistaPacientes = FXMLLoader.load(getClass().getResource("/vista/FXMLConsultarPacientes.fxml"));
      Scene escenaPrincipal = new Scene(vistaPacientes);
      Stage escenarioPacientes = new Stage();
      escenarioPacientes.setScene(escenaPrincipal);
      escenarioPacientes.initModality(Modality.APPLICATION_MODAL);
      escenarioPacientes.showAndWait();
      escenarioPacientes.setResizable(false);
      escenarioPacientes.setTitle("ConsultarPacientes");
      escenarioPacientes.getIcons().add(new Image("/vista/img/icono.png"));
    } catch (Exception ex) {
      Utilidades.mostrarAlertaSimple("Error", "Error al mostrar la consultar pacientes", Alert.AlertType.ERROR);
    }
  }

  @FXML
  private void consultarAlimentos(ActionEvent event) {
    try {
      Parent vistaAlimentos = FXMLLoader.load(getClass().getResource("/vista/FXMLConsultarAlimentos.fxml"));
      Scene escenaPrincipal = new Scene(vistaAlimentos);
      Stage escenarioAlimentos = new Stage();
      escenarioAlimentos.setScene(escenaPrincipal);
      escenarioAlimentos.initModality(Modality.APPLICATION_MODAL);
      escenarioAlimentos.showAndWait();
      escenarioAlimentos.setResizable(false);
      escenarioAlimentos.setTitle("ConsultarAlimentos");
      escenarioAlimentos.getIcons().add(new Image("/vista/img/icono.png"));
    } catch (Exception ex) {
      Utilidades.mostrarAlertaSimple("Error", "Error al mostrar la consultar alimentos", Alert.AlertType.ERROR);
    }
  }

  @FXML
  private void consultarMedicos(ActionEvent event) {
    try {
      Parent vistaMedicos = FXMLLoader.load(getClass().getResource("/vista/FXMLConsultarMedicos.fxml"));
      Scene escenaPrincipal = new Scene(vistaMedicos);
      Stage escenarioMedicos= new Stage();
      escenarioMedicos.setScene(escenaPrincipal);
      escenarioMedicos.initModality(Modality.APPLICATION_MODAL);
      escenarioMedicos.showAndWait();
      escenarioMedicos.setResizable(false);
      escenarioMedicos.setTitle("ConsultarMedicos");
      escenarioMedicos.getIcons().add(new Image("/vista/img/icono.png"));
    } catch (Exception ex) {
      Utilidades.mostrarAlertaSimple("Error", "Error al mostrar la consultar medicos", Alert.AlertType.ERROR);
    }
  }

  @FXML
  private void cerrarSesion(ActionEvent event) {
    try {
      Parent vistaPrincipal = FXMLLoader.load(getClass().getResource("/vista/FXMLInicio.fxml"));
      Scene escenaPrincipal = new Scene(vistaPrincipal);
      Stage escenarioBase = (Stage) cerrarSesionBtn.getScene().getWindow();
      escenarioBase.setScene(escenaPrincipal);
      escenarioBase.setTitle("IniciarSesion");
      escenarioBase.show();
      escenarioBase.setResizable(false);
      escenarioBase.getIcons().add(new Image("/vista/img/icono.png"));
    } catch (Exception ex) {
      Utilidades.mostrarAlertaSimple("Error", "Error al mostrar la pantalla principal", Alert.AlertType.ERROR);
    }
  }
  
}
