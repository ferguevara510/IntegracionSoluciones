/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;
import modelo.ConexionServiciosWeb;
import pojos.Medico;
import util.Constantes;
import util.Utilidades;

/**
 * FXML Controller class
 *
 * @author kfgf1
 */
public class FXMLConsultarMedicosController implements Initializable {

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
  @FXML
  private Button regresarBtn;
  @FXML
  private Button eliminarBtn;
  @FXML
  private Button modificarBtn;
  @FXML
  private Button registrarBtn;
  
  private ObservableList<Medico> listaMedicos;

  /**
   * Initializes the controller class.
   */
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    configurarTable();
    cargarInfoMedicoWS();
  }  
  
  private void configurarTable(){
    listaMedicos = FXCollections.observableArrayList();
    col_noPersonal.setCellValueFactory(new PropertyValueFactory("noPersonal"));
  }
  
  private void cargarInfoMedicoWS(){
    String urlWS = Constantes.URL_BASE+"medicos/all";
    try {
      String jsonRespuesta = ConexionServiciosWeb.consumirServicioGET(urlWS);
      Gson gson = new Gson();
      Type tipoListaMedico = new TypeToken<List<Medico>>(){}.getType();
      List medicosWS = gson.fromJson(jsonRespuesta, tipoListaMedico);
      listaMedicos.addAll(medicosWS);
      table.setItems(listaMedicos);
    } catch (Exception e) {
      Utilidades.mostrarAlertaSimple("Error", "Error al descargar la Información, intentar más tarde", 
              Alert.AlertType.ERROR);
    }
  }

  @FXML
  private void buscarMedico(ActionEvent event) {
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

  @FXML
  private void eliminarMedico(ActionEvent event) {
  }

  @FXML
  private void modificarMedico(ActionEvent event) {
  }

  @FXML
  private void registrarMedico(ActionEvent event) {
    try {
      Parent vistaMedicos = FXMLLoader.load(getClass().getResource("/vista/FXMLRegistrarMedico.fxml"));
      Scene escenaPrincipal = new Scene(vistaMedicos);
      Stage escenarioRegistro = new Stage();
      escenarioRegistro.setScene(escenaPrincipal);
      escenarioRegistro.initModality(Modality.APPLICATION_MODAL);
      escenarioRegistro.showAndWait();
      escenarioRegistro.setResizable(false);
      escenarioRegistro.setTitle("RegistrarMedico");
      escenarioRegistro.getIcons().add(new Image("/vista/img/icono.png"));
    } catch (Exception ex) {
      Utilidades.mostrarAlertaSimple("Error", "Error al mostrar la registro de medico", Alert.AlertType.ERROR);
    }
  }
  
}
