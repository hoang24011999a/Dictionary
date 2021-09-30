/**
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class DashBoardApplication extends Application {
  public static void main(String[] args) {
    launch(args);
  }

  public void start(Stage primaryStage) throws IOException {
      Parent root = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
      Scene scene = new Scene(root);
      scene.getStylesheets().add(getClass().getResource("dashboard.css").toExternalForm());
      primaryStage.setScene(scene);
      primaryStage.show();
  }
}
