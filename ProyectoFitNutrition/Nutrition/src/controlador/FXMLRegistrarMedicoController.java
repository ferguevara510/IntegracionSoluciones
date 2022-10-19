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
import modelo.enums.GeneroEnum;
import modelo.enums.RolEnum;
import util.Utilidades;

/**
 * FXML Controller class
 *
 * @author kfgf1
 */
public class FXMLRegistrarMedicoController implements Initializable {

  @FXML
  private ComboBox<RolEnum> rolCb;
  @FXML
  private ComboBox<GeneroEnum> generoMedicoCb;
  @FXML
  private TextField nombreMedicoTf;
  @FXML
  private TextField apellidoMedicoTf;
  @FXML
  private TextField domicilioMedicoTf;
  @FXML
  private TextField noPersonalTf;
  @FXML
  private TextField noCedulaProfesionalTf;
  @FXML
  private TextField contrasenaTf;
  @FXML
  private DatePicker fechaNacMedicoDp;
  @FXML
  private Button regresarBtn;
  @FXML
  private Button registrarMedicoBtn;
  

  /**
   * Initializes the controller class.
   */
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    generoMedicoCb.getItems().addAll(GeneroEnum.values());
    rolCb.getItems().addAll(RolEnum.values());
  }  

  @FXML
  private void regresarConsultar(ActionEvent event) {
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
  private void registrarMedico(ActionEvent event) {
  }
  
}
