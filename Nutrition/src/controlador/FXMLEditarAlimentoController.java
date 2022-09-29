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
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import modelo.enums.PorcionEnum;

/**
 * FXML Controller class
 *
 * @author kfgf1
 */
public class FXMLEditarAlimentoController implements Initializable {

  @FXML
  private Button cerrarBtn;
  @FXML
  private Button editarBtn;
  @FXML
  private ComboBox<PorcionEnum> porcionCb;
  @FXML
  private TextField nombreAlimentoTf;
  @FXML
  private TextField caloriasTf;
  @FXML
  private TextField cantidadTf;

  /**
   * Initializes the controller class.
   */
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    // TODO
  }  

  @FXML
  private void regresar(MouseEvent event) {
  }

  @FXML
  private void agregar(MouseEvent event) {
  }
  
}
