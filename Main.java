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
	final static int defaultPostionX = 250;
	final static int defaultPostionY = 20;
	
	boolean Paper1, Paper2, Paper3,
			Bottle1, Bottle2, Bottle3 = false;
	
	double orgSceneX, orgSceneY;
	
	public static void main(String[]args) {
		launch(args);
	}
	
	@Override
	public void start(Stage arg0) throws Exception {
		
		Image icon = new Image("icon.png");
		Pane city = new Pane();
		
		Nature nature = new Nature(); 			//Nature
		Bird bird = new Bird(); 				//Bird
		rubbish Rubbish = new rubbish();		//Rubbish
		Buildings buildings = new Buildings();	//Buildings
		Tree tree = new Tree();					//Trees
		Bottom bottom = new Bottom();			//Bottom
		
		/*---------------------------
				Character
		---------------------------*/
		Character character = new Character(); 	//Character Stay
		character.setLayoutX(defaultPostionX);
		character.setLayoutY(defaultPostionY);
		character.setVisible(true);
		
		moveLeft leftMove = new moveLeft(); 	//Character move to the left
		leftMove.setLayoutX(defaultPostionX);
		leftMove.setLayoutY(defaultPostionY);
		leftMove.setVisible(false);
		
		moveRight rightMove = new moveRight();	//Character move to the right
		rightMove.setLayoutX(defaultPostionX);
		rightMove.setLayoutY(defaultPostionY);
		rightMove.setVisible(false);
		
		moveDown downMove = new moveDown();		//Character move downward
		downMove.setLayoutX(defaultPostionX);
		downMove.setLayoutY(defaultPostionY);
		downMove.setVisible(false);
		
		moveUp upMove = new moveUp();			//Character move upward
		upMove.setLayoutX(defaultPostionX);
		upMove.setLayoutY(defaultPostionY);
		upMove.setVisible(false);
		
		city.getChildren().addAll(nature, buildings, bottom, tree, Rubbish, bird,
									leftMove, rightMove, upMove, downMove, character);
		
		//Creating Scene
		Scene scene = new Scene(city, WIDTH, HEIGHT, Color.rgb(210, 240, 252));
		
		/*---------------------------
			Character movement
		---------------------------*/
		scene.setOnKeyPressed(e ->{
//		=========================================================================================
//		|							Character move to the left									|
//		=========================================================================================
			if (e.getCode() == KeyCode.A) {
				leftMove.moveLeftAnimation();
				character.setLayoutX(character.getLayoutX() - 5);
				character.setLayoutY(character.getLayoutY());
				leftMove.setLayoutX(character.getLayoutX() - 5);
				leftMove.setLayoutY(character.getLayoutY());
					if(character.getLayoutX() < 0) {
						character.setLayoutX(5);
					}
				character.setVisible(false);
				rightMove.setVisible(false);
				downMove.setVisible(false);
				upMove.setVisible(false);
				leftMove.setVisible(true);
				
				// Left Move intersect with Paper1, Paper2, Paper3
				if (Paper1 == false) {
					if (leftMove.getBoundsInParent().intersects(Rubbish.grpRP1.getBoundsInParent())) {
						System.out.println("You pick up a Paper1");
						Rubbish.grpRP1.setVisible(false);
						Paper1 = true;
					}
				}
				if (Paper2 == false) {
					if(leftMove.getBoundsInParent().intersects(Rubbish.grpRP2.getBoundsInParent())) {
						System.out.println("You pick up a Paper2");
						Rubbish.grpRP2.setVisible(false);
						Paper2 = true;
					}
				}
				if (Paper3 == false) {
					if(leftMove.getBoundsInParent().intersects(Rubbish.grpRP3.getBoundsInParent())) {
						System.out.println("You pick up a Paper3");
						Rubbish.grpRP3.setVisible(false);
						Paper3 = true;
					}
				}
				// Left Move intersect with Red Bottle, Blue Bottle, Green Bottle
				if (Bottle1 == false) {
					if (leftMove.getBoundsInParent().intersects(Rubbish.grpRBottle1.getBoundsInParent())) {
						System.out.println("You pick up a Red Bottle");
						Rubbish.grpRBottle1.setVisible(false);
						Bottle1 = true;
					}
				}
				if (Bottle2 == false) {
					if(leftMove.getBoundsInParent().intersects(Rubbish.grpRBottle2.getBoundsInParent())) {
						System.out.println("You pick up a Blue Bottle");
						Rubbish.grpRBottle2.setVisible(false);
						Bottle2 = true;
					}
				}
				if (Bottle3 == false) {
					if(leftMove.getBoundsInParent().intersects(Rubbish.grpRBottle3.getBoundsInParent())) {
						System.out.println("You pick up a Green Bottle");
						Rubbish.grpRBottle3.setVisible(false);
						Bottle3 = true;
					}
				}
			} 
//			=========================================================================================
//			|							Character move to the Right									|
//			=========================================================================================
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
				
				// Right Move intersect with Paper1, Paper2, Paper3
				if (Paper1 == false) {
					if (rightMove.getBoundsInParent().intersects(Rubbish.grpRP1.getBoundsInParent())) {
						System.out.println("You pick up a Paper1");
						Rubbish.grpRP1.setVisible(false);
						Paper1 = true;
					}
				}
				if (Paper2 == false) {
					if(rightMove.getBoundsInParent().intersects(Rubbish.grpRP2.getBoundsInParent())) {
						System.out.println("You pick up a Paper2");
						Rubbish.grpRP2.setVisible(false);
						Paper2 = true;
					}
				}
				if (Paper3 == false) {
					if(rightMove.getBoundsInParent().intersects(Rubbish.grpRP3.getBoundsInParent())) {
						System.out.println("You pick up a Paper3");
						Rubbish.grpRP3.setVisible(false);
						Paper3 = true;
					}
				}
				// Right Move intersect with Red Bottle, Blue Bottle, Green Bottle
				if (Bottle1 == false) {
					if (rightMove.getBoundsInParent().intersects(Rubbish.grpRBottle1.getBoundsInParent())) {
						System.out.println("You pick up a Red Bottle");
						Rubbish.grpRBottle1.setVisible(false);
						Bottle1 = true;
					}
				}
				if (Bottle2 == false) {
					if(rightMove.getBoundsInParent().intersects(Rubbish.grpRBottle2.getBoundsInParent())) {
						System.out.println("You pick up a Blue Bottle");
						Rubbish.grpRBottle2.setVisible(false);
						Bottle2 = true;
					}
				}
				if (Bottle3 == false) {
					if(rightMove.getBoundsInParent().intersects(Rubbish.grpRBottle3.getBoundsInParent())) {
						System.out.println("You pick up a Green Bottle");
						Rubbish.grpRBottle3.setVisible(false);
						Bottle3 = true;
					}
				}
			}
//			=========================================================================================
//			|								Character move Down										|
//			=========================================================================================
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
				
//				Code Start here
				// Down Move intersect with Paper1, Paper2, Paper3
				if (Paper1 == false) {
					if (downMove.getBoundsInParent().intersects(Rubbish.grpRP1.getBoundsInParent())) {
						System.out.println("You pick up a Paper1");
						Rubbish.grpRP1.setVisible(false);
						Paper1 = true;
					}
				}
				if (Paper2 == false) {
					if(downMove.getBoundsInParent().intersects(Rubbish.grpRP2.getBoundsInParent())) {
						System.out.println("You pick up a Paper2");
						Rubbish.grpRP2.setVisible(false);
						Paper2 = true;
					}
				}
				if (Paper3 == false) {
					if(downMove.getBoundsInParent().intersects(Rubbish.grpRP3.getBoundsInParent())) {
						System.out.println("You pick up a Paper3");
						Rubbish.grpRP3.setVisible(false);
						Paper3 = true;
					}
				}
				// Down Move intersect with Red Bottle, Blue Bottle, Green Bottle
				if (Bottle1 == false) {
					if (downMove.getBoundsInParent().intersects(Rubbish.grpRBottle1.getBoundsInParent())) {
						System.out.println("You pick up a Red Bottle");
						Rubbish.grpRBottle1.setVisible(false);
						Bottle1 = true;
					}
				}
				if (Bottle2 == false) {
					if(downMove.getBoundsInParent().intersects(Rubbish.grpRBottle2.getBoundsInParent())) {
						System.out.println("You pick up a Blue Bottle");
						Rubbish.grpRBottle2.setVisible(false);
						Bottle2 = true;
					}
				}
				if (Bottle3 == false) {
					if(downMove.getBoundsInParent().intersects(Rubbish.grpRBottle3.getBoundsInParent())) {
						System.out.println("You pick up a Green Bottle");
						Rubbish.grpRBottle3.setVisible(false);
						Bottle3 = true;
					}
				}
			}
//			=========================================================================================
//			|								Character move Up										|
//			=========================================================================================
			else if (e.getCode() == KeyCode.W) {
				upMove.moveUpAnimation();
				System.out.println("X: " + upMove.getLayoutX());
				System.out.println("Y: " + upMove.getLayoutY() + "\n");
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
				
				// Up Move intersect with Paper1, Paper2, Paper3
				if (Paper1 == false) {
					if (upMove.getBoundsInParent().intersects(Rubbish.grpRP1.getBoundsInParent())) {
						System.out.println("You pick up a Paper1");
						Rubbish.grpRP1.setVisible(false);
						Paper1 = true;
					}
				}
				if (Paper2 == false) {
					if(upMove.getBoundsInParent().intersects(Rubbish.grpRP2.getBoundsInParent())) {
						System.out.println("You pick up a Paper2");
						Rubbish.grpRP2.setVisible(false);
						Paper2 = true;
					}
				}
				if (Paper3 == false) {
					if(upMove.getBoundsInParent().intersects(Rubbish.grpRP3.getBoundsInParent())) {
						System.out.println("You pick up a Paper3");
						Rubbish.grpRP3.setVisible(false);
						Paper3 = true;
					}
				}
				// Up Move intersect with Red Bottle, Blue Bottle, Green Bottle
				if (Bottle1 == false) {
					if (upMove.getBoundsInParent().intersects(Rubbish.grpRBottle1.getBoundsInParent())) {
						System.out.println("You pick up a Red Bottle");
						Rubbish.grpRBottle1.setVisible(false);
						Bottle1 = true;
					}
				}
				if (Bottle2 == false) {
					if(upMove.getBoundsInParent().intersects(Rubbish.grpRBottle2.getBoundsInParent())) {
						System.out.println("You pick up a Blue Bottle");
						Rubbish.grpRBottle2.setVisible(false);
						Bottle2 = true;
					}
				}
				if (Bottle3 == false) {
					if(upMove.getBoundsInParent().intersects(Rubbish.grpRBottle3.getBoundsInParent())) {
						System.out.println("You pick up a Green Bottle");
						Rubbish.grpRBottle3.setVisible(false);
						Bottle3 = true;
					}
				}
				if ((upMove.getLayoutX() == 295.0) && (upMove.getLayoutY() == 2.0)) {
					if ((Paper1 == true) && (Paper2 == true) && (Paper3 == true) && (Bottle1 == true) && (Bottle2 == true) && (Bottle3 == true)){
						System.out.println("BAH, TUTUP TIA BENDA ANI");
						upMove.getChildren().remove(upMove.GarbageBagU);
						character.getChildren().remove(character.GarbageBagC);
						downMove.getChildren().remove(downMove.GarbageBagD);
						leftMove.getChildren().remove(leftMove.GarbageBagL);
						rightMove.getChildren().remove(rightMove.GarbageBagR);
											}
				} else {
					System.out.println("Kutip dulu semua sampah");
				}
			}
		});
		
		scene.setOnKeyReleased(e ->{
			// Character released A key
			if (e.getCode() == KeyCode.A) {
				leftMove.setVisible(false);
				rightMove.setVisible(false);
				downMove.setVisible(false);
				upMove.setVisible(false);
				character.setVisible(true);
			}
			// Character released D key
			else if (e.getCode() == KeyCode.D) {
				leftMove.setVisible(false);
				rightMove.setVisible(false);
				downMove.setVisible(false);
				upMove.setVisible(false);
				character.setVisible(true);
			}
			// Character released S key
			else if (e.getCode() == KeyCode.S) {
				leftMove.setVisible(false);
				rightMove.setVisible(false);
				downMove.setVisible(false);
				upMove.setVisible(false);
				character.setVisible(true);
			}
			// Character released W key
			else if (e.getCode() == KeyCode.S) {
				leftMove.setVisible(false);
				rightMove.setVisible(false);
				downMove.setVisible(false);
				upMove.setVisible(false);
				character.setVisible(true);
			}
		});
		
		/*---------------------------
				Bird movement
		---------------------------*/
		bird.setOnMousePressed(e -> {
			orgSceneX = e.getSceneX();
			orgSceneY = e.getSceneY();
		});
		
		bird.setOnMouseReleased(e -> {
			bird.stopMoveWing();
			System.out.println("OffsetX: " + e.getSceneX());
		});
		
		bird.setOnMouseDragged(e -> {
			bird.moveWing();
			double offSetX = e.getSceneX() - orgSceneX;
			double offSetY = e.getSceneY() - orgSceneY;
			
			Bird b = (Bird) e.getSource();
			b.setLayoutX(b.getLayoutX() + offSetX);
			b.setLayoutY(b.getLayoutY() + offSetY);
			
			orgSceneX = e.getSceneX();
			orgSceneY = e.getSceneY();
		});
		
		arg0.setTitle("Urban Life");		// Set Window Title
		arg0.getIcons().add(icon);			// Set Window Icon
		arg0.setResizable(false);			// Set Window Resizable to False
		
		arg0.setScene(scene);
		arg0.show();
	}

}
