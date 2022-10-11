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
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import modelo.Medico;

/**
 * FXML Controller class
 *
 * @author kfgf1
 */
public class FXMLConsultarMedicosController implements Initializable {

  @FXML
  private Button cerrarBtn;
  @FXML
  private Button registroMedicoBtn;
  @FXML
  private Button editarMedicoBtn;
  @FXML
  private Button eliminarMedicoBtn;
  @FXML
  private TableView<Medico> table;
  @FXML
  private TableColumn col_nombreMedico;
  @FXML
  private TableColumn col_apellidosMedico;
  @FXML
  private TableColumn col_fechaNacMedico;
  @FXML
  private TableColumn col_genero;
  @FXML
  private TableColumn col_direccionMedico;
  @FXML
  private TableColumn col_noPersonal;
  @FXML
  private TableColumn col_noCedula;
  @FXML
  private TableColumn col_rol;
  @FXML
  private TableColumn col_fotografia;
  @FXML
  private TextField buscarMedicoTf;
  @FXML
  private Button buscarBtn;

  /**
   * Initializes the controller class.
   */
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    // TODO
  }  

  @FXML
  private void clickBuscar(ActionEvent event) {
  }
  
}
