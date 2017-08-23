package app.controller;

import java.awt.Frame;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class MainController {

    @FXML
    private MenuItem mi_S;

    @FXML
    private MenuItem mi_C;

    @FXML
    private TextField tf;

    @FXML
    private TextArea ta;

    @FXML
    private Button btn_C;

    @FXML
    private Button btn_UC;

    @FXML
    private Button btn_LC;

    @FXML
    void clear(MouseEvent event) {
    	ta.setText("");
    }

    @FXML
    void closeApp(ActionEvent event) {
    	System.exit(0);
    }

    @FXML
    void lowerCase(MouseEvent event) {
    	String text = ta.getText();
    	text = text.toLowerCase();
    	ta.setText(text);
    }

    @FXML
    void save(ActionEvent event) throws IOException {
    	Frame df = new Frame();
    	JOptionPane op = new JOptionPane();
    	if(tf.getText().equals("")){
    		op.showMessageDialog(df, "Musisz poda� nazw� pliku, aby go zapisa�");
    	}else{
	    	File file_name = new File("C:/Users/Tomek/Desktop/Back_end_Developer/java-programy/Pliki_txt/" + tf.getText() + ".txt");
	    	PrintWriter file_save = new PrintWriter(file_name);
	    	
	    	Scanner odczyt_z_text_area = new Scanner(ta.getText());
	    	
	    	while(odczyt_z_text_area.hasNextLine()){
	    		String wiersz_pliku = odczyt_z_text_area.nextLine();
	    		file_save.println(wiersz_pliku);
	    	}
	    	
	    	op.showMessageDialog(df, "Zapisano plik");
	    	ta.setText("");
	    	tf.setText("");
	    	file_save.close();
	    	odczyt_z_text_area.close();
    	}
    }

    @FXML
    void upperCase(MouseEvent event) {
    	String text = ta.getText();
    	text = text.toUpperCase();
    	ta.setText(text);
    }

}
