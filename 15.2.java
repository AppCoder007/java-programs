// Dona varghese
// Problem 15.2
//COP2800
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class RotateRectangle extends Application {
@Override
public void start(Stage primaryStage) throws Exception {

Pane pane = new Pane();                               
Rectangle rectangle = new Rectangle(150,50);
rectangle.setX(100);
rectangle.setY(100);
rectangle.setFill(Color.BLUE);
rectangle.setStrokeWidth(2);
pane.getChildren().add(rectangle); 

Button rotate = new Button("rotate Rectangle");
pane.getChildren().add(rotate);
rotate.setOnAction(
	new EventHandler<ActionEvent>(){
	public void handle(ActionEvent e){
		  rectangle.setRotate(Math.toDegrees(15));
	}
});


Scene scene = new Scene(pane,250,200);
primaryStage.setTitle("Rotate rectangle");
primaryStage.setScene(scene);
primaryStage.show();
}}
