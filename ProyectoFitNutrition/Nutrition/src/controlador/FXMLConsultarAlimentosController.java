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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;
import modelo.Alimento;
import util.Utilidades;

/**
 * FXML Controller class
 *
 * @author kfgf1
 */
public class FXMLConsultarAlimentosController implements Initializable {

  @FXML
  private TableView<Alimento> table;
  @FXML
  private TableColumn col_nombreAlimento;
  @FXML
  private TableColumn col_calorias;
  @FXML
  private TableColumn col_cantidad;
  @FXML
  private TableColumn col_porcion;
  @FXML
  private TextField buscarAlimentoTf;
  @FXML
  private Button buscarBtn;
  @FXML
  private Button eliminarBtm;
  @FXML
  private Button registrarBtn;
  @FXML
  private Button modificarBtn;
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
  private void buscarAlimento(ActionEvent event) {
  }

  @FXML
  private void eliminarAlimento(ActionEvent event) {
  }

  @FXML
  private void registrarAlimento(ActionEvent event) {  
    try {
      Parent vistaAlimentos = FXMLLoader.load(getClass().getResource("/vista/FXMLRegistrarAlimento.fxml"));
      Scene escenaPrincipal = new Scene(vistaAlimentos);
      Stage escenarioRegistro = new Stage();
      escenarioRegistro.setScene(escenaPrincipal);
      escenarioRegistro.initModality(Modality.APPLICATION_MODAL);
      escenarioRegistro.showAndWait();
      escenarioRegistro.setResizable(false);
      escenarioRegistro.setTitle("RegistrarMedico");
      escenarioRegistro.getIcons().add(new Image("/vista/img/icono.png"));
    } catch (Exception ex) {
      Utilidades.mostrarAlertaSimple("Error", "Error al mostrar la registro de alimento", Alert.AlertType.ERROR);
    }
  }

  @FXML
  private void modificarAlimento(ActionEvent event) {
  }

  @FXML
  private void regresar(ActionEvent event) {
    try {
      Parent vistaPrincipal = FXMLLoader.load(getClass().getResource("/vista/FXMLPrincipal.fxml"));
      Scene escenaPrincipal = new Scene(vistaPrincipal);
      Stage escenarioBase = new Stage();
      escenarioBase.setScene(escenaPrincipal);
      escenarioBase.show();
      escenarioBase.setResizable(false);
      escenarioBase.setTitle("Principal");
      escenarioBase.getIcons().add(new Image("/vista/img/icono.png"));
    } catch (Exception ex) {
      Utilidades.mostrarAlertaSimple("Error", "Error al mostrar la pantalla principal", Alert.AlertType.ERROR);
    }
  }

  
}
