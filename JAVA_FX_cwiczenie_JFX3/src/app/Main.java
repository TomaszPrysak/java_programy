package app;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage stageLogin) throws Exception {
		Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/app/view/LoginView.fxml"));
		Scene sceneLogin = new Scene(parent);
		stageLogin.setScene(sceneLogin);
		stageLogin.setTitle("LoginView");
		stageLogin.setResizable(false);
		stageLogin.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
