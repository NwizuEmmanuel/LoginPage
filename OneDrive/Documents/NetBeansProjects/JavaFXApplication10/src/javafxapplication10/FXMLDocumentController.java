/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication10;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author HP
 */
public class FXMLDocumentController implements Initializable {
    
        @FXML
    private JFXButton one;

    @FXML
    private JFXButton two;

    @FXML
    private JFXButton equalsTo;

    @FXML
    private JFXTextField resultScr;

    @FXML
    private JFXButton plus;
    
    String operand = "";
    
    double firstNum;
    double secondNum;
    double thirdNum;
    
    @FXML
    private void handleButtonActionOne(ActionEvent event) {
        resultScr.setText(resultScr.getText()+"1");
    }
    
    @FXML
    private void handleButtonActionTwo(ActionEvent event){
        resultScr.setText(resultScr.getText()+"2");
    }
    
    @FXML
    private void handleButtonActionThree(ActionEvent event){
        resultScr.setText(resultScr.getText()+"3");
    }
    
    @FXML
    private void handleButtonActionFour(ActionEvent event){
        resultScr.setText(resultScr.getText()+"4");
    }
    
    @FXML
    private void handleButtonActionFive(ActionEvent event){
        resultScr.setText(resultScr.getText()+"5");
    }
    
    @FXML
    private void handleButtonActionSix(ActionEvent event){
        resultScr.setText(resultScr.getText()+"6");
    }
    
    @FXML
    private void handleButtonActionSeven(ActionEvent event){
        resultScr.setText(resultScr.getText()+"7");
    }
    
    @FXML
    private void handleButtonActionEight(ActionEvent event){
        resultScr.setText(resultScr.getText()+"8");
    }
    
    @FXML
    private void handleButtonActionNine(ActionEvent event){
        resultScr.setText(resultScr.getText()+"9");
    }
    
    @FXML
    private void handleButtonActionZero(ActionEvent event){
        resultScr.setText(resultScr.getText()+"0");
    }
    
    @FXML
    private void handleButtonActionPoint(ActionEvent event){
        resultScr.setText(resultScr.getText()+".");
    }
    
    @FXML
    private void handleButtonActionClear(ActionEvent event){
        resultScr.clear();
    }
    
    @FXML
    private void handleButtonActionPlus(ActionEvent event){
        firstNum = Double.valueOf(resultScr.getText());
        if ("0".equals(resultScr.getText())) {
            resultScr.setText("");
        }else{
        resultScr.setText("");
        operand = "+";
        }
    }
    
    @FXML
    private void handleButtonActionSub(ActionEvent event){
        firstNum = Double.valueOf(resultScr.getText());
        resultScr.setText("");
        operand = "-";
    }
    
    @FXML
    private void handleButtonActionDiv(ActionEvent event){
        firstNum = Double.valueOf(resultScr.getText());
        resultScr.setText("");
        operand = "/";
    }
    
    @FXML
    private void handleButtonActionMul(ActionEvent event){
        firstNum = Double.valueOf(resultScr.getText());
        resultScr.setText("");
        operand = "*";
    }
    
    @FXML
    private void handleButtonActionSin(ActionEvent event){
        firstNum = Double.valueOf(resultScr.getText());
        secondNum = Math.sin(firstNum);
        resultScr.setText(Double.toString(secondNum));
        //resultScr.setText("Sin("+firstNum+")");
        operand = "sin";
    }
    
    @FXML
    private void handleButtonActionCos(ActionEvent event){
        firstNum = Double.valueOf(resultScr.getText());
        secondNum = Math.cos(firstNum);
        resultScr.setText(Double.toString(secondNum));
        //resultScr.setText("Cos("+firstNum+")");
        operand = "cos";
    }
    
    @FXML
    private void handleButtonActionTan(ActionEvent event){
        firstNum = Double.valueOf(resultScr.getText());
        secondNum = Math.tan(firstNum);
        resultScr.setText(Double.toString(secondNum));
        //resultScr.setText("");
        operand = "tan";
    }
    
    @FXML
    private void handleButtonActionEquatTo(ActionEvent event){
        secondNum = Double.valueOf(resultScr.getText());
        if (null != operand) switch (operand) {
                case "+":
                    secondNum = secondNum + firstNum;
                    resultScr.setText(Double.toString(secondNum));                        
//                    thirdNum = secondNum + Double.valueOf(resultScr.getText());
//                    resultScr.setText(Double.toString(thirdNum)); 
                    break;
                case "-":
                    secondNum = firstNum - secondNum;
                    resultScr.setText(Double.toString(secondNum));
                    break;
                case "*":
                    secondNum = firstNum * secondNum;
                    resultScr.setText(Double.toString(secondNum));
                    break;
                case "/":
                    secondNum = firstNum / secondNum;
                    resultScr.setText(Double.toString(secondNum));
                    break;
                default:
                    break;
            }
        operand = "";
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
