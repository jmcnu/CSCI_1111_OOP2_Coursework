 /*
  Author: Jan McNulty
  Date: 9/6/22
  */
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.animation.Timeline;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.util.Duration;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
 
import java.io.File;

public class Exercise16_21 extends Application{
	final String URL = "https://liveexample.pearsoncmg.com/common/audio/anthem/anthem0.mp3";
	@Override
	 public void start(Stage primaryStage) throws Exception {
		TextField tfCountDown = new TextField("30");
		tfCountDown.setFont(Font.font("Times New Roman", 50));
		tfCountDown.setPrefColumnCount(3);
		tfCountDown.setAlignment(Pos.CENTER);
		
		Pane pane = new Pane(tfCountDown);
		StackPane stackPane = new StackPane(pane);
		
		Timeline timeline = new Timeline (
			new KeyFrame(Duration.millis(1000), e -> {
				tfCountDown.setText((Integer.parseInt(tfCountDown.getText()) - 1)+ "");
			}));
		
		tfCountDown.setOnAction(e -> {
			if (timeline.getStatus() == Animation.Status.RUNNING) {
				timeline.stop();
				}
			timeline.setCycleCount(Integer.parseInt(tfCountDown.getText()));
			tfCountDown.setEditable(false);
			timeline.play();
			});
		
		File file = new File(URL);
		MediaPlayer mediaplayer = new MediaPlayer(new Media(file.toURI().toString()));
		
		timeline.setOnFinished(e -> {
			mediaplayer.play();
		});
		
		primaryStage.setTitle("Exercise16_21");
		primaryStage.setScene(new Scene(stackPane));
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}


