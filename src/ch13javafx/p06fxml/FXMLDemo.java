package ch13javafx.p06fxml;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class FXMLDemo extends Application implements Initializable
{
   @FXML private TextField username;
   @FXML private PasswordField password; 
   @FXML private Button okButton; 
   @FXML private Button cancelButton; 
   
   public void initialize(URL url, ResourceBundle rb)
   {
      okButton.setOnAction(event ->
         {
            Alert alert = new Alert(AlertType.INFORMATION,
               "Verifying " + username.getText() + ":" + password.getText());
            alert.showAndWait();
         });        
      cancelButton.setOnAction(event ->
         {
            username.setText("");
            password.setText("");
         });
   }

   public void start(Stage stage)
   {
      try
      {
         Parent root = FXMLLoader.load(
            getClass().getResource("dialog.fxml"));
         stage.setScene(new Scene(root));
         stage.setTitle("FXMLDemo");
         stage.show();
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }
   }   
}

