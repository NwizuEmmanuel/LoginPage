/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginpage6;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTabPane;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.stage.Stage;

/**
 *
 * @author HP
 */
public class FXMLDocumentController implements Initializable {

    
    @FXML
    private JFXButton signInButton;
    
    
    @FXML
    private JFXButton accountCrt;
    
    @FXML
    private JFXTabPane tabPane;
    
    @FXML
    private Tab signUp;
    
    @FXML
    private void signInBtn(ActionEvent event) throws IOException {
          Parent root; Stage stage = new Stage();
        root = FXMLLoader.load(getClass().getResource("homePage.fxml"));
        
        //JFXDecorator decorator = new JFXDecorator(stage, root);
        Stage sage1=(Stage) signInButton.getScene().getWindow();
        Scene scene = new Scene(root,2000,800);
        
        stage.setTitle("Home Page");
        stage.setScene(scene);
            sage1.close();
        stage.show();
    
    }
    
    @FXML
    private void accountCrtListenser(ActionEvent event){
        
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
