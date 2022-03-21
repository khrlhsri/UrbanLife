package UrbanLife;

import javafx.animation.Animation;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class moveUp extends Pane{
	
	Color skinColour = Color.rgb(255, 238, 214);
	Color characterStroke = Color.rgb(110, 104, 89);
	
	//A being pressed 
	Circle W_head;
	Line W_maskLine, W_vestLine1, W_vestLine2;
	Rectangle W_capFrontPanel, W_hair, W_body, 
				W_LeftHand, W_LeftShirtSleeve,
				W_RightHand, W_RightShirtSleeve,
				W_RightLeg, W_LeftLeg;
			
	Group W_grpHead = new Group();
	Group W_grpBody = new Group();
	Group W_grpRLeg = new Group();
	Group W_grpLLeg = new Group();
	Group W_grpRHand = new Group();	// Group Right Hand
	Group W_grpLHand = new Group();	// Group Left Hand
	
	boolean LegUpward = false;
	
	public moveUp() {
		
//------Drawing Head----------------------------------------------------------------
		W_head = new Circle (20, 660, 12);
		W_head.setFill(skinColour);
		W_head.setStroke(characterStroke);
		
		W_hair = new Rectangle(9, 645, 22, 24);
		W_hair.setArcWidth(100);
		W_hair.setArcHeight(21);
		
		W_maskLine = new Line(9, 663, 31, 663);
		W_maskLine.setStroke(Color.WHITE);
		W_maskLine.setStrokeWidth(2);
		
		W_capFrontPanel = new Rectangle(9, 642, 22, 15);
		W_capFrontPanel.setArcWidth(100);
		W_capFrontPanel.setArcHeight(5);
		W_capFrontPanel.setFill(Color.rgb(51, 204, 51));
		W_capFrontPanel.setStroke(Color.rgb(102, 102, 102));
		
		W_grpHead.getChildren().addAll(W_head, W_hair, W_capFrontPanel, W_maskLine);

//------Drawing Body----------------------------------------------------------------
		W_body = new Rectangle(10, 672, 20, 28);
		W_body.setArcWidth(20);
		W_body.setArcHeight(10);
		W_body.setFill(Color.rgb(144, 231, 115));
		W_body.setStroke(Color.rgb(102, 102, 102));
		W_body.setStrokeWidth(0.5);
		
		W_vestLine1 = new Line(10, 686, 30, 686);
		W_vestLine1.setStrokeWidth(2);
		W_vestLine1.setStroke(Color.rgb(242, 242, 242));
		
		W_vestLine2 = new Line(10, 690, 30, 690);
		W_vestLine2.setStrokeWidth(2);
		W_vestLine2.setStroke(Color.rgb(242, 242, 242));
			
		W_grpBody.getChildren().addAll(W_body, W_vestLine1, W_vestLine2);
		
//------Drawing Hand--------------------------------------------------------------
		//--Right shirt sleeve--
		W_RightShirtSleeve = new Rectangle(5, 676, 5, 10);
		W_RightShirtSleeve.setFill(Color.rgb(148, 240, 117));
		W_RightShirtSleeve.setStroke(Color.rgb(102, 102, 102));
		W_RightShirtSleeve.setStrokeWidth(0.5);
				
		//--Right Hand--
		W_RightHand = new Rectangle(5, 684, 5, 10);
		W_RightHand.setFill(skinColour);
		W_RightHand.setStroke(characterStroke);
		W_RightHand.setStrokeWidth(0.5);
				
		W_grpRHand.getChildren().addAll(W_RightHand, W_RightShirtSleeve);
				
		//--Left shirt sleeve--
		W_LeftShirtSleeve = new Rectangle(30, 676, 5, 10);
		W_LeftShirtSleeve.setFill(Color.rgb(148, 240, 117));
		W_LeftShirtSleeve.setStroke(characterStroke);
		W_LeftShirtSleeve.setStrokeWidth(0.5);
				
		//--Left Hand--
		W_LeftHand = new Rectangle(30, 684, 5, 10);
		W_LeftHand.setFill(skinColour);
		W_LeftHand.setStroke(characterStroke);
		W_LeftHand.setStrokeWidth(0.5);
				
		W_grpLHand.getChildren().addAll(W_LeftHand, W_LeftShirtSleeve);
		
//------Drawing Leg--------------------------------------------------------------
		//--Right Leg--
		W_RightLeg = new Rectangle(12, 695, 8, 19);
		W_RightLeg.setArcWidth(5);
		W_RightLeg.setArcHeight(5);
		W_RightLeg.setFill(Color.rgb(25, 28, 39));
		W_RightLeg.setStroke(characterStroke);
		W_RightLeg.setStrokeWidth(0.5);
				
		W_grpRLeg.getChildren().addAll(W_RightLeg);
				
		//--Right Leg--
		W_LeftLeg = new Rectangle(20, 695, 8, 19);
		W_LeftLeg.setArcWidth(5);
		W_LeftLeg.setArcHeight(5);
		W_LeftLeg.setFill(Color.rgb(25, 28, 39));
		W_LeftLeg.setStroke(characterStroke);
		W_LeftLeg.setStrokeWidth(0.5);
						
		W_grpLLeg.getChildren().addAll(W_LeftLeg);
		
		this.getChildren().addAll(W_grpRLeg, W_grpLLeg, W_grpBody, W_grpRHand, W_grpLHand, W_grpHead);
	}
	
	public void moveUpAnimation() {
		if (LegUpward == true) {
			W_grpLLeg.setLayoutY(W_grpLLeg.getLayoutY() - 2);
			W_grpRLeg.setLayoutY(W_grpRLeg.getLayoutY() + 2);
			LegUpward = false;
		}
		else {
			W_grpLLeg.setLayoutY(W_grpLLeg.getLayoutY() + 2);
			W_grpRLeg.setLayoutY(W_grpRLeg.getLayoutY() - 2);
			LegUpward = true;
		}
	}
}

