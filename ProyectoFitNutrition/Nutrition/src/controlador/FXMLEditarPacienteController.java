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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;
import modelo.Medico;
import modelo.enums.GeneroEnum;
import util.Utilidades;

/**
 * FXML Controller class
 *
 * @author kfgf1
 */
public class FXMLEditarPacienteController implements Initializable {

  @FXML
  private ComboBox<GeneroEnum> generoPacienteCb;
  @FXML
  private ComboBox<Medico> medicoCb;
  @FXML
  private TextField nombrePacienteTf;
  @FXML
  private TextField apellidosPacienteTf;
  @FXML
  private TextField telefonoTf;
  @FXML
  private TextField domicilioPacienteTf;
  @FXML
  private TextField usuarioPacienteTf;
  @FXML
  private TextField contrasenaPacienteTf;
  @FXML
  private TextField pesoTf;
  @FXML
  private TextField estaturaTf;
  @FXML
  private TextField tallaInicialTf;
  @FXML
  private TextField correoTf;
  @FXML
  private DatePicker fechaNacPacienteDp;
  @FXML
  private Button regresarBtn;
  @FXML
  private Button modificarPacienteBtn;

  /**
   * Initializes the controller class.
   */
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    // TODO
  }  

  @FXML
  private void regresarConsultar(ActionEvent event) {
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
  private void modificarPaciente(ActionEvent event) {
  }
  
}
