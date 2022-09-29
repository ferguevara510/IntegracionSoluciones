/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import modelo.enums.GeneroEnum;
import modelo.enums.RolEnum;

/**
 * FXML Controller class
 *
 * @author kfgf1
 */
public class FXMLRegistrarMedicoController implements Initializable {

  @FXML
  private Button cerrarBtn;
  @FXML
  private Button registrarBtn;
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
  

  /**
   * Initializes the controller class.
   */
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    generoMedicoCb.getItems().addAll(GeneroEnum.values());
    rolCb.getItems().addAll(RolEnum.values());
  }  

  @FXML
  private void regresar(MouseEvent event) {
  }

  @FXML
  private void agregar(MouseEvent event) {
  }
  
}
