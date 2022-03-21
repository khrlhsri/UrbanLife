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

public class moveLeft extends Pane{
	
	Color skinColour = Color.rgb(255, 238, 214);
	Color characterStroke = Color.rgb(110, 104, 89);
	
	//A being pressed 
	Circle A_head, A_eye2;
	Line A_maskLine1, A_vestLine1, A_vestLine2;
	Rectangle A_capFrontPanel, A_capBill, A_mask, A_body, 
				A_LeftHand, A_LeftShirtSleeve,
				A_RightHand, A_RightShirtSleeve;
	Polygon A_leftLeg, A_rightLeg;
			
	Group A_grpHead = new Group();
	Group A_grpBody = new Group();
	Group A_grpRLeg = new Group();
	Group A_grpLLeg = new Group();
	Group A_grpRHand = new Group();	// Group Right Hand
	Group A_grpLHand = new Group();	// Group Left Hand
	
	boolean leftLegForward = true;
	
	public moveLeft() {
		
		//------Drawing Head--------------------------------------------------------------
		A_head = new Circle(20, 660, 12);
		A_head.setFill(skinColour);
		A_head.setStroke(characterStroke);
				
		A_eye2 = new Circle(17, 656, 2);
		A_eye2.setFill(Color.WHITE);
		A_eye2.setStroke(Color.BLACK);
				
		A_mask = new Rectangle(8, 661, 10, 8);
		A_mask.setFill(Color.rgb(190, 244, 244));
		A_mask.setStroke(Color.rgb(125, 216, 217));
				
		A_maskLine1 = new Line(31, 659, 20, 663);
		A_maskLine1.setStroke(Color.WHITE);
		A_maskLine1.setStrokeWidth(2);
				
		A_capFrontPanel = new Rectangle(10, 644, 20, 8);
		A_capFrontPanel.setArcWidth(5);
		A_capFrontPanel.setArcHeight(5);
		A_capFrontPanel.setFill(Color.rgb(51, 204, 51));
		A_capFrontPanel.setStroke(Color.rgb(102, 102, 102));
				
		A_capBill = new Rectangle(3, 647, 10, 5);
		A_capBill.setFill(Color.YELLOW);
		A_capBill.setArcWidth(50);
		A_capBill.setArcHeight(2);
		A_capBill.setFill(Color.rgb(92, 214, 92));
		A_capBill.setStroke(Color.rgb(102, 102, 102));
				
		A_grpHead.getChildren().addAll(A_head, A_capBill, A_capFrontPanel, A_eye2, A_maskLine1, A_mask);
		
		//------Drawing Body--------------------------------------------------------------
		A_body = new Rectangle(10, 672, 20, 28);
		A_body.setArcWidth(20);
		A_body.setArcHeight(10);
		A_body.setFill(Color.rgb(144, 231, 115));
		A_body.setStroke(Color.rgb(102, 102, 102));
		A_body.setStrokeWidth(0.5);
		
		A_vestLine1 = new Line(10, 686, 30, 686);
		A_vestLine1.setStrokeWidth(2);
		A_vestLine1.setStroke(Color.rgb(242, 242, 242));
		
		A_vestLine2 = new Line(10, 690, 30, 690);
		A_vestLine2.setStrokeWidth(2);
		A_vestLine2.setStroke(Color.rgb(242, 242, 242));
			
		A_grpBody.getChildren().addAll(A_body, A_vestLine1, A_vestLine2);
		
		//------Drawing Hand--------------------------------------------------------------
		//--Left shirt sleeve--
		A_LeftShirtSleeve = new Rectangle(17, 676, 8, 10);
		A_LeftShirtSleeve.setFill(Color.rgb(148, 240, 117));
		A_LeftShirtSleeve.setStroke(characterStroke);
		A_LeftShirtSleeve.setStrokeWidth(0.5);
				
		//--Left Hand--
		A_LeftHand = new Rectangle(17, 684, 8, 10);
		A_LeftHand.setFill(skinColour);
		A_LeftHand.setStroke(characterStroke);
		A_LeftHand.setStrokeWidth(0.5);
				
		A_grpLHand.getChildren().addAll(A_LeftHand, A_LeftShirtSleeve);
		
		//--Right shirt sleeve--
		A_RightShirtSleeve = new Rectangle(17, 676, 8, 10);
		A_RightShirtSleeve.setFill(Color.rgb(148, 240, 117));
		A_RightShirtSleeve.setStroke(characterStroke);
		A_RightShirtSleeve.setStrokeWidth(0.5);
						
		//--Right Hand--
		A_RightHand = new Rectangle(17, 684, 8, 10);
		A_RightHand.setFill(skinColour);
		A_RightHand.setStroke(characterStroke);
		A_RightHand.setStrokeWidth(0.5);
						
		A_grpRHand.getChildren().addAll(A_RightHand, A_RightShirtSleeve);
		
		//------Drawing Leg--------------------------------------------------------------
		//--Left leg--
		A_leftLeg = new Polygon();
		A_leftLeg.getPoints().addAll(new Double[] {
			18.0, 698.0,
			18.0, 714.0,
			28.0, 714.0,
			28.0, 698.0
		});
		
		A_leftLeg.setFill(Color.rgb(25, 28, 39));
		A_leftLeg.setStroke(Color.rgb(155, 155, 155));
		A_leftLeg.setStrokeWidth(0.5);
		
		//--Right leg--
		A_rightLeg = new Polygon();
		A_rightLeg.getPoints().addAll(new Double[] {
				12.0, 698.0,
				12.0, 714.0,
				22.0, 714.0,
				22.0, 698.0
		});
				
		A_rightLeg.setFill(Color.rgb(25, 28, 39));
		A_rightLeg.setStroke(Color.rgb(155, 155, 155));
		A_rightLeg.setStrokeWidth(0.5);
		
		this.getChildren().addAll(A_rightLeg, A_leftLeg, A_grpRHand, A_grpBody, A_grpLHand, A_grpHead);
	}
	
	public void moveLeftAnimation() {
		if (leftLegForward == true) {
			A_leftLeg.getPoints().remove(A_leftLeg.getPoints().size() - 2);
			A_leftLeg.getPoints().remove(A_leftLeg.getPoints().size() - 2);
			A_leftLeg.getPoints().remove(A_leftLeg.getPoints().size() - 2);
			A_leftLeg.getPoints().remove(A_leftLeg.getPoints().size() - 2);
			
			A_leftLeg.getPoints().addAll(new Double[] {
					13.0, 698.0,
					5.0, 710.0,
					12.0, 712.0,
					24.0, 700.0
			});
			
			A_rightLeg.getPoints().remove(A_rightLeg.getPoints().size() - 2);
			A_rightLeg.getPoints().remove(A_rightLeg.getPoints().size() - 2);
			A_rightLeg.getPoints().remove(A_rightLeg.getPoints().size() - 2);
			A_rightLeg.getPoints().remove(A_rightLeg.getPoints().size() - 2);
			
			A_rightLeg.getPoints().addAll(new Double[] {
					15.0, 698.0,
					23.0, 712.0,
					29.0, 710.0,
					30.0, 698.0
			});
			
			leftLegForward = false;
		} else {
			A_leftLeg.getPoints().remove(A_leftLeg.getPoints().size() - 2);
			A_leftLeg.getPoints().remove(A_leftLeg.getPoints().size() - 2);
			A_leftLeg.getPoints().remove(A_leftLeg.getPoints().size() - 2);
			A_leftLeg.getPoints().remove(A_leftLeg.getPoints().size() - 2);

			A_leftLeg.getPoints().addAll(new Double[] {
					15.0, 698.0,
					29.0, 712.0,
					35.0, 710.0,
					30.0, 698.0
			});
			
			A_rightLeg.getPoints().remove(A_rightLeg.getPoints().size() - 2);
			A_rightLeg.getPoints().remove(A_rightLeg.getPoints().size() - 2);
			A_rightLeg.getPoints().remove(A_rightLeg.getPoints().size() - 2);
			A_rightLeg.getPoints().remove(A_rightLeg.getPoints().size() - 2);
			
			A_rightLeg.getPoints().addAll(new Double[] {
					13.0, 698.0,
					0.0, 710.0,
					6.0, 712.0,
					24.0, 700.0
			});
			
			leftLegForward = true;
		}
	}

}
