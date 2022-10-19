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
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;
import modelo.enums.PorcionEnum;
import util.Utilidades;

/**
 * FXML Controller class
 *
 * @author kfgf1
 */
public class FXMLEditarAlimentoController implements Initializable {

  @FXML
  private ComboBox<PorcionEnum> porcionCb;
  @FXML
  private TextField nombreAlimentoTf;
  @FXML
  private TextField caloriasTf;
  @FXML
  private TextField cantidadTf;
  @FXML
  private Button modificarAlimentoBtn;
  @FXML
  private Button regresarBtn;

  /**
   * Initializes the controller class.
   */
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    // TODO
  }  

  @FXML
  private void modificarAlimento(ActionEvent event) {
  }

  @FXML
  private void regresarConsultar(ActionEvent event) {
    try {
      Parent vistaAlimentos = FXMLLoader.load(getClass().getResource("/vista/FXMLConsultarAlimentos.fxml"));
      Scene escenaPrincipal = new Scene(vistaAlimentos);
      Stage escenarioAlimentos= new Stage();
      escenarioAlimentos.setScene(escenaPrincipal);
      escenarioAlimentos.initModality(Modality.APPLICATION_MODAL);
      escenarioAlimentos.showAndWait();
      escenarioAlimentos.setResizable(false);
      escenarioAlimentos.setTitle("ConsultarAlimentos");
      escenarioAlimentos.getIcons().add(new Image("/vista/img/icono.png"));
    } catch (Exception ex) {
      Utilidades.mostrarAlertaSimple("Error", "Error al mostrar la consultar alimentos", Alert.AlertType.ERROR);
    }
  }
  
}
