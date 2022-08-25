import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class Exercise14_28 extends Application{
	@Override //
	 public void start(Stage primaryStage) {
		 ClockPane clock = new ClockPane((int)(Math.random()*12),((int)(Math.random()*2) == 1 ? 30 :0 ), 0, true, true);
		 String timeString = clock.getHour() + ":" + clock.getMinute()+ ":" + clock.getSecond();
		 clock.sethourHandVisible(true);
		 clock.setminuteHandVisible(true);
		 Label time =new Label(timeString);
		 
		 BorderPane pane = new BorderPane();
		 pane.setCenter(clock);
		 pane.setBottom(time);
		 BorderPane.setAlignment(time, Pos.TOP_CENTER);
		 
		 Scene scene = new Scene(pane, 250, 250);
		 primaryStage.setTitle("Exercise 14_28");
		 primaryStage.setScene(scene);
		 primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
