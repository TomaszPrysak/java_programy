package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	
	public Main(){
		System.out.println("Jestem w konstruktorze");
	}
	@Override
	public void init() throws Exception{
		System.out.println("Jestem w metodzie init");
	}
	@Override
	public void stop() throws Exception{
		System.out.println("Jestem w metodzie stop");
	}
	@Override
	public void start(Stage stage) throws Exception {
		Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/application/view/MainView.fxml")); //za³adowanie naszego pliku FXML stworzonoego na bazie SCene Buildera
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setTitle("First JavaFX App");
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
