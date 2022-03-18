package UrbanLife;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;

public class Main extends Application {

	final int WIDTH = 850;
	final int HEIGHT = 800;
	
	public static void main(String[]args) {
		launch(args);
	}
	
	@Override
	public void start(Stage arg0) throws Exception {
		
//		Image icon = new Image("icon.png");
		Pane city = new Pane();
		
		//Nature
		Nature nature = new Nature();
		
		//Buildings
		Buildings buildings = new Buildings();
		
		//Character
		
		//Transportation
		
		//Hint
		
		city.getChildren().addAll(nature, buildings);
		
		//Creating Window
		Scene scene = new Scene(city, WIDTH, HEIGHT, Color.rgb(210, 240, 252));
		
		arg0.setTitle("Urban Life");
//		arg0.getIcons().add(icon);
		arg0.setResizable(false);
		
		arg0.setScene(scene);
		arg0.show();
	}

}
