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

public class moveDown extends Pane{
	
	Color skinColour = Color.rgb(255, 238, 214);
	Color characterStroke = Color.rgb(110, 104, 89);
	
	//A being pressed 
	Circle S_head, S_eye1, S_eye2;
	Line S_maskLine1, S_maskLine2, S_vestLine1, S_vestLine2, S_vestLine3;
	Rectangle S_capFrontPanel, S_capBill, S_mask, S_body, 
				S_LeftHand, S_LeftShirtSleeve,
				S_RightHand, S_RightShirtSleeve,
				S_RightLeg, S_LeftLeg;
			
	Group S_grpHead = new Group();
	Group S_grpBody = new Group();
	Group S_grpRLeg = new Group();
	Group S_grpLLeg = new Group();
	Group S_grpRHand = new Group();	// Group Right Hand
	Group S_grpLHand = new Group();	// Group Left Hand
	
	boolean LegDownward = false;
	
	public moveDown() {
		
//------Drawing Head----------------------------------------------------------------
		S_head = new Circle (20, 660, 12);
		S_head.setFill(skinColour);
		S_head.setStroke(characterStroke);
		
		S_eye1 = new Circle(15, 656, 2);
		S_eye1.setFill(Color.WHITE);
		S_eye1.setStroke(Color.BLACK);
		
		S_eye2 = new Circle(25, 656, 2);
		S_eye2.setFill(Color.WHITE);
		S_eye2.setStroke(Color.BLACK);
		
		S_mask = new Rectangle(12, 661, 15, 8);
		S_mask.setFill(Color.rgb(190, 244, 244));
		S_mask.setStroke(Color.rgb(125, 216, 217));
		
		S_maskLine1 = new Line(9, 659, 12, 665);
		S_maskLine1.setStroke(Color.WHITE);
		S_maskLine1.setStrokeWidth(2);
		
		S_maskLine2 = new Line(31, 659, 22, 665);
		S_maskLine2.setStroke(Color.WHITE);
		S_maskLine2.setStrokeWidth(2);
		
		S_capFrontPanel = new Rectangle(9, 642, 22, 12);
		S_capFrontPanel.setArcWidth(100);
		S_capFrontPanel.setArcHeight(5);
		S_capFrontPanel.setFill(Color.rgb(51, 204, 51));
		S_capFrontPanel.setStroke(Color.rgb(102, 102, 102));
		
		S_capBill = new Rectangle(12, 646, 15, 5);
		S_capBill.setFill(Color.YELLOW);
		S_capBill.setArcWidth(50);
		S_capBill.setArcHeight(2);
		S_capBill.setFill(Color.rgb(92, 214, 92));
		S_capBill.setStroke(Color.rgb(102, 102, 102));
		
		S_grpHead.getChildren().addAll(S_capFrontPanel, S_head, S_capBill, S_eye1, S_eye2, S_maskLine1, S_maskLine2, S_mask);

//------Drawing Body----------------------------------------------------------------
		S_body = new Rectangle(10, 672, 20, 28);
		S_body.setArcWidth(20);
		S_body.setArcHeight(10);
		S_body.setFill(Color.rgb(144, 231, 115));
		S_body.setStroke(Color.rgb(102, 102, 102));
		S_body.setStrokeWidth(0.5);
		
		S_vestLine1 = new Line(10, 686, 30, 686);
		S_vestLine1.setStrokeWidth(2);
		S_vestLine1.setStroke(Color.rgb(242, 242, 242));
		
		S_vestLine2 = new Line(10, 690, 30, 690);
		S_vestLine2.setStrokeWidth(2);
		S_vestLine2.setStroke(Color.rgb(242, 242, 242));
		
		S_vestLine3 = new Line(20, 670, 20, 699);
		S_vestLine3.setStrokeWidth(0.5);
		S_vestLine3.setStroke(Color.rgb(10, 20, 20));
			
		S_grpBody.getChildren().addAll(S_body, S_vestLine1, S_vestLine2, S_vestLine3);
		
//------Drawing Hand--------------------------------------------------------------
		//--Right shirt sleeve--
		S_RightShirtSleeve = new Rectangle(5, 676, 5, 10);
		S_RightShirtSleeve.setFill(Color.rgb(148, 240, 117));
		S_RightShirtSleeve.setStroke(Color.rgb(102, 102, 102));
		S_RightShirtSleeve.setStrokeWidth(0.5);
				
		//--Right Hand--
		S_RightHand = new Rectangle(5, 684, 5, 10);
		S_RightHand.setFill(skinColour);
		S_RightHand.setStroke(characterStroke);
		S_RightHand.setStrokeWidth(0.5);
				
		S_grpRHand.getChildren().addAll(S_RightHand, S_RightShirtSleeve);
				
		//--Left shirt sleeve--
		S_LeftShirtSleeve = new Rectangle(30, 676, 5, 10);
		S_LeftShirtSleeve.setFill(Color.rgb(148, 240, 117));
		S_LeftShirtSleeve.setStroke(characterStroke);
		S_LeftShirtSleeve.setStrokeWidth(0.5);
				
		//--Left Hand--
		S_LeftHand = new Rectangle(30, 684, 5, 10);
		S_LeftHand.setFill(skinColour);
		S_LeftHand.setStroke(characterStroke);
		S_LeftHand.setStrokeWidth(0.5);
				
		S_grpLHand.getChildren().addAll(S_LeftHand, S_LeftShirtSleeve);
		
//------Drawing Leg--------------------------------------------------------------
		//--Right Leg--
		S_RightLeg = new Rectangle(12, 695, 8, 19);
		S_RightLeg.setArcWidth(5);
		S_RightLeg.setArcHeight(5);
		S_RightLeg.setFill(Color.rgb(25, 28, 39));
		S_RightLeg.setStroke(characterStroke);
		S_RightLeg.setStrokeWidth(0.5);
				
		S_grpRLeg.getChildren().addAll(S_RightLeg);
				
		//--Right Leg--
		S_LeftLeg = new Rectangle(20, 695, 8, 19);
		S_LeftLeg.setArcWidth(5);
		S_LeftLeg.setArcHeight(5);
		S_LeftLeg.setFill(Color.rgb(25, 28, 39));
		S_LeftLeg.setStroke(characterStroke);
		S_LeftLeg.setStrokeWidth(0.5);
						
		S_grpLLeg.getChildren().addAll(S_LeftLeg);
		
		this.getChildren().addAll(S_grpRLeg, S_grpLLeg, S_grpBody, S_grpRHand, S_grpLHand, S_grpHead);
	}
	
	public void moveDownAnimation() {
		if (LegDownward == true) {
			S_grpLLeg.setLayoutY(S_grpLLeg.getLayoutY() + 2);
			S_grpRLeg.setLayoutY(S_grpRLeg.getLayoutY() - 2);
			LegDownward = false;
		}
		else {
			S_grpLLeg.setLayoutY(S_grpLLeg.getLayoutY() - 2);
			S_grpRLeg.setLayoutY(S_grpRLeg.getLayoutY() + 2);
			LegDownward = true;
		}
	}
}
