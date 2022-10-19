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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;
import modelo.Paciente;
import util.Utilidades;

/**
 * FXML Controller class
 *
 * @author kfgf1
 */
public class FXMLConsultarPacientesController implements Initializable {

  @FXML
  private TableView<Paciente> table;  
  @FXML
  private TableColumn col_nombrePaciente;
  @FXML
  private TableColumn col_apellidosPaciente;
  @FXML
  private TableColumn col_fechaNacPaciente;
  @FXML
  private TableColumn col_generoPaciente;
  @FXML
  private TableColumn col_Peso;
  @FXML
  private TableColumn col_estatura;
  @FXML
  private TableColumn col_tallaIncial;
  @FXML
  private TableColumn col_correo;
  @FXML
  private TableColumn col_domicilioPaciente;
  @FXML
  private TableColumn col_medico;
  @FXML
  private TextField buscarPacienteTf;
  @FXML
  private Button buscarBtn;
  @FXML
  private Button eliminarBtn;
  @FXML
  private Button modificarBtn;
  @FXML
  private Button regresarBtn;
  @FXML
  private Button registrarBtn;
  
  /**
   * Initializes the controller class.
   */
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    // TODO
  }  

  @FXML
  private void buscarPaciente(ActionEvent event) {
  }

  @FXML
  private void eliminarPaciente(ActionEvent event) {
  }

  @FXML
  private void modificarPaciente(ActionEvent event) {
  }

  @FXML
  private void regresar(ActionEvent event) {
    try {
      Parent vistaPrincipal = FXMLLoader.load(getClass().getResource("/vista/FXMLPrincipal.fxml"));
      Scene escenaPrincipal = new Scene(vistaPrincipal);
      Stage escenarioBase = new Stage();
      escenarioBase.setScene(escenaPrincipal);
      escenarioBase.show();
      escenarioBase.setResizable(false);
      escenarioBase.setTitle("Principal");
      escenarioBase.getIcons().add(new Image("/vista/img/icono.png"));
    } catch (Exception ex) {
      Utilidades.mostrarAlertaSimple("Error", "Error al mostrar la pantalla principal", Alert.AlertType.ERROR);
    }
  }

  @FXML
  private void registrarPaciente(ActionEvent event) {
    try {
      Parent vistaAlimentos = FXMLLoader.load(getClass().getResource("/vista/FXMLRegistrarPaciente.fxml"));
      Scene escenaPrincipal = new Scene(vistaAlimentos);
      Stage escenarioRegistro = new Stage();
      escenarioRegistro.setScene(escenaPrincipal);
      escenarioRegistro.initModality(Modality.APPLICATION_MODAL);
      escenarioRegistro.showAndWait();
      escenarioRegistro.setResizable(false);
      escenarioRegistro.setTitle("RegistrarMedico");
      escenarioRegistro.getIcons().add(new Image("/vista/img/icono.png"));
    } catch (Exception ex) {
      Utilidades.mostrarAlertaSimple("Error", "Error al mostrar la registro de paciente", Alert.AlertType.ERROR);
    }
  }
  
}
