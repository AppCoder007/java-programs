// Dona varghese
// Problem 15.7
// COP2800

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.*;
import javafx.stage.Stage;
import javafx.scene.paint.*;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.scene.shape.*;
import javafx.collections.ObservableList;
public class ShowCircle extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		
		Circle circle = new Circle();
		circle.centerXProperty().bind(pane.widthProperty().divide(2));
		circle.centerYProperty().bind(pane.heightProperty().divide(2));
		circle.setRadius(50);
		circle.setStroke(Color.RED);
		circle.setFill(Color.WHITE);
		pane.getChildren().add(circle);
		

		
		circle.setOnMousePressed(
				new EventHandler<MouseEvent>() {
				public void handle(MouseEvent arg0){
				circle.setFill(Color.BLACK);
				}});
				circle.setOnMouseReleased(
				new EventHandler<MouseEvent>() {
				public void handle(MouseEvent arg0){
				circle.setFill(Color.WHITE);
				}});
		
		Scene scene = new Scene(pane, 200 , 200);
		primaryStage.setTitle("ShowCircle");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
