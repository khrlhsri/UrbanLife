package UrbanLife;

import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.PathTransition;
import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.scene.Group;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class Bird extends Pane{
	
	public Polygon bWingT;
	public Circle bWingC;
	boolean wingMovement = false;
	Group Wings;
	RotateTransition rotating;
	
	public Bird() {

		/*
		---------------------
			Drawing Bird
		--------------------- 
		 */
		Pane bird = new Pane ();
		
//------ Drawing Head, eye, beak, eye line ----------------------------------------------------------------
		Circle bHead = new Circle(198, 208, 8);
		bHead.setFill(Color.rgb(255, 77, 77));
		bHead.setStroke(Color.rgb(200, 0, 0));
		
		Circle bEye1 = new Circle(200, 206, 4);
		bEye1.setFill(Color.WHITE);
				
		Circle bEye2 = new Circle(201, 206, 2); 
		bEye2.setFill(Color.BLACK);
				
		Ellipse bBeak = new Ellipse(205,210,5,2);
		bBeak.setFill(Color.rgb(255, 255, 255));
		bBeak.setStroke(Color.rgb(200, 0, 0));
				
		Line bEyeLine = new Line(198, 202, 204, 203);

//------ Drawing Body ----------------------------------------------------------------		
		Ellipse bBody = new Ellipse(190, 220, 14, 8);
		bBody.setFill(Color.rgb(255, 26, 26));
		bBody.setStroke(Color.rgb(200, 0, 0));
		bBody.setRotate(165);

//------ Drawing Wing ----------------------------------------------------------------
		bWingC = new Circle(190, 215, 5);
		bWingC.setFill(Color.rgb(255, 230, 230));
		
		bWingT = new Polygon(
				178.0, 225,	//1
				187.0, 210,	//2
				191.0, 220  //3
				);
		bWingT.setFill(Color.rgb(255, 230, 230));
		
		Wings = new Group();
		Wings.getChildren().addAll(bWingT, bWingC);

//------ Drawing Leg ----------------------------------------------------------------
		Line Leg1 = new Line(187, 230, 187, 233);
		Leg1.setStrokeWidth(3);
		
		Line Leg2 = new Line(190, 228, 190, 232);
		Leg1.setStrokeWidth(3);
				
		bird.getChildren().addAll(bBody, Leg2, Leg1, bHead, bEye1, bEye2, bBeak, bEyeLine, Wings);
		bird.setLayoutX(-65);
		bird.setLayoutY(386);
		
		this.getChildren().addAll(bird);

//------ Animate Wing Movement ----------------------------------------------------------------
		rotating = new RotateTransition();
		rotating.setNode(Wings);
		rotating.setDuration(Duration.millis(2));
		rotating.setCycleCount(TranslateTransition.INDEFINITE);
		rotating.setInterpolator(Interpolator.LINEAR);
			rotating.setAxis(Rotate.X_AXIS);
			rotating.setAutoReverse(true);
	}
	
	public void moveWing() {
		rotating.setFromAngle(0);
		rotating.setToAngle(200);
		rotating.play();
	}
	
	public void stopMoveWing() {
		rotating.stop();
		rotating.setFromAngle(0);
		rotating.setToAngle(0);
	}
}
