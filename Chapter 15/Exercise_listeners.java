import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;

public class Exercise_listeners extends Application{
	@Override //
	 public void start(Stage primaryStage) throws Exception {
		
		double width = 400;
		double height = 400;
		BallPane ballpane = new BallPane(width / 2,height / 2,Math.min(width, height)/ 15);
		
		Button btUp = new Button("Up");
		btUp.setOnAction(e -> ballpane.moveUp());
		
		Button btDown = new Button("Down");
		btDown.setOnAction(e -> ballpane.moveDown());
		
		Button btRight = new Button("Right");
		btRight.setOnAction(e -> ballpane.moveRight());
		
		Button btLeft = new Button("Left");
		btLeft.setOnAction(e -> ballpane.moveLeft());
		
		HBox buttons = new HBox(btUp, btDown, btRight, btLeft);
		buttons.setAlignment(Pos.BOTTOM_CENTER);
		buttons.setSpacing(10);
		buttons.setPadding(new Insets(10,10,10,10));
		
		
		BorderPane pane = new BorderPane();
		pane.setCenter(ballpane);
		pane.setBottom(buttons);
		
		Scene scene = new Scene(pane, width, height);
		 primaryStage.setTitle("Exercise_Listeners");
		 primaryStage.setScene(scene);
		 primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
