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
  private Button buscarMedicoBtn;
  @FXML
  private Button registroMedicoBtn;
  @FXML
  private Button editarMedicoBtn;
  @FXML
  private Button eliminarMedicoBtn;
  @FXML
  private TableView<Medico> table;
  @FXML
  private TableColumn<Medico, ?> col_nombreMedico;
  @FXML
  private TableColumn<Medico, ?> col_apellidosMedico;
  @FXML
  private TableColumn<Medico, ?> col_fechaNacMedico;
  @FXML
  private TableColumn<Medico, ?> col_genero;
  @FXML
  private TableColumn<Medico, ?> col_direccionMedico;
  @FXML
  private TableColumn<Medico, ?> col_noPersonal;
  @FXML
  private TableColumn<Medico, ?> col_noCedula;
  @FXML
  private TableColumn<Medico, ?> col_rol;
  @FXML
  private TableColumn<Medico, ?> col_fotografia;
  @FXML
  private TextField buscarMedicoTf;

  /**
   * Initializes the controller class.
   */
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    // TODO
  }  

  @FXML
  private void consultar(MouseEvent event) {
  }

  @FXML
  private void regresar(MouseEvent event) {
  }

  @FXML
  private void agregar(MouseEvent event) {
  }

  @FXML
  private void editar(MouseEvent event) {
  }

  @FXML
  private void eliminar(MouseEvent event) {
  }
  
}
