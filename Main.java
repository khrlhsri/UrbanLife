package UrbanLife;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;

public class Main extends Application {

	final int WIDTH = 850;
	final int HEIGHT = 800;
	final static int defaultPostionX = 800;
	final static int defaultPostionY = 20;
	
	public static void main(String[]args) {
		launch(args);
	}
	
	@Override
	public void start(Stage arg0) throws Exception {
		
		Image icon = new Image("icon.png");
		Pane city = new Pane();
		
		//Nature
		Nature nature = new Nature();
		
		//Buildings
		Buildings buildings = new Buildings();
		
		//Trees
		Tree tree = new Tree();	
		
		//Character & movement
		Character character = new Character(); //Character Stay
		character.setLayoutX(defaultPostionX);
		character.setLayoutY(defaultPostionY);
		character.setVisible(true);
		
		moveLeft leftMove = new moveLeft(); //Character move to the left
		leftMove.setLayoutX(defaultPostionX);
		leftMove.setLayoutY(defaultPostionY);
		leftMove.setVisible(false);
		
		moveRight rightMove = new moveRight(); //Character move to the right
		rightMove.setLayoutX(defaultPostionX);
		rightMove.setLayoutY(defaultPostionY);
		rightMove.setVisible(false);
		
		moveDown downMove = new moveDown(); //Character move downward
		downMove.setLayoutX(defaultPostionX);
		downMove.setLayoutY(defaultPostionY);
		downMove.setVisible(false);
		
		moveUp upMove = new moveUp(); //Character move upward
		upMove.setLayoutX(defaultPostionX);
		upMove.setLayoutY(defaultPostionY);
		upMove.setVisible(false);
		
		//Bottom
		Bottom bottom = new Bottom();
		
		//Hint
		
		city.getChildren().addAll(nature, buildings, bottom, tree, character, 
									leftMove, rightMove, upMove, downMove);
		
		//Creating Window
		Scene scene = new Scene(city, WIDTH, HEIGHT, Color.rgb(210, 240, 252));
		
		//Character movement
		scene.setOnKeyPressed(e ->{
			if (e.getCode() == KeyCode.A) {
				leftMove.moveLeftAnimation();
				character.setLayoutX(character.getLayoutX() - 5);
				leftMove.setLayoutX(character.getLayoutX() - 5);
				leftMove.setLayoutY(character.getLayoutY());
				character.setLayoutY(character.getLayoutY());
					if(character.getLayoutX() < 0) {
						character.setLayoutX(5);
					}
				character.setVisible(false);
				rightMove.setVisible(false);
				downMove.setVisible(false);
				upMove.setVisible(false);
				leftMove.setVisible(true);
			} 
			else if (e.getCode() == KeyCode.D) {
				rightMove.moveRightAnimation();
				character.setLayoutX(character.getLayoutX() + 5);
				rightMove.setLayoutX(character.getLayoutX() + 5);
				rightMove.setLayoutY(character.getLayoutY());
				character.setLayoutY(character.getLayoutY());
					if(character.getLayoutX() > 815 ) {
						character.setLayoutX(809);
					}
				character.setVisible(false);
				leftMove.setVisible(false);
				downMove.setVisible(false);
				upMove.setVisible(false);
				rightMove.setVisible(true);
			}
			else if (e.getCode() == KeyCode.S) {
				downMove.moveDownAnimation();
				character.setLayoutY(character.getLayoutY() + 5);
				downMove.setLayoutY(character.getLayoutY() + 5);
				downMove.setLayoutX(character.getLayoutX());
				character.setLayoutX(character.getLayoutX());
					if(character.getLayoutY() > 79 ) {
						character.setLayoutY(76);
					}
				character.setVisible(false);
				leftMove.setVisible(false);
				rightMove.setVisible(false);
				upMove.setVisible(false);
				downMove.setVisible(true);
			}
			else if (e.getCode() == KeyCode.W) {
				upMove.moveUpAnimation();
				character.setLayoutY(character.getLayoutY() - 5);
				upMove.setLayoutY(character.getLayoutY() - 5);
				upMove.setLayoutX(character.getLayoutX());
				character.setLayoutX(character.getLayoutX());
					if(character.getLayoutY() < 8 ) {
						character.setLayoutY(12);
					}
				character.setVisible(false);
				leftMove.setVisible(false);
				rightMove.setVisible(false);
				downMove.setVisible(false);
				upMove.setVisible(true);
			}
		});
		
		scene.setOnKeyReleased(e ->{
			if (e.getCode() == KeyCode.A) {
				leftMove.setVisible(false);
				rightMove.setVisible(false);
				downMove.setVisible(false);
				upMove.setVisible(false);
				character.setVisible(true);
			}
			else if (e.getCode() == KeyCode.D) {
				leftMove.setVisible(false);
				rightMove.setVisible(false);
				downMove.setVisible(false);
				upMove.setVisible(false);
				character.setVisible(true);
			}
			else if (e.getCode() == KeyCode.S) {
				leftMove.setVisible(false);
				rightMove.setVisible(false);
				downMove.setVisible(false);
				upMove.setVisible(false);
				character.setVisible(true);
			}
			else if (e.getCode() == KeyCode.S) {
				leftMove.setVisible(false);
				rightMove.setVisible(false);
				downMove.setVisible(false);
				upMove.setVisible(false);
				character.setVisible(true);
			}
		});
		
		arg0.setTitle("Urban Life");
		arg0.getIcons().add(icon);
		arg0.setResizable(false);
		
		arg0.setScene(scene);
		arg0.show();
	}

}
