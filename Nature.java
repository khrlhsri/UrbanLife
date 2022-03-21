package UrbanLife;

import javafx.util.Duration;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class Nature extends Pane{
	
	public Group grpCF1 = new Group();
	public Group grpCF2 = new Group();
	public Group grpCF3 = new Group();
	
	public Group grpCB1 = new Group();
	public Group grpCB2 = new Group();
	public Group grpCB3 = new Group();
	
	public Nature() {
		
		Color cloudColor = Color.rgb(248, 255, 255);
	
//Hill-----------------------------------------------------------
//--------Hill properties----------------------------------------
		Pane hill = new Pane(); //Store all Shapes
		
		Polygon Hill = new Polygon();
		Polygon Hill2 = new Polygon();
		
		Hill.getPoints().addAll(new Double[] {
			0.0, 405.0,
			100.0, 170.0,
			200.0, 300.0,
			280.0, 80.0,
			600.0, 340.0,
			560.0, 300.0,
			700.0, 510.0,
			800.0, 200.0,
			850.0, 340.0,
			850.0, 600.0,
			500.0, 670.0,
			0.0, 670.0
		});
		Hill.setFill(Color.rgb(121, 224, 178));
		
		Hill2.getPoints().addAll(new Double[] {
				0.0, 420.0,
				100.0, 280.0,
				203.0, 330.0,
				330.0, 170.0,
				560.0, 342.0,
				560.0, 302.0,
				702.0, 600.0,
				805.0, 280.0,
				855.0, 390.0,
				854.0, 602.0,
				500.0, 670.0,
				0.0, 670.0
			});
		Hill2.setFill(Color.rgb(131, 199, 183));
		
		hill.getChildren().addAll(Hill, Hill2);
		
//Cloud-----------------------------------------------------------
//--------Cloud properties----------------------------------------
		
		// ----- Cloud 1 front --------------------------------------------------------------
		Pane cloudFront1 = new Pane(); 
		
		Circle CloudF1C1 = new Circle(60,100, 20);
		Circle CloudF1C2 = new Circle(115, 100, 20);
		Circle CloudF1C3 = new Circle(75, 85, 20);
		Circle CloudF1C4 = new Circle(100, 85, 20);
		Circle CloudF1C5 = new Circle(75, 115, 20);
		Circle CloudF1C6 = new Circle(100, 115, 20);
		
		CloudF1C1.setFill(cloudColor);
		CloudF1C2.setFill(cloudColor);
		CloudF1C3.setFill(cloudColor);
		CloudF1C4.setFill(cloudColor);
		CloudF1C5.setFill(cloudColor);
		CloudF1C6.setFill(cloudColor);
		
		cloudFront1.getChildren().addAll(CloudF1C1, CloudF1C2, CloudF1C3, CloudF1C4, CloudF1C5, CloudF1C6);
		grpCF1.getChildren().addAll(cloudFront1); // Group cloudFront1 shape/properties
		
		// ----- Cloud 2 front --------------------------------------------------------------
		Pane cloudFront2 = new Pane();
		
		Circle CloudF2C1 = new Circle(249, 150, 20);
		Circle CloudF2C2 = new Circle(310, 150, 20);
		Circle CloudF2C3 = new Circle(270, 135, 20);
		Circle CloudF2C4 = new Circle(292, 135, 20);
		Circle CloudF2C5 = new Circle(270, 165, 20);
		Circle CloudF2C6 = new Circle(292, 165, 20);
		
		CloudF2C1.setFill(cloudColor);
		CloudF2C2.setFill(cloudColor);
		CloudF2C3.setFill(cloudColor);
		CloudF2C4.setFill(cloudColor);
		CloudF2C5.setFill(cloudColor);
		CloudF2C6.setFill(cloudColor);
		
		cloudFront2.getChildren().addAll(CloudF2C1, CloudF2C2, CloudF2C3, CloudF2C4, CloudF2C5, CloudF2C6);
		
		grpCF2.getChildren().addAll(cloudFront2); // Group cloudFront2 shape/properties
		
		Pane cloudFront3 = new Pane(); // Cloud 3 front
		
		Circle CloudF3C1 = new Circle(540, 100, 20);
		Circle CloudF3C2 = new Circle(600, 100, 20);
		Circle CloudF3C3 = new Circle(557, 85, 20);
		Circle CloudF3C4 = new Circle(585, 85, 20);
		Circle CloudF3C5 = new Circle(557, 110, 20);
		Circle CloudF3C6 = new Circle(585, 110, 20);
		
		CloudF3C1.setFill(cloudColor);
		CloudF3C2.setFill(cloudColor);
		CloudF3C3.setFill(cloudColor);
		CloudF3C4.setFill(cloudColor);
		CloudF3C5.setFill(cloudColor);
		CloudF3C6.setFill(cloudColor);
		
		cloudFront3.getChildren().addAll(CloudF3C1, CloudF3C2, CloudF3C3, CloudF3C4, CloudF3C5, CloudF3C6);
		
		grpCF3.getChildren().addAll(cloudFront3); // Group cloudFront3 shape/properties
		
		Pane cloudBack1 = new Pane(); // Cloud 1 Back
		
		Circle CloudB1C1 = new Circle(30, 210, 20);
		Circle CloudB1C2 = new Circle(90, 210, 20);
		Circle CloudB1C3 = new Circle(48, 194, 20);
		Circle CloudB1C4 = new Circle(74, 194, 20);
		Circle CloudB1C5 = new Circle(48, 220, 20);
		Circle CloudB1C6 = new Circle(74, 220, 20);
		
		CloudB1C1.setFill(cloudColor);
		CloudB1C2.setFill(cloudColor);
		CloudB1C3.setFill(cloudColor);
		CloudB1C4.setFill(cloudColor);
		CloudB1C5.setFill(cloudColor);
		CloudB1C6.setFill(cloudColor);
		
		cloudBack1.getChildren().addAll(CloudB1C1, CloudB1C2, CloudB1C3, CloudB1C4, CloudB1C5, CloudB1C6);
		
		grpCB1.getChildren().addAll(cloudBack1); // Group cloudBack1 shape/properties
		
		Pane cloudBack2 = new Pane(); // Cloud 2 Back
		
		Circle CloudB2C1 = new Circle(470, 240, 20);
		Circle CloudB2C2 = new Circle(540, 240, 20);
		Circle CloudB2C3 = new Circle(490, 224, 20);
		Circle CloudB2C4 = new Circle(520, 224, 20);
		Circle CloudB2C5 = new Circle(490, 250, 20);
		Circle CloudB2C6 = new Circle(520, 250, 20);
		
		CloudB2C1.setFill(cloudColor);
		CloudB2C2.setFill(cloudColor);
		CloudB2C3.setFill(cloudColor);
		CloudB2C4.setFill(cloudColor);
		CloudB2C5.setFill(cloudColor);
		CloudB2C6.setFill(cloudColor);
		
		cloudBack2.getChildren().addAll(CloudB2C1, CloudB2C2, CloudB2C3, CloudB2C4, CloudB2C5, CloudB2C6);
		
		grpCB2.getChildren().addAll(cloudBack2); // Group cloudBack1 shape/properties
		
		Pane cloudBack3 = new Pane(); // Cloud 3 Back
		
		Circle CloudB3C1 = new Circle(750, 160, 20);
		Circle CloudB3C2 = new Circle(820, 160, 20);
		Circle CloudB3C3 = new Circle(770, 148, 20);
		Circle CloudB3C4 = new Circle(800, 148, 20);
		Circle CloudB3C5 = new Circle(772, 170, 20);
		Circle CloudB3C6 = new Circle(798, 170, 20);
		
		CloudB3C1.setFill(cloudColor);
		CloudB3C2.setFill(cloudColor);
		CloudB3C3.setFill(cloudColor);
		CloudB3C4.setFill(cloudColor);
		CloudB3C5.setFill(cloudColor);
		CloudB3C6.setFill(cloudColor);
		
		cloudBack3.getChildren().addAll(CloudB3C1, CloudB3C2, CloudB3C3, CloudB3C4, CloudB3C5, CloudB3C6);
		
		grpCB3.getChildren().addAll(cloudBack3); // Group cloudBack1 shape/properties
		
		this.getChildren().addAll(grpCB1, grpCB2, grpCB3, hill, grpCF1, grpCF2, grpCF3);
		
//	ANIMATE CLOUD
		
		Timeline animateCloudFront1_2_3 = new Timeline(new KeyFrame(Duration.millis(70), e -> {
			grpCF1.setLayoutX(grpCF1.getLayoutX() + 1.5);
				if (grpCF1.getLayoutX() > 800) {
					grpCF1.setLayoutX(-100);
					grpCF1.setLayoutX(grpCF1.getLayoutX() + 2);
				}
				
			grpCF2.setLayoutX(grpCF2.getLayoutX() + 2.5);
				if (grpCF2.getLayoutX() > 700) {
					grpCF2.setLayoutX(-550);
					grpCF2.setLayoutX(grpCF2.getLayoutX() + 3);
				}
				
			grpCF3.setLayoutX(grpCF3.getLayoutX() + 2.5);
				if (grpCF3.getLayoutX() > 350) {
					grpCF3.setLayoutX(-900);
					grpCF3.setLayoutX(grpCF3.getLayoutX() + 3);
				}
		}));
		
		animateCloudFront1_2_3.setCycleCount(Timeline.INDEFINITE);
		animateCloudFront1_2_3.play();
		
		Timeline animateCloudBack1_2_3 = new Timeline(new KeyFrame(Duration.millis(30), e -> {
			grpCB1.setLayoutX(grpCB1.getLayoutX() + 2);
				if (grpCB1.getLayoutX() > 850) {
					grpCB1.setLayoutX(-300);
					grpCB1.setLayoutX(grpCB1.getLayoutX() + 2);
				}
				
			grpCB2.setLayoutX(grpCB2.getLayoutX() + 2.5);
				if (grpCB2.getLayoutX() > 850) {
					grpCB2.setLayoutX(-550);
					grpCB2.setLayoutX(grpCB2.getLayoutX() + 3);
				}
				
			grpCB3.setLayoutX(grpCB3.getLayoutX() + 2.5);
				if (grpCB3.getLayoutX() > 200) {
					grpCB3.setLayoutX(-890);
					grpCB3.setLayoutX(grpCB3.getLayoutX() + 3);
				}
		}));
		
		animateCloudBack1_2_3.setCycleCount(Timeline.INDEFINITE);
		animateCloudBack1_2_3.play();
	}
}
