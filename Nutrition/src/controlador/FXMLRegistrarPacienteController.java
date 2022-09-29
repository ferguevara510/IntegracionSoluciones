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
import modelo.Medico;
import modelo.enums.GeneroEnum;

/**
 * FXML Controller class
 *
 * @author kfgf1
 */
public class FXMLRegistrarPacienteController implements Initializable {

  @FXML
  private Button cerrarBtn;
  @FXML
  private Button registroPacienteBtn;
  @FXML
  private ComboBox<GeneroEnum> generoPacienteCb;
  @FXML
  private ComboBox<Medico> medicoCb;
  @FXML
  private TextField pesoTf;
  @FXML
  private TextField estaturaTf;
  @FXML
  private TextField tallaInicialTf;
  @FXML
  private TextField correoTf;
  @FXML
  private TextField telefonoTf;
  @FXML
  private TextField domicilioPacienteTf;
  @FXML
  private TextField usuarioPacienteTf;
  @FXML
  private TextField nombrePacienteTf;
  @FXML
  private TextField apellidosPacienteTf;
  @FXML
  private DatePicker fechaNacPacienteDp;

  /**
   * Initializes the controller class.
   */
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    generoPacienteCb.getItems().addAll(GeneroEnum.values());
  }  

  @FXML
  private void regresar(MouseEvent event) {
  }

  @FXML
  private void agregar(MouseEvent event) {
  }
  
}
