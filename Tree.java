package UrbanLife;

import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class Tree extends Pane {
	
	Color leaves = Color.rgb(121, 224, 178);
	
	public Tree() {
		
//------Tree 1 (from left)---------------------------------------------------------------
		Pane tree1 = new Pane();
		
		Polygon trunk1 = new Polygon();
		Polygon t1Branch1 = new Polygon();
		Polygon t1Branch2 = new Polygon();
		Line t1Branch3 = new Line(77, 610, 95, 615);
		Line t1Branch4 = new Line(98, 595, 100, 620);
		Line t1Branch5 = new Line(130, 597, 124, 623);
		Line t1Branch6 = new Line(126, 620, 140, 617);
		Circle t1leaves1 = new Circle(85, 610, 30);
		Circle t1leaves2 = new Circle(100, 590, 30);
		Circle t1leaves3 = new Circle(125, 580, 20);
		Circle t1leaves4 = new Circle(105, 615, 35);
		Circle t1leaves5 = new Circle(138, 600, 30);
		Circle t1leaves6 = new Circle(130, 623, 20);
		
		trunk1.getPoints().addAll(new Double[] {
				105.0, 710.0,
				107.0, 630.0,
				118.0, 630.0,
				120.0, 710.0
		});
		
		t1Branch1.getPoints().addAll(new Double[] {
				108.0, 635.0,
				90.0, 607.0,
				119.0, 635.0
		});
		
		t1Branch2.getPoints().addAll(new Double[] {
				110.0, 630.0,
				135.0, 607.0,
				118.0, 635.0
		});
		
		t1Branch3.setStrokeWidth(1.5);
		t1Branch4.setStrokeWidth(1.5);
		t1Branch5.setStrokeWidth(1.5);
		t1Branch6.setStrokeWidth(1.5);
		
		t1leaves1.setFill(leaves);
		t1leaves2.setFill(leaves);
		t1leaves3.setFill(leaves);
		t1leaves4.setFill(leaves);
		t1leaves5.setFill(leaves);
		t1leaves6.setFill(leaves);
		
		tree1.getChildren().addAll(t1leaves1, t1leaves2, t1leaves3, t1leaves4, t1leaves5, t1leaves6, trunk1, 
									t1Branch1, t1Branch2, t1Branch3, t1Branch4, t1Branch5, t1Branch6);
		
//------Tree 2 (from left)---------------------------------------------------------------
		Pane tree2 = new Pane();
				
		Polygon trunk2 = new Polygon();
		Polygon t2Branch1 = new Polygon();
		Polygon t2Branch2 = new Polygon();
		Line t2Branch3 = new Line(307, 610, 325, 615);
		Line t2Branch4 = new Line(328, 595, 330, 620);
		Line t2Branch5 = new Line(360, 597, 354, 623);
		Line t2Branch6 = new Line(356, 620, 370, 617);	
		Circle t2leaves1 = new Circle(316, 610, 30);
		Circle t2leaves2 = new Circle(335, 590, 30);
		Circle t2leaves3 = new Circle(360, 580, 20);
		Circle t2leaves4 = new Circle(340, 615, 35);
		Circle t2leaves5 = new Circle(373, 600, 30);
		Circle t2leaves6 = new Circle(365, 623, 20);
				
		trunk2.getPoints().addAll(new Double[] {
				335.0, 710.0,
				337.0, 630.0,
				348.0, 630.0,
				350.0, 710.0
		});
				
		t2Branch1.getPoints().addAll(new Double[] {
				337.0, 635.0,
				319.0, 607.0,
				348.0, 635.0
		});
				
		t2Branch2.getPoints().addAll(new Double[] {
				341.0, 630.0,
				366.0, 607.0,
				348.0, 635.0
		});
				
		t2Branch3.setStrokeWidth(1.5);
		t2Branch4.setStrokeWidth(1.5);
		t2Branch5.setStrokeWidth(1.5);
		t2Branch6.setStrokeWidth(1.5);
		
		t2leaves1.setFill(leaves);
		t2leaves2.setFill(leaves);
		t2leaves3.setFill(leaves);
		t2leaves4.setFill(leaves);
		t2leaves5.setFill(leaves);
		t2leaves6.setFill(leaves);
				
		tree2.getChildren().addAll(t2leaves1, t2leaves2, t2leaves3, t2leaves4, t2leaves5, t2leaves6, 
									trunk2, t2Branch1, t2Branch2, t2Branch3, t2Branch4, t2Branch5, t2Branch6);
		
//------Tree 3 (from left)---------------------------------------------------------------
		Pane tree3 = new Pane();
						
		Polygon trunk3 = new Polygon();
		Polygon t3Branch1 = new Polygon();
		Polygon t3Branch2 = new Polygon();
		Line t3Branch3 = new Line(537, 610, 555, 615);
		Line t3Branch4 = new Line(558, 595, 560, 620);
		Line t3Branch5 = new Line(590, 597, 584, 623);
		Line t3Branch6 = new Line(586, 620, 600, 617);	
		Circle t3leaves1 = new Circle(542, 610, 30);
		Circle t3leaves2 = new Circle(570, 590, 30);
		Circle t3leaves3 = new Circle(595, 580, 20);
		Circle t3leaves4 = new Circle(570, 615, 35);
		Circle t3leaves5 = new Circle(608, 600, 30);
		Circle t3leaves6 = new Circle(600, 623, 20);
						
		trunk3.getPoints().addAll(new Double[] {
				565.0, 710.0,
				567.0, 630.0,
				578.0, 630.0,
				580.0, 710.0
		});
						
		t3Branch1.getPoints().addAll(new Double[] {
				567.0, 635.0,
				549.0, 607.0,
				578.0, 635.0
		});
						
		t3Branch2.getPoints().addAll(new Double[] {
				571.0, 630.0,
				596.0, 607.0,
				578.0, 635.0
		});
						
		t3Branch3.setStrokeWidth(1.5);
		t3Branch4.setStrokeWidth(1.5);
		t3Branch5.setStrokeWidth(1.5);
		t3Branch6.setStrokeWidth(1.5);
		
		t3leaves1.setFill(leaves);
		t3leaves2.setFill(leaves);
		t3leaves3.setFill(leaves);
		t3leaves4.setFill(leaves);
		t3leaves5.setFill(leaves);
		t3leaves6.setFill(leaves);
						
		tree3.getChildren().addAll(t3leaves1, t3leaves2, t3leaves3, t3leaves4, t3leaves5, t3leaves6,
									trunk3, t3Branch1, t3Branch2, t3Branch3, t3Branch4, t3Branch5, t3Branch6);
		
//------Tree 4 (from left)---------------------------------------------------------------
		Pane tree4 = new Pane();
								
		Polygon trunk4 = new Polygon();
		Polygon t4Branch1 = new Polygon();
		Polygon t4Branch2 = new Polygon();
		Line t4Branch3 = new Line(767, 610, 785, 615);
		Line t4Branch4 = new Line(788, 595, 790, 620);
		Line t4Branch5 = new Line(820, 597, 814, 623);
		Line t4Branch6 = new Line(816, 620, 830, 617);
		Circle t4leaves1 = new Circle(774, 610, 30);
		Circle t4leaves2 = new Circle(805, 590, 30);
		Circle t4leaves3 = new Circle(830, 580, 20);
		Circle t4leaves4 = new Circle(805, 615, 35);
		Circle t4leaves5 = new Circle(843, 600, 30);
		Circle t4leaves6 = new Circle(835, 623, 20);
		
//		Circle t3leaves1 = new Circle(542, 610, 30);
//		Circle t3leaves2 = new Circle(570, 590, 30);
//		Circle t3leaves3 = new Circle(595, 580, 20);
//		Circle t3leaves4 = new Circle(570, 615, 35);
//		Circle t3leaves5 = new Circle(608, 600, 30);
//		Circle t3leaves6 = new Circle(600, 623, 20);
								
		trunk4.getPoints().addAll(new Double[] {
				795.0, 710.0,
				797.0, 630.0,
				808.0, 630.0,
				810.0, 710.0
		});
								
		t4Branch1.getPoints().addAll(new Double[] {
				797.0, 635.0,
				779.0, 607.0,
				808.0, 635.0
		});
								
		t4Branch2.getPoints().addAll(new Double[] {
				801.0, 630.0,
				826.0, 607.0,
				808.0, 635.0
		});
								
		t4Branch3.setStrokeWidth(1.5);
		t4Branch4.setStrokeWidth(1.5);
		t4Branch5.setStrokeWidth(1.5);
		t4Branch6.setStrokeWidth(1.5);
		
		t4leaves1.setFill(leaves);
		t4leaves2.setFill(leaves);
		t4leaves3.setFill(leaves);
		t4leaves4.setFill(leaves);
		t4leaves5.setFill(leaves);
		t4leaves6.setFill(leaves);
								
		tree4.getChildren().addAll(t4leaves1, t4leaves2, t4leaves3, t4leaves4, t4leaves5, t4leaves6,
									trunk4, t4Branch1, t4Branch2, t4Branch3, t4Branch4, t4Branch5, t4Branch6);
		
		this.getChildren().addAll(tree1, tree2, tree3, tree4);
	}
}
