/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginpage6;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class HomePageController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private JFXButton backBtn;
    
    @FXML
    private void backBtnListner(ActionEvent event ) throws IOException{
        Parent root; Stage stage = new Stage();
        root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        //JFXDecorator decorator = new JFXDecorator(stage, root);
        Stage sage1=(Stage) backBtn.getScene().getWindow();
        Scene scene = new Scene(root,2000,800);
        
        stage.setTitle("Home Page");
        stage.setScene(scene);
            sage1.close();
        stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
