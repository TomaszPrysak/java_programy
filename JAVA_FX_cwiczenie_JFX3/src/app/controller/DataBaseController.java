package app.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import app.database.DBConnector;
import app.model.DataBaseModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;

public class DataBaseController {
	
    @FXML
    private TableView<DataBaseModel> TableTwo;

    @FXML
    private TableColumn<DataBaseModel, Integer> col_id;

    @FXML
    private TableColumn<DataBaseModel, String> col_name;

    @FXML
    private TableColumn<DataBaseModel, String> col_last;

    @FXML
    private TableColumn<DataBaseModel, Double> col_salary;
	
    @FXML
    private Button select;

    @FXML
    private Button delete;

    @FXML
    private Button update;

    @FXML
    private Button insert;
    
    @FXML
    private Label lb_name;

    @FXML
    private Label lb_last;

    @FXML
    private Label lb_salary;

    @FXML
    private GridPane grid_panel;
    
    @FXML
    private TextField tf_name;

    @FXML
    private TextField tf_last;

    @FXML
    private TextField tf_salary;

    @FXML
    private Button btn_update;

    @FXML
    private Button btn_insert;
    
    public DBConnector db;
    public ObservableList<DataBaseModel> data;

    @FXML
    void btnDeleteAction(ActionEvent event) throws ClassNotFoundException, SQLException {
    	
    	Connection conn = db.Connection();
    	
    	try{
	    	int id_del = TableTwo.getSelectionModel().getSelectedItem().getId();
	    	String sql = "delete from employee where id = " + id_del + ";";
	    	PreparedStatement ps = conn.prepareStatement(sql);
	    	ps.executeUpdate();  	
	    	btnSelectAction(event);
    	}catch(NullPointerException e){
    		Alert a = new Alert(AlertType.WARNING);
    		a.setContentText("Nie wybra³eœ ¿adnego rekordu do usuniêcia");
    		a.setTitle("B³¹d");
    		a.setHeaderText("UWAGA!");
    		a.showAndWait();
    	}
    }

    @FXML
    void btnInsertAction(ActionEvent event) throws ClassNotFoundException, SQLException{
   
    	grid_panel.setDisable(false);
    	btn_insert.setDisable(false);
    	
    }

    @FXML
    void btnInsertCommitAction(ActionEvent event) throws ClassNotFoundException, SQLException {
    	
    	Connection conn = db.Connection();
    	
    	if(tf_name.getText().equals("") || tf_last.getText().equals("") || tf_salary.getText().equals("")){
    		Alert a = new Alert(AlertType.WARNING);
    		a.setContentText("Musisz wpisaæ dane osoby która chcesz dodaæ do bazy danych");
    		a.setTitle("B³¹d");
    		a.setHeaderText("UWAGA!");
    		a.showAndWait();
    	}else{
	    	String sql = "insert into employee (name, last, salary) values('" + tf_name.getText() + "', '" + tf_last.getText() + "', " + tf_salary.getText() + ");";
	    	PreparedStatement ps = conn.prepareStatement(sql);
	    	ps.executeUpdate();
	    	btnSelectAction(event);
	    	tf_name.clear();
	    	tf_last.clear();
	    	tf_salary.clear();
	    	grid_panel.setDisable(true);
	    	btn_insert.setDisable(true);
    	}
    	
    }

    @FXML
    void btnSelectAction(ActionEvent event) throws ClassNotFoundException, SQLException {
    	
    	Connection conn = db.Connection();
    	data = FXCollections.observableArrayList();
    	
    	ResultSet rs = conn.createStatement().executeQuery("select * from employee;");
    	
    	while(rs.next()){
    		data.add(new DataBaseModel(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4)));
    	}
    	
    	col_id.setCellValueFactory(new PropertyValueFactory<DataBaseModel, Integer>("id"));
    	col_name.setCellValueFactory(new PropertyValueFactory<DataBaseModel, String>("name"));
    	col_last.setCellValueFactory(new PropertyValueFactory<DataBaseModel, String>("last"));
    	col_salary.setCellValueFactory(new PropertyValueFactory<DataBaseModel, Double>("salary"));
    	
    	TableTwo.setItems(null);
    	TableTwo.setItems(data);
    	
    }

    @FXML
    void btnUpdateAction(ActionEvent event) throws ClassNotFoundException, SQLException {
    	
    	try{
	    	tf_name.setText(TableTwo.getSelectionModel().getSelectedItem().getName());
	    	tf_last.setText(TableTwo.getSelectionModel().getSelectedItem().getLast());
	    	tf_salary.setText(String.valueOf(TableTwo.getSelectionModel().getSelectedItem().getSalary()));
	    	grid_panel.setDisable(false);
	    	btn_update.setDisable(false);
    	}catch(NullPointerException e){
    		Alert a = new Alert(AlertType.WARNING);
    		a.setContentText("Nie wybra³eœ ¿adnego rekordu do usuniêcia");
    		a.setTitle("B³¹d");
    		a.setHeaderText("UWAGA!");
    		a.showAndWait();
    	}
    }

    @FXML
    void btnUpdateCommitAction(ActionEvent event) throws ClassNotFoundException, SQLException {
    	
    	Connection conn = db.Connection();
    	int id_up = TableTwo.getSelectionModel().getSelectedItem().getId();
    	String sql = "update employee set name = '" + tf_name.getText() + "', last = '" + tf_last.getText() + "', salary = " + tf_salary.getText() + " where id = " + id_up + ";";
    	PreparedStatement ps = conn.prepareStatement(sql);
    	ps.executeUpdate();
     	tf_name.clear();
    	tf_last.clear();
    	tf_salary.clear();
    	grid_panel.setDisable(true);
    	btn_update.setDisable(true);
    	btnSelectAction(event);
    }

    @FXML
    void initialize(){
    	db = new DBConnector();
    }
    
}
