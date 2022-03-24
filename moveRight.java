package UrbanLife;

import javafx.animation.RotateTransition;
import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class moveRight extends Pane{
	
	Color skinColour = Color.rgb(255, 238, 214);
	Color characterStroke = Color.rgb(110, 104, 89);
	
	//A being pressed 
	Circle D_head, D_eye, GarbageBagR;
	Line D_maskLine, D_vestLine1, D_vestLine2;
	Rectangle D_capFrontPanel, D_capBill, D_mask, D_body, 
				D_LeftHand, D_LeftShirtSleeve,
				D_RightHand, D_RightShirtSleeve;
	Polygon D_leftLeg, D_rightLeg;
			
	Group D_grpHead = new Group();
	Group D_grpBody = new Group();
	Group D_grpRLeg = new Group();
	Group D_grpLLeg = new Group();
	Group D_grpRHand = new Group();	// Group Right Hand
	Group D_grpLHand = new Group();	// Group Left Hand
	
	boolean leftLegBackward = true;
	
	public moveRight() {
		
		//------Drawing Head--------------------------------------------------------------
		D_head = new Circle(20, 660, 12);
		D_head.setFill(skinColour);
		D_head.setStroke(characterStroke);
				
		D_eye = new Circle(23, 656, 2);
		D_eye.setFill(Color.WHITE);
		D_eye.setStroke(Color.BLACK);
				
		D_mask = new Rectangle(22, 661, 10, 8);
		D_mask.setFill(Color.rgb(190, 244, 244));
		D_mask.setStroke(Color.rgb(125, 216, 217));
				
		D_maskLine = new Line(9, 659, 20, 663);
		D_maskLine.setStroke(Color.WHITE);
		D_maskLine.setStrokeWidth(2);
				
		D_capFrontPanel = new Rectangle(10, 644, 20, 8);
		D_capFrontPanel.setArcWidth(5);
		D_capFrontPanel.setArcHeight(5);
		D_capFrontPanel.setFill(Color.rgb(51, 204, 51));
		D_capFrontPanel.setStroke(Color.rgb(102, 102, 102));
				
		D_capBill = new Rectangle(27, 647, 10, 5);
		D_capBill.setFill(Color.YELLOW);
		D_capBill.setArcWidth(50);
		D_capBill.setArcHeight(2);
		D_capBill.setFill(Color.rgb(92, 214, 92));
		D_capBill.setStroke(Color.rgb(102, 102, 102));
				
		D_grpHead.getChildren().addAll(D_head, D_capBill, D_capFrontPanel, D_eye, D_maskLine, D_mask);
		
		//------Drawing Body--------------------------------------------------------------
		D_body = new Rectangle(10, 672, 20, 28);
		D_body.setArcWidth(20);
		D_body.setArcHeight(10);
		D_body.setFill(Color.rgb(144, 231, 115));
		D_body.setStroke(Color.rgb(102, 102, 102));
		D_body.setStrokeWidth(0.5);
		
		D_vestLine1 = new Line(10, 686, 30, 686);
		D_vestLine1.setStrokeWidth(2);
		D_vestLine1.setStroke(Color.rgb(242, 242, 242));
		
		D_vestLine2 = new Line(10, 690, 30, 690);
		D_vestLine2.setStrokeWidth(2);
		D_vestLine2.setStroke(Color.rgb(242, 242, 242));
			
		D_grpBody.getChildren().addAll(D_body, D_vestLine1, D_vestLine2);
		
		//------Drawing Hand--------------------------------------------------------------
		//--Left shirt sleeve--
		D_RightShirtSleeve = new Rectangle(15, 676, 8, 10);
		D_RightShirtSleeve.setFill(Color.rgb(148, 240, 117));
		D_RightShirtSleeve.setStroke(characterStroke);
		D_RightShirtSleeve.setStrokeWidth(0.5);
				
		//--Left Hand--
		D_LeftHand = new Rectangle(15, 684, 8, 10);
		D_LeftHand.setFill(skinColour);
		D_LeftHand.setStroke(characterStroke);
		D_LeftHand.setStrokeWidth(0.5);
				
		D_grpLHand.getChildren().addAll(D_LeftHand, D_RightShirtSleeve);
		
		//--Right shirt sleeve--
		D_RightShirtSleeve = new Rectangle(15, 676, 8, 10);
		D_RightShirtSleeve.setFill(Color.rgb(148, 240, 117));
		D_RightShirtSleeve.setStroke(characterStroke);
		D_RightShirtSleeve.setStrokeWidth(0.5);
						
		//--Right Hand--
		D_RightHand = new Rectangle(15, 684, 8, 10);
		D_RightHand.setFill(skinColour);
		D_RightHand.setStroke(characterStroke);
		D_RightHand.setStrokeWidth(0.5);
						
		D_grpRHand.getChildren().addAll(D_RightHand, D_RightShirtSleeve);
		
		//------Drawing Leg--------------------------------------------------------------
		//--Left leg--
		D_leftLeg = new Polygon();
		D_leftLeg.getPoints().addAll(new Double[] {
			18.0, 698.0,
			18.0, 714.0,
			28.0, 714.0,
			28.0, 698.0
		});
		
		D_leftLeg.setFill(Color.rgb(25, 28, 39));
		D_leftLeg.setStroke(Color.rgb(155, 155, 155));
		D_leftLeg.setStrokeWidth(0.5);
		
		//--Right leg--
		D_rightLeg = new Polygon();
		D_rightLeg.getPoints().addAll(new Double[] {
				12.0, 698.0,
				12.0, 714.0,
				22.0, 714.0,
				22.0, 698.0
		});
				
		D_rightLeg.setFill(Color.rgb(25, 28, 39));
		D_rightLeg.setStroke(Color.rgb(155, 155, 155));
		D_rightLeg.setStrokeWidth(0.5);
		
		GarbageBagR = new Circle(18, 701, 9);
		GarbageBagR.setFill(Color.rgb(60, 60, 60));
		
		this.getChildren().addAll(GarbageBagR, D_leftLeg, D_rightLeg, D_grpRHand, D_grpBody, D_grpLHand, D_grpHead);
	}
	
	public void moveRightAnimation() {
		if (leftLegBackward == true) {
			D_leftLeg.getPoints().clear();
			D_leftLeg.getPoints().addAll(new Double[] {
					13.0, 698.0,
					5.0, 710.0,
					12.0, 712.0,
					24.0, 700.0
			});
			
			D_rightLeg.getPoints().clear();
			D_rightLeg.getPoints().addAll(new Double[] {
					15.0, 698.0,
					23.0, 712.0,
					29.0, 710.0,
					30.0, 698.0
			});
			
			leftLegBackward = false;
		} else {
			D_leftLeg.getPoints().clear();
			D_leftLeg.getPoints().addAll(new Double[] {
					15.0, 698.0,
					29.0, 712.0,
					35.0, 710.0,
					30.0, 698.0
			});
			
			D_rightLeg.getPoints().clear();
			D_rightLeg.getPoints().addAll(new Double[] {
					13.0, 698.0,
					0.0, 710.0,
					6.0, 712.0,
					24.0, 700.0
			});
			leftLegBackward = true;
		}
	}
}
