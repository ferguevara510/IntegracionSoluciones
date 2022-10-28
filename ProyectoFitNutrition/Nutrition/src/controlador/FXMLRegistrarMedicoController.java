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
import java.util.ArrayList;
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;
import modelo.ConexionServiciosWeb;
import modelo.enums.GeneroEnum;
import modelo.enums.RolEnum;
import pojos.Catalogo;
import util.Constantes;
import util.Utilidades;

/**
 * FXML Controller class
 *
 * @author kfgf1
 */
public class FXMLRegistrarMedicoController implements Initializable {

  @FXML
  private ComboBox<Catalogo> rolCb;
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
  @FXML
  private Button regresarBtn;
  @FXML
  private Button registrarMedicoBtn;
  
  ObservableList<Catalogo> listaCatalogo = FXCollections.observableArrayList();

  /**
   * Initializes the controller class.
   */
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    generoMedicoCb.getItems().addAll(GeneroEnum.values());
    //rolCb.getItems().addAll(RolEnum.values());
    obtenerRolesWS();
  }  
  
  public void obtenerRolesWS(){
    String url = Constantes.URL_BASE+"catalogos/byCategoria/1";
    try {
      String jsonRespuesta = ConexionServiciosWeb.consumirServicioGET(url);
      Gson gson = new Gson();
      Type tipoListaCatalogo = new TypeToken<List<Catalogo>>(){}.getType();
      ArrayList<Catalogo> listaWS = gson.fromJson(jsonRespuesta, tipoListaCatalogo);
      listaCatalogo.addAll(listaWS);
      rolCb.setItems(listaCatalogo);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @FXML
  private void regresarConsultar(ActionEvent event) {
    try {
      Parent vistaMedicos = FXMLLoader.load(getClass().getResource("/vista/FXMLConsultarMedicos.fxml"));
      Scene escenaPrincipal = new Scene(vistaMedicos);
      Stage escenarioMedicos= new Stage();
      escenarioMedicos.setScene(escenaPrincipal);
      escenarioMedicos.initModality(Modality.APPLICATION_MODAL);
      escenarioMedicos.showAndWait();
      escenarioMedicos.setResizable(false);
      escenarioMedicos.setTitle("ConsultarMedicos");
      escenarioMedicos.getIcons().add(new Image("/vista/img/icono.png"));
    } catch (Exception ex) {
      Utilidades.mostrarAlertaSimple("Error", "Error al mostrar la consultar medicos", Alert.AlertType.ERROR);
    }
  }

  @FXML
  private void registrarMedico(ActionEvent event) {
    
  }
  
}
