/**
 * Description: This program uses JavaFX to create an evergreen tree
 * 
 * INPUT:
 * 		User Input: None
 * 		Constants: None
 * 
 * COMPUTATION:
 * 		Where each shape goes on the scene and pane
 *  
 * OUTPUT:
 * 		An evergreen tree with a sun that has rays emanating from it
 * 
 * **************************
 * 
 * @author Blake Dee
 * @contact blake.dee@my.century.edu
 * @since 11/30/2025
 * 
 * Institution: Century College
 * Course: CSCI 1082-01
 * Instructor: Mathew Nyamagwa
 */

package csci1082;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Driver extends Application{
	
	public void start(Stage primaryStage) {
		
		// Create components
		primaryStage.setTitle("Evergreen Tree");
		
		// circle = sun
		Circle sun = new Circle(200, 200, 50);
		sun.setFill(Color.YELLOW);
		
		
		// triangles = "treeness"
		Polygon top = new Polygon();
		top.getPoints().addAll(new Double[] {
			400.0, 350.0,
			325.0, 450.0,
			475.0, 450.0
		});
		top.setFill(Color.GREEN);
		
		Polygon middle = new Polygon();
		middle.getPoints().addAll(new Double[] {
			400.0, 400.0,
			300.0, 525.0,
			500.0, 525.0
		});
		middle.setFill(Color.GREEN);
		
		Polygon bottom = new Polygon();
		bottom.getPoints().addAll(new Double[] {
			400.0, 475.0,
			285.0, 600.0,
			515.0, 600.0,
		});
		bottom.setFill(Color.GREEN);
		
		// Rectangle for the base of the tree
		Rectangle base = new Rectangle(375, 600, 60, 100);
		base.setFill(Color.SADDLEBROWN);
		
		// Group the tree components
		Group tree = new Group(top, middle, bottom, base);
		
		// Rectangles for rays
		Rectangle ray1 = new Rectangle(195, 50, 10, 75);
		ray1.setFill(Color.YELLOW);
		Rectangle ray2 = new Rectangle(195, 275, 10, 75);
		ray2.setFill(Color.YELLOW);
		Rectangle ray3 = new Rectangle(50, 195, 75, 10);
		ray3.setFill(Color.YELLOW);
		Rectangle ray4 = new Rectangle(275, 195, 75, 10);
		ray4.setFill(Color.YELLOW);
		Rectangle ray5 = new Rectangle(105, 245, 10, 90);
		ray5.setRotate(45.0);
		ray5.setFill(Color.YELLOW);
		Rectangle ray6 = new Rectangle(285, 75, 10, 90);
		ray6.setRotate(45.0);
		ray6.setFill(Color.YELLOW);
		Rectangle ray7 = new Rectangle(285, 245, 10, 90);
		ray7.setRotate(315.0);
		ray7.setFill(Color.YELLOW);
		Rectangle ray8 = new Rectangle(105, 75, 10, 90);
		ray8.setRotate(315.0);
		ray8.setFill(Color.YELLOW);
		
		// A group of rays is called a fever
		Group rays = new Group(ray1, ray2, ray3, ray4, ray5, ray6, ray7, ray8);
		
		// polygon = ground
		Polygon ground = new Polygon();
		ground.getPoints().addAll(new Double[] {
				0.0, 900.0,
				0.0, 500.0,
				200.0, 600.0,
				400.0, 650.0,
				420.0, 620.0,
				500.0, 610.0,
				600.0, 620.0,
				650.0, 610.0,
				700.0, 630.0,
				800.0, 600.0,
				800.0, 900.0,
		});
		ground.setFill(Color.LIGHTGREEN);
		
		// Set components
		Pane pane = new Pane(ground, sun, base, tree, rays);
		
		Scene primaryScene = new Scene(pane, 800, 900);

		// Set scene
		primaryStage.setScene(primaryScene);
		
		// displays stage
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
	
}
