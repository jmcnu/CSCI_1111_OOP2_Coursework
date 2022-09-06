import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane; 
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.geometry.Pos; 
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;

public class Exercise16_1 extends Application {
	 protected Text text = new Text (50,50, "Programming is fun");
		@Override
		 public void start(Stage primaryStage) throws Exception {
			HBox paneForButtons = new HBox(20);
			Button btleft = new Button("<=");
			Button btright= new Button("=>");
			paneForButtons.getChildren().addAll(btleft, btright);
			paneForButtons.setAlignment(Pos.CENTER);
			BorderPane pane = new BorderPane();
			pane.setBottom(paneForButtons);
			
			HBox paneForRadioButtons = new HBox(20);
			RadioButton rbRed = new RadioButton("Red");
			RadioButton rbYellow = new RadioButton("Yellow");
			RadioButton rbBlack = new RadioButton("Black");
			RadioButton rbOrange = new RadioButton("Orange");
			RadioButton rbGreen = new RadioButton("Green");
			paneForRadioButtons.getChildren().addAll(rbRed, rbYellow, rbBlack, rbOrange, rbGreen);
			
			ToggleGroup group = new ToggleGroup();
			rbRed.setToggleGroup(group);
			rbYellow.setToggleGroup(group);
			rbBlack.setToggleGroup(group);
			rbOrange.setToggleGroup(group);
			rbGreen.setToggleGroup(group);
			
			Pane paneForText = new Pane();
			paneForText.setStyle("-fx-border-color: black");
			paneForText.getChildren().add(text);
			pane.setCenter(paneForText);
			pane.setTop(paneForRadioButtons);
			
			btleft.setOnAction(e -> {
				if(text.getX() < 15)
					text.setX() < 10;
					else {
						text.setX(text.getX()-10);
					}
			}
			
			btright.setOnAction(e ->  {
				if (text.getX() > 300)
					text.setX() = 310;
				else {
					text.setX(text.getX()+ 10);
				}
			}
			
			rbRed.setOnAction(e -> {
				if (rbRed.isSelected()) {
					text.setFill(Color.RED);
				}
			});
			
			rbYellow.setOnAction(e -> {
				if (rbYellow.isSelected()) {
					text.setFill(Color.YELLOW);
				}
			});
			
			rbBlack.setOnAction(e -> {
				if (rbBlack.isSelected()) {
					text.setFill(Color.BLACK);
				}
			});
			
			rbOrange.setOnAction(e -> {
				if (rbOrange.isSelected()) {
					text.setFill(Color.ORANGE);
				}
			});
			
			rbGreen.setOnAction(e -> {
				if (rbGreen.isSelected()) {
					text.setFill(Color.GREEN);
				}
			});
			
			Scene scene = new Scene(pane, 450, 150);
			primaryStage.setTitle("Exercise16_1");
			primaryStage.setScene(scene);
			primaryStage.show();
	}
		public static void main(String[] args) {
			launch(args);
		}
	}

	}
	}

}
