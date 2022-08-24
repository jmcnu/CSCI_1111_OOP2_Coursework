import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.scene.text.Font;


public class Exercise14_15 extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {   
		// Create a scene and place it in the stage
		StackPane pane = new StackPane();
		Polygon polygon = new Polygon();
		polygon.setFill(Color.RED);
		polygon.setStroke(Color.RED);
		polygon.setRotate(22.5);
	
		ObservableList<Double> list = polygon.getPoints();
		
		final double WIDTH = 200, HEIGHT = 200;
		double centerX = WIDTH / 2, centerY = HEIGHT / 2;
		double radius = Math.min(WIDTH, HEIGHT) * 0.4;

		// Add points to the polygon list
		for (int i = 0; i < 8; i++) {
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / 8)); 
			list.add(centerY - radius * Math.sin(2 * i * Math.PI / 8));
		}
		
		Text text = new Text("STOP");
		text.setFont(Font.font("Times New Roman", 40));
		text.setFill(Color.WHITE);
		
		pane.getChildren().addAll(polygon, text);
		
		Scene scene = new Scene(pane,WIDTH,HEIGHT);
		primaryStage.setTitle("Exercise 14_15");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	/**
	 * The main method is only needed for the IDE with limited
	 * JavaFX support. Not needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}


		
		
		
		
 
		
		

		

		



