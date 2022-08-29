import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.animation.FadeTransition;
import javafx.collections.ObservableList;

public class Exercise_Animation  extends Application{
	@Override //
	 public void start(Stage primaryStage) {
		Pane pane = new Pane();
		Rectangle rectangle = new Rectangle (0, 0, 25, 50);
		rectangle.setFill(Color.BLUE);
		
		Polygon pentagon = new Polygon();
		pentagon.setFill(Color.WHITE);
		pentagon.setStroke(Color.BLACK);
		ObservableList<Double> list = pentagon.getPoints();
		
		final double WIDTH = 200, HEIGHT = 200;
		double centerX = WIDTH / 2, centerY = HEIGHT / 2;
		double radius = Math.min(WIDTH, HEIGHT) * 0.4;
		
		 for (int i = 0; i < 6; i++) {
			 list.add(centerX + radius * Math.cos(2 * i * Math.PI / 6));
			 list.add(centerY - radius * Math.sin(2 * i * Math.PI / 6));
		 }
		
		pane.getChildren().add(pentagon);
		pane.getChildren().add(rectangle);
		
		PathTransition pt = new PathTransition();
		pt.setDuration(Duration.millis(4000));
		pt.setPath(pentagon);
		pt.setNode(rectangle);
		
		pt.setOrientation(
				PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.setAutoReverse(true);
		pt.play();
		
	pane.setOnMouseClicked(event -> {
		if (event.getButton() == MouseButton.PRIMARY) {
			 pt.pause();
		
		}
		else	if (event.getButton() == MouseButton.SECONDARY) {
			pt.play();
		}
	});
		
		
		
		FadeTransition ft = 
				new FadeTransition(Duration.millis(3000), rectangle);
		ft.setFromValue(1.0);
		ft.setToValue(0.1);
		ft.setCycleCount(Timeline.INDEFINITE);
		ft.setAutoReverse(true);
		ft.play();
		


				 
	
				rectangle.setOnMouseClicked(e -> ft.play());
				rectangle.setOnMouseClicked(e -> ft.pause());

		
		
		
		Scene scene = new Scene(pane, 250, 200);
		primaryStage.setTitle("Exercise_Animation");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}


}
