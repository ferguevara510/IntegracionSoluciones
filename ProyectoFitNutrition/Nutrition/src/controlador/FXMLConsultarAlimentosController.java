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
import modelo.Alimento;

/**
 * FXML Controller class
 *
 * @author kfgf1
 */
public class FXMLConsultarAlimentosController implements Initializable {

  @FXML
  private Button cerrarBtn;
  @FXML
  private Button buscarAlimentoBtn;
  @FXML
  private Button registroAlimentoBtn;
  @FXML
  private Button editarAlimentoBtn;
  @FXML
  private Button eliminarAlimentoBtn;
  @FXML
  private TableView<Alimento> table;
  @FXML
  private TableColumn<Alimento, String> col_nombreAlimento;
  @FXML
  private TableColumn<Alimento, String> col_calorias;
  @FXML
  private TableColumn<Alimento, String> col_cantidad;
  @FXML
  private TableColumn<Alimento, String> col_porcion;
  @FXML
  private TextField buscarAlimentoTf;

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

  @FXML
  private void agregar(ActionEvent event) {
  }

  @FXML
  private void editar(ActionEvent event) {
  }
  
}
