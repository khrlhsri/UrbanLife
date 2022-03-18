package UrbanLife;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class Nature extends Pane{
	
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
		
		Pane cloudFront3 = new Pane();
		
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
		
		Pane cloudBack = new Pane();
		
		Circle CloudB1C1 = new Circle();
		Circle CloudB1C2 = new Circle();
		Circle CloudB1C3 = new Circle();
		Circle CloudB1C4 = new Circle();
		Circle CloudB1C5 = new Circle();
		Circle CloudB1C6 = new Circle();
		
		cloudBack.getChildren().addAll(CloudB1C1, CloudB1C2, CloudB1C3, CloudB1C4, CloudB1C5, CloudB1C6);
		
		this.getChildren().addAll(cloudBack, hill, cloudFront1, cloudFront2, cloudFront3);
	}
}
