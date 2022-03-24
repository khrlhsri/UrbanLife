package UrbanLife;

import java.util.List;

import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.util.Duration;

public class Buildings extends Pane{
	
	public Buildings() {
		
		Color window = Color.rgb(240, 240, 240);
		Color windowV2 = Color.rgb(252, 252, 252);
		Color Line = Color.rgb(140, 140, 140);
		Color windowLineB1 = Color.rgb(71, 107, 107);
		Color windowLineB2 = Color.rgb(131, 131, 149);
		Color windowLineB3 = Color.rgb(255, 77, 77);
		Color tallBuildingColour = Color.rgb(173, 173, 173);
		Color tallBuildingWindow = Color.rgb(230, 230, 230);
		
		Circle TallB3R2TowerLight1;

//Building 1 from left-------------------------------------------------
	//--------Building 1 properties----------------------------------------
		Pane B1 = new Pane(); // store all shapes
			
		Rectangle building1 = new Rectangle(30, 320, 230, 350);
		Rectangle b1Window1 = new Rectangle(55, 350, 180, 40);
		Rectangle b1Window2 = new Rectangle(55, 420, 180, 40);
		Rectangle b1Window3 = new Rectangle(55, 490, 180, 40);
		Line windowLine1 = new Line (90, 350, 90, 390);
		Line windowLine2 = new Line (128, 350, 128, 390);
		Line windowLine3 = new Line (165, 350, 165, 390);
		Line windowLine4 = new Line (202, 350, 202, 390);
		Line windowLine5 = new Line (90, 420, 90, 460);
		Line windowLine6 = new Line (128, 420, 128, 460);
		Line windowLine7 = new Line (165, 420, 165, 460);
		Line windowLine8 = new Line (202, 420, 202, 460);
		Line windowLine9 = new Line (90, 490, 90, 530);
		Line windowLine10 = new Line (128, 490, 128, 530);
		Line windowLine11 = new Line (165, 490, 165, 530);
		Line windowLine12 = new Line (202, 490, 202, 530);
		Ellipse b1Door1 = new Ellipse(142, 600, 40, 15);
		Rectangle b1Door2 = new Rectangle(102, 598, 80, 71);
		Line b1DoorHandle1 = new Line (135, 620, 135, 640);
		Line b1DoorHandle2 = new Line (151, 620, 151, 640);
		Line b1doorLine = new Line (143, 587, 143, 669);
		
		building1.setFill(Color.rgb(102, 153, 153));
		building1.setStroke(Color.rgb(77, 77, 77));
		building1.setArcWidth(10);
		building1.setArcHeight(10);
		
		b1Window1.setFill(window);
		b1Window1.setStroke(Color.rgb(61, 92, 92));
		b1Window2.setFill(window);
		b1Window2.setStroke(Color.rgb(61, 92, 92));
		b1Window3.setFill(window);
		b1Window3.setStroke(Color.rgb(61, 92, 92));
		
		windowLine1.setStroke(windowLineB1);
		windowLine2.setStroke(windowLineB1);
		windowLine3.setStroke(windowLineB1);
		windowLine4.setStroke(windowLineB1);
		windowLine5.setStroke(windowLineB1);
		windowLine6.setStroke(windowLineB1);
		windowLine7.setStroke(windowLineB1);
		windowLine8.setStroke(windowLineB1);
		windowLine9.setStroke(windowLineB1);
		windowLine10.setStroke(windowLineB1);
		windowLine11.setStroke(windowLineB1);
		windowLine12.setStroke(windowLineB1);
		
		b1Door1.setFill(Color.rgb(239, 244, 246));
		b1Door2.setFill(Color.rgb(239, 244, 246));
		
		b1DoorHandle1.setStroke(Color.rgb(153, 153, 153));
		b1DoorHandle1.setStrokeWidth(2);
		b1DoorHandle2.setStroke(Color.rgb(153, 153, 153));
		b1DoorHandle2.setStrokeWidth(2);
		
		b1doorLine.setStroke(Color.rgb(159, 159, 159));
		
		B1.getChildren().addAll(building1, b1Window1, b1Window2, b1Window3,  windowLine1, windowLine2, windowLine3, 
								windowLine4, windowLine5, windowLine6, windowLine7, windowLine8, windowLine9, windowLine10,
								windowLine11, windowLine12, b1Door1, b1Door2, b1DoorHandle1, b1DoorHandle2, b1doorLine);
	
//Building 2 from left-------------------------------------------------
	//--------Building 2 properties----------------------------------------
		Pane B2 = new Pane(); // store all shapes
		
		Rectangle building2 = new Rectangle(280, 390, 300, 280);
		Rectangle b2Window1 = new Rectangle(405, 420, 45, 148);
		Rectangle b2Window2 = new Rectangle(310, 430, 75, 50);
		Rectangle b2Window3 = new Rectangle(310, 510, 75, 50);
		Rectangle b2Window4 = new Rectangle(474, 430, 75, 50);
		Rectangle b2Window5 = new Rectangle(474, 510, 75, 50);
		Rectangle b2Door = new Rectangle(378, 589, 100, 80);
		Line b2DoorHandle1 = new Line (420, 620, 420, 640);
		Line b2DoorHandle2 = new Line (436, 620, 436, 640);
		Line b2doorLine = new Line (428, 590, 428, 669);
		Rectangle b2vent = new Rectangle(535,360,43,30);
		Rectangle b2vent1 = new Rectangle(490,370,48,20);
		Circle b2VentHole = new Circle(556, 380, 13);  
		Line ventHoleLine1 = new Line(546, 373, 565, 373);
		Line ventHoleLine2 = new Line(544, 379, 568, 379);
		Line ventHoleLine3 = new Line(545, 385, 567, 385);
		
		building2.setFill(Color.rgb(179, 179, 204));
		building2.setStroke(Color.rgb(77, 77, 77));
		building2.setArcWidth(5);
		building2.setArcHeight(5);
		
		b2Window1.setFill(windowV2);
		b2Window1.setStroke(windowLineB2);
		b2Window2.setFill(windowV2);
		b2Window2.setStroke(windowLineB2);
		b2Window3.setFill(windowV2);
		b2Window3.setStroke(windowLineB2);
		b2Window4.setFill(windowV2);
		b2Window4.setStroke(windowLineB2);
		b2Window5.setFill(windowV2);
		b2Window5.setStroke(windowLineB2);
		
		b2Door.setFill(windowV2);
		b2doorLine.setStroke(Color.rgb(159, 159, 159));
		
		b2vent.setFill(Color.WHITESMOKE);
		b2vent.setStroke(Color.rgb(136, 136, 136));
		b2vent1.setFill(Color.WHITESMOKE);
		b2vent1.setStroke(Color.rgb(136, 136, 136));
		b2VentHole.setFill(Color.rgb(180, 180, 180));
		
		ventHoleLine1.setStroke(Color.rgb(255, 255, 255));
		ventHoleLine2.setStroke(Color.rgb(255, 255, 255));
		ventHoleLine3.setStroke(Color.rgb(255, 255, 255));
		
		B2.getChildren().addAll(b2vent, b2vent1, b2VentHole, ventHoleLine1, ventHoleLine2, ventHoleLine3, building2, b2Window1, 
								b2Window2, b2Window3, b2Window4, b2Window5, b2Door, b2DoorHandle1, b2DoorHandle2, b2doorLine);
	
//Building 3 from left-------------------------------------------------
	//--------Building 3 properties----------------------------------------
		Pane B3 = new Pane(); // store all shapes
		
		Rectangle building3 = new Rectangle(500, 470, 400, 200);
		Circle b3Window1 = new Circle(640, 540, 30);
		Circle b3Window2 = new Circle(720, 540, 30);
		Circle b3Window3 = new Circle(800, 540, 30);
		Rectangle b3Door = new Rectangle(650, 600, 150, 70);
		Polygon b3DoorRoof = new Polygon();
		Line b3DoorLine = new Line(725, 609, 725, 670);
		Rectangle b3Roof = new Rectangle(580, 440, 271, 50);
		Polygon b3Roof1 = new Polygon();
	
		building3.setFill(Color.rgb(255, 128, 128));
		building3.setStroke(Color.rgb(77, 77, 77));
		
		b3Window1.setFill(windowV2);
		b3Window1.setStroke(windowLineB3);
		b3Window2.setFill(windowV2);
		b3Window2.setStroke(windowLineB3);
		b3Window3.setFill(windowV2);
		b3Window3.setStroke(windowLineB3);
		
		b3Door.setFill(windowV2);
		b3Door.setStroke(Line);
		
		b3DoorRoof.getPoints().addAll(new Double[] {
				650.0, 590.0,
				640.0, 608.0,
				810.0, 608.0,
				800.0, 590.0
				});
		b3DoorRoof.setFill(Color.rgb(130, 130, 130));
		b3DoorRoof.setStroke(Color.rgb(90, 90, 90));
		b3DoorLine.setStroke(Color.rgb(149, 149, 149));
		
		b3Roof.setFill(Color.rgb(191, 191, 191));
		b3Roof.setStroke(Color.rgb(128, 128, 128));
		b3Roof1.getPoints().addAll(new Double[] {
				725.0, 420.0,
				640.0, 490.0,
				810.0, 490.0,
				});
		b3Roof1.setFill(Color.rgb(217, 217, 217));
		b3Roof1.setStroke(Color.rgb(128, 128, 128));
		
		B3.getChildren().addAll(building3, b3Window1, b3Window2, b3Window3, b3Door, b3DoorRoof, b3DoorLine, b3Roof, b3Roof1);

//Tall building 1 from left-------------------------------------------------
	//--------Tall Building 1 properties----------------------------------------
		Pane tallB1 = new Pane(); // store all shapes
		
		Rectangle tallBuilding1 = new Rectangle(250, 271, 50, 400);
		Rectangle tallB1Layer1 = new Rectangle(273, 170, 4, 80);
		Rectangle tallB1Layer2 = new Rectangle(265, 200, 20, 50);
		Rectangle tallB1Layer3 = new Rectangle(255, 210, 40, 10);
		Rectangle tallB1Layer4 = new Rectangle(245, 220, 60, 10);
		Rectangle tallB1Layer5 = new Rectangle(235, 230, 80, 40);
		Rectangle tallB1Layer6 = new Rectangle(240, 270, 70, 10);
		Rectangle tallB1Layer7 = new Rectangle(245, 280, 60, 10);
		Rectangle tallB1Window1 = new Rectangle(238, 235, 10, 30);
		Rectangle tallB1Window2 = new Rectangle(260, 235, 10, 30);
		Rectangle tallB1Window3 = new Rectangle(280, 235, 10, 30);
		Rectangle tallB1Window4 = new Rectangle(302, 235, 10, 30);
		
		tallBuilding1.setFill(tallBuildingColour);
		tallBuilding1.setStroke(Color.rgb(235, 242, 249));
		
		tallB1Layer1.setFill(tallBuildingColour);
		tallB1Layer1.setStroke(Color.rgb(235, 242, 249));
		tallB1Layer2.setFill(tallBuildingColour);
		tallB1Layer2.setStroke(Color.rgb(235, 242, 249));
		tallB1Layer3.setFill(tallBuildingColour);
		tallB1Layer3.setStroke(Color.rgb(235, 242, 249));
		tallB1Layer4.setFill(tallBuildingColour);
		tallB1Layer4.setStroke(Color.rgb(235, 242, 249));
		tallB1Layer5.setFill(tallBuildingColour);
		tallB1Layer5.setStroke(Color.rgb(235, 242, 249));
		tallB1Layer5.setArcWidth(20);
		tallB1Layer5.setArcHeight(15);
		tallB1Layer6.setFill(tallBuildingColour);
		tallB1Layer6.setStroke(Color.rgb(235, 242, 249));
		tallB1Layer7.setFill(tallBuildingColour);
		tallB1Layer7.setStroke(Color.rgb(235, 242, 249));
	
		tallB1Window1.setFill(tallBuildingWindow);
		tallB1Window1.setArcWidth(10);
		tallB1Window1.setArcHeight(10);
		tallB1Window2.setFill(tallBuildingWindow);
		tallB1Window2.setArcWidth(10);
		tallB1Window2.setArcHeight(10);
		tallB1Window3.setFill(tallBuildingWindow);
		tallB1Window3.setArcWidth(10);
		tallB1Window3.setArcHeight(10);
		tallB1Window4.setFill(tallBuildingWindow);
		tallB1Window4.setArcWidth(10);
		tallB1Window4.setArcHeight(10);
	
		tallB1.getChildren().addAll(tallBuilding1, tallB1Layer1, tallB1Layer2, tallB1Layer3, tallB1Layer4, 
									tallB1Layer5, tallB1Layer6, tallB1Layer7, tallB1Window1, tallB1Window2,
									tallB1Window3, tallB1Window4);
//Tall building 2 from left-------------------------------------------------
	//--------Tall Building 2 properties----------------------------------------
		Pane tallB2 = new Pane(); // store all shapes
		
		Rectangle tallBuilding2 = new Rectangle(350, 271, 150, 400);
		
		Rectangle tallB2Window1 = new Rectangle(370, 290, 30, 50);
		Rectangle tallB2W1Balcony1 = new Rectangle(368, 320, 34, 20);
		Rectangle tallB2W1B1Fence1 = new Rectangle(370, 321, 5, 15);
		Rectangle tallB2W1B1Fence2 = new Rectangle(378, 321, 5, 15);
		Rectangle tallB2W1B1Fence3 = new Rectangle(387, 321, 5, 15);
		Rectangle tallB2W1B1Fence4 = new Rectangle(395, 321, 5, 15);
		
		Rectangle tallB2Window2 = new Rectangle(410, 290, 30, 50);
		Rectangle tallB2W1Balcony2 = new Rectangle(408, 320, 34, 20);
		Rectangle tallB2W1B2Fence1 = new Rectangle(410, 321, 5, 15);
		Rectangle tallB2W1B2Fence2 = new Rectangle(418, 321, 5, 15);
		Rectangle tallB2W1B2Fence3 = new Rectangle(427, 321, 5, 15);
		Rectangle tallB2W1B2Fence4 = new Rectangle(435, 321, 5, 15);
		
		Rectangle tallB2Window3 = new Rectangle(450, 290, 30, 50);
		Rectangle tallB2W1Balcony3 = new Rectangle(448, 320, 34, 20);
		Rectangle tallB2W1B3Fence1 = new Rectangle(450, 321, 5, 15);
		Rectangle tallB2W1B3Fence2 = new Rectangle(458, 321, 5, 15);
		Rectangle tallB2W1B3Fence3 = new Rectangle(467, 321, 5, 15);
		Rectangle tallB2W1B3Fence4 = new Rectangle(475, 321, 5, 15);
	
		Rectangle tallB2Window4 = new Rectangle(370, 350, 30, 50);
		Rectangle tallB2Window5 = new Rectangle(410, 350, 30, 50);
		Rectangle tallB2Window6 = new Rectangle(450, 350, 30, 50);
		
		tallBuilding2.setFill(tallBuildingColour);
		tallBuilding2.setStroke(Color.rgb(235, 242, 249));
		
		tallB2Window1.setFill(Color.rgb(225, 225, 204));
		tallB2W1Balcony1.setFill(Color.rgb(123, 123, 123));
		tallB2W1B1Fence1.setFill(Color.rgb(225, 225, 204));
		tallB2W1B1Fence2.setFill(Color.rgb(225, 225, 204));
		tallB2W1B1Fence3.setFill(Color.rgb(225, 225, 204));
		tallB2W1B1Fence4.setFill(Color.rgb(225, 225, 204));
		
		tallB2Window2.setFill(tallBuildingWindow);
		tallB2W1Balcony2.setFill(Color.rgb(123, 123, 123));
		tallB2W1B2Fence1.setFill(tallBuildingWindow);
		tallB2W1B2Fence2.setFill(tallBuildingWindow);
		tallB2W1B2Fence3.setFill(tallBuildingWindow);
		tallB2W1B2Fence4.setFill(tallBuildingWindow);
		
		tallB2Window3.setFill(Color.rgb(225, 225, 204));
		tallB2W1Balcony3.setFill(Color.rgb(123, 123, 123));
		tallB2W1B3Fence1.setFill(Color.rgb(225, 225, 204));
		tallB2W1B3Fence2.setFill(Color.rgb(225, 225, 204));
		tallB2W1B3Fence3.setFill(Color.rgb(225, 225, 204));
		tallB2W1B3Fence4.setFill(Color.rgb(225, 225, 204));
		
		tallB2Window4.setFill(tallBuildingWindow);
		tallB2Window5.setFill(Color.rgb(225, 225, 204));
		tallB2Window6.setFill(tallBuildingWindow);
		
		tallB1.getChildren().addAll(tallBuilding2, tallB2Window1, tallB2Window2, tallB2Window3, tallB2W1Balcony1, tallB2W1Balcony2, tallB2W1Balcony3, tallB2W1B1Fence1,
				tallB2W1B1Fence2, tallB2W1B1Fence3, tallB2W1B1Fence4, tallB2W1B2Fence1, tallB2W1B2Fence2, tallB2W1B2Fence3, tallB2W1B2Fence4, tallB2W1B3Fence1,
				tallB2W1B3Fence2, tallB2W1B3Fence3, tallB2W1B3Fence4, tallB2Window4, tallB2Window5, tallB2Window6);

//Tall building 3 from left-------------------------------------------------
	//--------Tall Building 3 properties----------------------------------------
		Pane tallB3 = new Pane(); // store all shapes
		
		Rectangle tallBuilding3 = new Rectangle(560, 220, 260, 400);
		Rectangle tallB3Window1 = new Rectangle(585, 250, 210, 40);
		Rectangle tallB3Window2 = new Rectangle(585, 310, 210, 40);
		Rectangle tallB3Window3 = new Rectangle(585, 370, 210, 40);
		Polygon tallB3R2Layer1 = new Polygon();
		Polygon tallB3R2Layer2 = new Polygon();
		Polyline tallB3R2Tower = new Polyline();
		Line tallB3R2TowerLine1 = new Line(745, 90, 762, 120);
		Line tallB3R2TowerLine2 = new Line(755, 90, 738, 120);
		Line tallB3R2TowerLine3 = new Line(738, 118, 780, 160);
		Line tallB3R2TowerLine4 = new Line(762, 118, 721, 160);
		Circle tallB3R2TowerCircle1 = new Circle (745, 90, 6);
		Circle tallB3R2TowerCircle2 = new Circle (760, 113, 6);
		
		tallBuilding3.setFill(tallBuildingColour);
		tallBuilding3.setStroke(Color.rgb(235, 242, 249));
	
		tallB3Window1.setFill(Color.rgb(214, 222, 229));
		tallB3Window2.setFill(Color.rgb(214, 222, 229));
		tallB3Window3.setFill(Color.rgb(214, 222, 229));
		
		tallB3R2Layer1.getPoints().addAll(new Double[] {
				546.0, 208.0,
				550.0, 221.0,
				828.0, 221.0,
				834.0, 208.0
				});
		tallB3R2Layer1.setFill(tallBuildingColour);
		tallB3R2Layer1.setStroke(Color.rgb(235, 242, 249));
		
		tallB3R2Layer2.getPoints().addAll(new Double[] {
				580.0, 150.0,
				555.0, 208.0,
				830.0, 221.0,
				797.0, 150.0
				});
		tallB3R2Layer2.setFill(tallBuildingColour);
		tallB3R2Layer2.setStroke(Color.rgb(235, 242, 249));
		
		tallB3R2Tower.getPoints().addAll(new Double[]{        
		         750.0, 70.0, 
		         730.0, 155.0, 
		         770.0, 155.0,
		         750.0, 70.0,
		      });
	
		tallB3R2Tower.setStroke(Color.rgb(163, 163, 163));
		tallB3R2TowerLine1.setStroke(Color.rgb(163, 163, 163));
		tallB3R2TowerLine2.setStroke(Color.rgb(163, 163, 163));
		tallB3R2TowerLine3.setStroke(Color.rgb(163, 163, 163));
		tallB3R2TowerLine4.setStroke(Color.rgb(163, 163, 163));
		tallB3R2TowerCircle1.setFill(windowV2); tallB3R2TowerCircle1.setStroke(Color.rgb(156, 154, 156));
		tallB3R2TowerCircle2.setFill(windowV2); tallB3R2TowerCircle2.setStroke(Color.rgb(156, 154, 156));
		
		TallB3R2TowerLight1 = new Circle(750,70, 3, Color.RED);
		
		tallB3.getChildren().addAll(tallBuilding3, tallB3Window1, tallB3Window2, tallB3Window3, tallB3R2Tower, tallB3R2TowerLine1, tallB3R2TowerLine2, 
									tallB3R2TowerLine3, tallB3R2TowerLine4, tallB3R2TowerCircle1, tallB3R2TowerCircle2, tallB3R2Layer2, tallB3R2Layer1,
									TallB3R2TowerLight1);

//--- Animate Tower Light -------------------------------------------------
		FadeTransition fd = new FadeTransition(Duration.millis(150), TallB3R2TowerLight1);
		fd.setFromValue(100);
		fd.setToValue(0);
		fd.setCycleCount(Timeline.INDEFINITE);
		fd.setAutoReverse(true);
		fd.play();
	
		this.getChildren().addAll(
				tallB1, tallB2, tallB3, B3, B2, B1);
	}

}