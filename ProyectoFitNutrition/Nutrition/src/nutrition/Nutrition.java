/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutrition;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.util.Objects;

/**
 *
 * @author kfgf1
 */
public class Nutrition extends Application {
  
  @Override
  public void start(Stage stage) throws Exception {
    //Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/vista/FXMLInicio.fxml")));
    Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/vista/FXMLConsultarAlimentos.fxml")));
    //Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/vista/FXMLConsultarMedicos.fxml")));
    //Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/vista/FXMLConsultarPacientes.fxml")));
    //Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/vista/FXMLRegistrarAlimento.fxml")));
    //Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/vista/FXMLRegistrarMedico.fxml")));
    //Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/vista/FXMLRegistrarPaciente.fxml")));
    //Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/vista/FXMLEditarAlimento.fxml")));
    //Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/vista/FXMLEditarMedico.fxml")));
    //Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/vista/FXMLEditarPaciente.fxml")));
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.setTitle("IniciarSesion");
    stage.show();
    stage.setResizable(false);
    stage.getIcons().add(new Image("/vista/img/icono.png"));
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    launch(args);
  }
  
}
