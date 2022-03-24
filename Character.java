package UrbanLife;

import java.util.function.UnaryOperator;

import javafx.animation.TranslateTransition;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.layout.*;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class Character extends Pane{
	
	Color skinColour = Color.rgb(255, 238, 214);
	Color characterStroke = Color.rgb(105, 94, 79);

	Circle head, eye1, eye2;
	Ellipse GarbageBagC;
	Rectangle capFrontPanel, capBill, mask, body, 
				leftHand, leftShirtSleeve, rightHand, rightShirtSleeve, leftLeg, rightLeg;
	Line maskLine1, maskLine2, vestLine1, vestLine2, vestLine3;
	
	Group grpHead = new Group();
	Group grpBody = new Group();
	Group grpRLeg = new Group();
	Group grpLLeg = new Group();
	Group grpRHand = new Group();	// Group Right Hand
	Group grpLHand = new Group();	// Group Left Hand
	
	public Character() {
//Default	
//------Drawing Head--------------------------------------------------------------
		head = new Circle(20, 660, 12);
		head.setFill(skinColour);
		head.setStroke(characterStroke);
		
		eye1 = new Circle(15, 656, 2);
		eye1.setFill(Color.WHITE);
		eye1.setStroke(Color.BLACK);
		
		eye2 = new Circle(25, 656, 2);
		eye2.setFill(Color.WHITE);
		eye2.setStroke(Color.BLACK);
		
		mask = new Rectangle(12, 661, 15, 8);
		mask.setFill(Color.rgb(190, 244, 244));
		mask.setStroke(Color.rgb(125, 216, 217));
		
		maskLine1 = new Line(9, 659, 12, 665);
		maskLine1.setStroke(Color.WHITE);
		maskLine1.setStrokeWidth(2);
		
		maskLine2 = new Line(31, 659, 22, 665);
		maskLine2.setStroke(Color.WHITE);
		maskLine2.setStrokeWidth(2);
		
		capFrontPanel = new Rectangle(9, 642, 22, 12);
		capFrontPanel.setArcWidth(100);
		capFrontPanel.setArcHeight(5);
		capFrontPanel.setFill(Color.rgb(51, 204, 51));
		capFrontPanel.setStroke(Color.rgb(102, 102, 102));
		
		capBill = new Rectangle(12, 646, 15, 5);
		capBill.setFill(Color.YELLOW);
		capBill.setArcWidth(50);
		capBill.setArcHeight(2);
		capBill.setFill(Color.rgb(92, 214, 92));
		capBill.setStroke(Color.rgb(102, 102, 102));
		
		grpHead.getChildren().addAll(capFrontPanel, head, capBill, eye1, eye2, maskLine1, maskLine2, mask);
		
//------Drawing Body--------------------------------------------------------------
		body = new Rectangle(10, 672, 20, 28);
		body.setArcWidth(20);
		body.setArcHeight(10);
		body.setFill(Color.rgb(144, 231, 115));
		body.setStroke(Color.rgb(102, 102, 102));
		body.setStrokeWidth(0.5);
		
		vestLine1 = new Line(10, 686, 30, 686);
		vestLine1.setStrokeWidth(2);
		vestLine1.setStroke(Color.rgb(242, 242, 242));
		
		vestLine2 = new Line(10, 690, 30, 690);
		vestLine2.setStrokeWidth(2);
		vestLine2.setStroke(Color.rgb(242, 242, 242));
		
		vestLine3 = new Line(20, 670, 20, 699);
		vestLine3.setStrokeWidth(0.5);
		vestLine3.setStroke(Color.rgb(10, 20, 20));
			
		grpBody.getChildren().addAll(body, vestLine1, vestLine2, vestLine3);
		
//------Drawing Hand--------------------------------------------------------------
		//--Right shirt sleeve--
		rightShirtSleeve = new Rectangle(5, 676, 5, 10);
		rightShirtSleeve.setFill(Color.rgb(148, 240, 117));
		rightShirtSleeve.setStroke(Color.rgb(102, 102, 102));
		rightShirtSleeve.setStrokeWidth(0.5);
		
		//--Right Hand--
		rightHand = new Rectangle(5, 684, 5, 10);
		rightHand.setFill(skinColour);
		rightHand.setStroke(characterStroke);
		rightHand.setStrokeWidth(0.5);
		
		grpRHand.getChildren().addAll(rightHand, rightShirtSleeve);
		
		//--Left shirt sleeve--
		leftShirtSleeve = new Rectangle(30, 676, 5, 10);
		leftShirtSleeve.setFill(Color.rgb(148, 240, 117));
		leftShirtSleeve.setStroke(characterStroke);
		leftShirtSleeve.setStrokeWidth(0.5);
		
		//--Left Hand--
		leftHand = new Rectangle(30, 684, 5, 10);
		leftHand.setFill(skinColour);
		leftHand.setStroke(characterStroke);
		leftHand.setStrokeWidth(0.5);
		
		grpLHand.getChildren().addAll(leftHand, leftShirtSleeve);
		
//------Drawing Right Leg--------------------------------------------------------------
		rightLeg = new Rectangle(12, 695, 8, 19);
		rightLeg.setArcWidth(5);
		rightLeg.setArcHeight(5);
		rightLeg.setFill(Color.rgb(25, 28, 39));
		rightLeg.setStroke(characterStroke);
		rightLeg.setStrokeWidth(0.5);
		
		grpRLeg.getChildren().addAll(rightLeg);
		
//------Drawing Left Leg--------------------------------------------------------------
		leftLeg = new Rectangle(20, 695, 8, 19);
		leftLeg.setArcWidth(5);
		leftLeg.setArcHeight(5);
		leftLeg.setFill(Color.rgb(25, 28, 39));
		leftLeg.setStroke(characterStroke);
		leftLeg.setStrokeWidth(0.5);
				
		grpLLeg.getChildren().addAll(leftLeg);
		
		GarbageBagC = new Ellipse(33, 702, 7, 9);
		GarbageBagC.setFill(Color.rgb(60, 60, 60));
		
		this.getChildren().addAll(grpRLeg, grpLLeg, grpBody, GarbageBagC, grpLHand, grpRHand, grpHead);
	}
}
