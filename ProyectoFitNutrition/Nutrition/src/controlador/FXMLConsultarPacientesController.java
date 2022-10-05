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
import modelo.Paciente;

/**
 * FXML Controller class
 *
 * @author kfgf1
 */
public class FXMLConsultarPacientesController implements Initializable {

  @FXML
  private Button buscarEmpleadoBtn;
  @FXML
  private Button cerrarBtn;
  @FXML
  private Button registroPacienteBtn;
  @FXML
  private Button editarPacienteBtn;
  @FXML
  private Button eliminarPacienteBtn;
  @FXML
  private TableView<Paciente> table;  
  @FXML
  private TableColumn<Paciente, ?> col_nombrePaciente;
  @FXML
  private TableColumn<Paciente, ?> col_apellidosPaciente;
  @FXML
  private TableColumn<Paciente, ?> col_fechaNacPaciente;
  @FXML
  private TableColumn<Paciente, ?> col_generoPaciente;
  @FXML
  private TableColumn<Paciente, ?> col_Peso;
  @FXML
  private TableColumn<Paciente, ?> col_estatura;
  @FXML
  private TableColumn<Paciente, ?> col_tallaIncial;
  @FXML
  private TableColumn<Paciente, ?> col_correo;
  @FXML
  private TableColumn<Paciente, ?> col_domicilioPaciente;
  @FXML
  private TableColumn<Paciente, ?> col_medico;
  @FXML
  private TextField buscarPacienteTf;
  
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
