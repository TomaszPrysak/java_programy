package app.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class LoginController {

	@FXML
    private TextField tf_login;

    @FXML
    private PasswordField pf_pass;

    @FXML
    private TextField tf_pass;

    @FXML
    private Button btn_show;

    @FXML
    private Button btn_login;
    
    @FXML
    void loginAction(MouseEvent event) throws IOException {
    	
    	if((tf_login.getText().equals("admin") && pf_pass.getText().equals("admin")) || (tf_login.getText().equals("admin") && tf_pass.getText().equals("admin"))){
    		
    		// w celu wy�weitlenia kolejnej sceny "po zalogowaniu" u�ywamy takiej samej konstrukcji jak w klasie Main u�ywali�my do wystartowania programu poprzez wy�wietlenie g��wnego okna logowania
    		
    		Stage stageInfo = new Stage();
    		Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/app/view/InfoView.fxml"));
    		Scene sceneInfo = new Scene(parent);
    		stageInfo.setScene(sceneInfo);
    		stageInfo.setTitle("InfoView");
    		stageInfo.setResizable(false);
    		stageInfo.show();
    		
    	}else{
    		Alert a = new Alert(AlertType.WARNING);
    		a.setContentText("Poda�e� b��dny login lub has�o");
    		a.setTitle("B��d");
    		a.setHeaderText("UWAGA!");
    		a.showAndWait();
    	}
    }

    @FXML
    void showAction(MouseEvent event) {
    	pf_pass.setVisible(false);
    	tf_pass.setVisible(true);
    	String pass = pf_pass.getText();
    	tf_pass.setText(pass);
    	pf_pass.setText("");
    }
    
    @FXML
    void hideAction(MouseEvent event) {
    	pf_pass.setVisible(true);
    	tf_pass.setVisible(false);
    	String pass = tf_pass.getText();
    	pf_pass.setText(pass);
    	tf_pass.setText("");
    }

}
