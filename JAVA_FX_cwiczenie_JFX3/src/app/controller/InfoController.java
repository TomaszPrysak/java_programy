package app.controller;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;

public class InfoController {

    @FXML
    private TextField tf_first;

    @FXML
    private TextField tf_last;

    @FXML
    private RadioButton rb1;

    @FXML
    private ToggleGroup pyt1;

    @FXML
    private RadioButton rb2;

    @FXML
    private RadioButton rb3;

    @FXML
    private CheckBox cb1;

    @FXML
    private CheckBox cb2;

    @FXML
    private CheckBox cb3;

    @FXML
    private TextField tf_other;

    @FXML
    private ComboBox<String> combo;
    
    @FXML
    private Button btn_send;

    @FXML
    void sendAction(MouseEvent event) throws FileNotFoundException {
    	String rb = "";
    	String cb = "";
    	String combo_wynik = "";
    	String info = "Dane ankietowanego: " + tf_first.getText() + " " + tf_last.getText() + "\n";
    	
    	Alert a = new Alert(null);
    	
    	if(rb1.isSelected()){
    		rb = rb1.getText();
    	}else if(rb2.isSelected()){
    		rb = rb2.getText();
    	}else if(rb3.isSelected()){
    		rb = rb3.getText();
    	}
    	
    	info = info + "Znajomo�� j�zyka angielskiego na poziomie: " + rb + "\nZnajomo�� j�zyk�w programowania: ";
    	
    	if(cb1.isSelected()){
    		cb = cb1.getText() + ", ";
    	}
    	if(cb2.isSelected()){
    		cb = cb + cb2. getText() + ", ";
    	}
    	if(cb3.isSelected()){
    		cb = cb + tf_other.getText() + " ";
    	}
    	
    	info = info + cb + "\nAnkietowany zainteresowany jest kursem: ";
    	combo_wynik = combo.getSelectionModel().getSelectedItem();
    	info = info + combo_wynik + "\n";
    	
    	if(tf_first.getText().equals("") || tf_last.getText().equals("")){ 		
    		//Alert a = new Alert(AlertType.WARNING);
    		a.setAlertType(AlertType.WARNING);
    		a.setContentText("Nie poda�e� imienia lub nazwiska");
    		a.setTitle("B��d");
    		a.setHeaderText("UWAGA!");
    		a.showAndWait();
    	}else{
	    	System.out.println(info);
	    	PrintWriter zapis_do_pliku = new PrintWriter("C:/Users/Tomek/Desktop/Back_end_Developer/java-programy/Pliki_txt/" + tf_last.getText() + "_" + tf_first.getText() + ".txt");
	    	zapis_do_pliku.println(info);
	    	zapis_do_pliku.close();
    		//Alert a = new Alert(AlertType.INFORMATION);
    		a.setAlertType(AlertType.INFORMATION);
    		a.setContentText("Dane zosta�y przes�ane");
    		a.setTitle("Dzi�kujemy");
    		a.setHeaderText("Dzi�kujemy za wype�nienie ankiety!");
    		a.showAndWait();
    	}
    }
    
    @FXML
    void enableAction(MouseEvent event) {
    	tf_other.setDisable(false);
    }
    
    public void initialize(){
    	combo.getItems().add("Back-end Developer");
    	combo.getItems().add("Front-end Developer");
    	combo.getSelectionModel().select(0);

    }

}
