package UrbanLife;

import javafx.util.Duration;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class rubbish extends Pane {
	
	//rubbish bin
	Group grpRB1 = new Group();
	
	//paper group 1-4
	Group grpRP1 = new Group();
	Group grpRP2 = new Group();
	Group grpRP3 = new Group();
	Group grpRP4 = new Group();
	
	Group grpRBottle1 = new Group();
	Group grpRBottle2 = new Group();
	Group grpRBottle3 = new Group();
	
	public rubbish() {
		// Drawing Rubbish Bin
		Pane publicRubbishBin = new Pane();
		
		Rectangle RB1Body = new Rectangle(300, 670, 30, 40);
		RB1Body.setFill(Color.rgb(70, 185, 131));
		RB1Body.setStroke(Color.rgb(100, 100, 100));
		RB1Body.setArcWidth(10);
		RB1Body.setArcHeight(10);
		
		Rectangle RB1Hole = new Rectangle(305, 675, 20, 10);
		RB1Hole.setFill(Color.rgb(237, 230, 222));
		RB1Hole.setStroke(Color.rgb(70, 70, 70));
		RB1Hole.setArcWidth(5);
		RB1Hole.setArcHeight(4);
		
		Line RB1LegR = new Line(308, 710, 308, 715);
		RB1LegR.setStrokeWidth(5);
		Line RB1LegL = new Line(322, 710, 322, 715);
		RB1LegL.setStrokeWidth(5);
		
		grpRB1.getChildren().addAll(RB1LegR, RB1LegL, RB1Body, RB1Hole);
		
		/*----------------
		  Drawing Rubbish
		------------------*/
		// Paper 1
		Polygon RPaper1 = new Polygon(
				4.0, 22.0, //1
				14.0, 27.0, //2
				22.0, 25.0, //3
				31.0, 27.0, //4
				40.0, 18.0, //5
				28.0, 12.0, //6
				17.0, 15.0, //7
				8.0, 10.0 //last
				);
		RPaper1.setFill(Color.WHITE);
		RPaper1.setStroke(Color.BLACK);
		
		grpRP1.getChildren().addAll(RPaper1);
		grpRP1.setLayoutX(10);
		grpRP1.setLayoutY(705);
		
		// Paper 2
		Polygon RPaper2 = new Polygon(
				4.0, 22.0, //1
				14.0, 27.0, //2
				22.0, 25.0, //3
				31.0, 27.0, //4
				40.0, 18.0, //5
				28.0, 12.0, //6
				17.0, 15.0, //7
				8.0, 10.0 //last
				);
		RPaper2.setFill(Color.WHITE);
		RPaper2.setStroke(Color.BLACK);
				
		grpRP2.getChildren().addAll(RPaper2);
		grpRP2.setLayoutX(140);
		grpRP2.setLayoutY(750);
		
		// Paper 3
		Polygon RPaper3 = new Polygon(
				4.0, 22.0, //1
				14.0, 27.0, //2
				22.0, 25.0, //3
				31.0, 27.0, //4
				40.0, 18.0, //5
				28.0, 12.0, //6
				17.0, 15.0, //7
				8.0, 10.0 //last
				);
		RPaper3.setFill(Color.WHITE);
		RPaper3.setStroke(Color.BLACK);
						
		grpRP3.getChildren().addAll(RPaper3);
		grpRP3.setLayoutX(300);
		grpRP3.setLayoutY(760);
		
		// Red Bottle
		Rectangle RB1B1 = new Rectangle(20, 40, 9, 17);
		RB1B1.setFill(Color.WHITE);
		RB1B1.setStroke(Color.BLACK);
		RB1B1.setArcWidth(4);
		RB1B1.setArcHeight(2);
		
		Rectangle RB1B2 = new Rectangle(22, 33, 5, 9);
		RB1B2.setFill(Color.WHITE);
		RB1B2.setStroke(Color.BLACK);
		RB1B2.setArcWidth(2);
		RB1B2.setArcHeight(1);
		
		Rectangle RB1BCover = new Rectangle(20, 44, 9, 9);
		RB1BCover.setFill(Color.rgb(255, 51, 51));
		RB1BCover.setStroke(Color.BLACK);
								
		grpRBottle1.getChildren().addAll(RB1B2, RB1B1, RB1BCover);
		grpRBottle1.setLayoutX(430);
		grpRBottle1.setLayoutY(740);
		grpRBottle1.setRotate(30);
		
		// Blue Bottle
		Rectangle RB2B1 = new Rectangle(20, 40, 9, 17);
		RB2B1.setFill(Color.WHITE);
		RB2B1.setStroke(Color.BLACK);
		RB2B1.setArcWidth(4);
		RB2B1.setArcHeight(2);
				
		Rectangle RB2B2 = new Rectangle(22, 33, 5, 9);
		RB2B2.setFill(Color.WHITE);
		RB2B2.setStroke(Color.BLACK);
		RB2B2.setArcWidth(2);
		RB2B2.setArcHeight(1);
				
		Rectangle RB2BCover = new Rectangle(20, 44, 9, 9);
		RB2BCover.setFill(Color.rgb(0, 102, 255));
		RB2BCover.setStroke(Color.BLACK);
		
		grpRBottle2.getChildren().addAll(RB2B2, RB2B1, RB2BCover);
		grpRBottle2.setLayoutX(608);
		grpRBottle2.setLayoutY(720);
		grpRBottle2.setRotate(-30);
		
		// Green Bottle
		Rectangle RB3B1 = new Rectangle(20, 40, 9, 17);
		RB3B1.setFill(Color.WHITE);
		RB3B1.setStroke(Color.BLACK);
						
		Rectangle RB3B2 = new Rectangle(22, 33, 5, 9);
		RB3B2.setFill(Color.WHITE);
		RB3B2.setStroke(Color.BLACK);
						
		Rectangle RB3BCover = new Rectangle(20, 44, 9, 9);
		RB3BCover.setFill(Color.rgb(26, 255, 26));
		RB3BCover.setStroke(Color.BLACK);
				
		grpRBottle3.getChildren().addAll(RB3B2, RB3B1, RB3BCover);
		grpRBottle3.setLayoutX(740);
		grpRBottle3.setLayoutY(691);
		grpRBottle3.setRotate(30);
		
		this.getChildren().addAll(grpRB1, grpRP1, grpRP2, grpRP3, grpRBottle1, grpRBottle2, grpRBottle3);
	}
}
