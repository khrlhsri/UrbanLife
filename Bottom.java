package UrbanLife;

import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class Bottom extends Pane{
	
	public Bottom() {
		
		Pane bottom = new Pane();
		
		Rectangle grassPlayground = new Rectangle(0, 710, 850, 300);
		grassPlayground.setFill(Color.rgb(118, 213, 172));
		
		Rectangle path = new Rectangle(0, 670, 850, 40);
		path.setFill(Color.rgb(237, 230, 222));
		
		Rectangle divider = new Rectangle(0, 710, 850, 5);
		divider.setFill(Color.rgb(184, 153, 122));
		
		//BENCH 1
		Rectangle bench1 = new Rectangle(150, 685, 70, 20);
		Rectangle b1Handle1 = new Rectangle(140, 690, 10, 20);
		Rectangle b1Handle2 = new Rectangle(220, 690, 10, 20);
		
		bench1.setArcWidth(9);
		bench1.setArcHeight(4);
		bench1.setFill(Color.rgb(255, 202, 128));
		bench1.setStroke(Color.rgb(221, 147, 44));
		
		b1Handle1.setArcWidth(9);
		b1Handle1.setArcHeight(4);
		b1Handle1.setFill(Color.rgb(179, 179, 179));
		
		b1Handle2.setArcWidth(9);
		b1Handle2.setArcHeight(4);
		b1Handle2.setFill(Color.rgb(179, 179, 179));
		
		Group grpBench1 = new Group();
		
		grpBench1.getChildren().addAll(b1Handle1, b1Handle2, bench1);	
		
		//BENCH 2
		Rectangle bench2 = new Rectangle(390, 685, 70, 20);
		Rectangle b2Handle1 = new Rectangle(380, 690, 10, 20);
		Rectangle b2Handle2 = new Rectangle(460, 690, 10, 20);
				
		bench2.setArcWidth(9);
		bench2.setArcHeight(4);
		bench2.setFill(Color.rgb(255, 202, 128));
		bench2.setStroke(Color.rgb(221, 147, 44));
				
		b2Handle1.setArcWidth(9);
		b2Handle1.setArcHeight(4);
		b2Handle1.setFill(Color.rgb(179, 179, 179));
				
		b2Handle2.setArcWidth(9);
		b2Handle2.setArcHeight(4);
		b2Handle2.setFill(Color.rgb(179, 179, 179));
		
		Group grpBench2 = new Group();
		
		grpBench2.getChildren().addAll(b2Handle1, b2Handle2, bench2);
		
		//BENCH 3
		Rectangle bench3 = new Rectangle(630, 685, 70, 20);
		Rectangle b3Handle1 = new Rectangle(620, 690, 10, 20);
		Rectangle b3Handle2 = new Rectangle(700, 690, 10, 20);
						
		bench3.setArcWidth(9);
		bench3.setArcHeight(4);
		bench3.setFill(Color.rgb(255, 202, 128));
		bench3.setStroke(Color.rgb(221, 147, 44));
						
		b3Handle1.setArcWidth(9);
		b3Handle1.setArcHeight(4);
		b3Handle1.setFill(Color.rgb(179, 179, 179));
						
		b3Handle2.setArcWidth(9);
		b3Handle2.setArcHeight(4);
		b3Handle2.setFill(Color.rgb(179, 179, 179));
				
		Group grpBench3 = new Group();
				
		grpBench3.getChildren().addAll(b3Handle1, b3Handle2, bench3);
		
		bottom.getChildren().addAll(grassPlayground, path, divider, grpBench1, grpBench2, grpBench3);
		
		this.getChildren().addAll(bottom);
	}
}

