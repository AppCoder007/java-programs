//  Dona varghese
// problem no 15.4

import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class SimpleCalculator extends Application {

	
TextField Number1 = new TextField();
TextField Number2 = new TextField();
TextField Result = new TextField();
Button add = new Button("ADD");
Button sub = new Button("Subtract");
Button mul = new Button("Multiply");
Button div = new Button("Divide");



@Override
public void start(Stage primaryStage) throws Exception {
	
GridPane gridpane = new GridPane();
gridpane.setVgap(5);
gridpane.add(new Label("Number1: "), 0, 0);
gridpane.add(Number1,1,0);
gridpane.add(new Label("Number2: "), 2, 0);
gridpane.add(Number2,3,0);
gridpane.add(new Label("Result: "), 4, 0);
gridpane.add(Result,5,0);
gridpane.add(add, 1, 1);
gridpane.add(sub, 2, 1);
gridpane.add(mul, 3, 1);
gridpane.add(div, 4, 1);

Result.setEditable(false);

add.setOnAction(e -> addition());
sub.setOnAction(e -> subtraction());
mul.setOnAction(e -> multiplication());
div.setOnAction(e -> division());


Scene scene = new Scene(gridpane);
primaryStage.setTitle("Exercise14_19");
primaryStage.setScene(scene);
primaryStage.show();
	}



private void division() {
	double num1 = Double.parseDouble(Number1.getText());
	double num2 = Double.parseDouble(Number2.getText());
	double total = num1 / num2;
	Result.setText(String.format(""+total));
}



private void multiplication() {
	double num1 = Double.parseDouble(Number1.getText());
	double num2 = Double.parseDouble(Number2.getText());
	double total = num1 * num2;
	Result.setText(String.format(""+total));
}



private void subtraction() {
	double num1 = Double.parseDouble(Number1.getText());
	double num2 = Double.parseDouble(Number2.getText());
	double total = num1 - num2;
	Result.setText(String.format(""+total));
}



private void addition() {
	double num1 = Double.parseDouble(Number1.getText());
	double num2 = Double.parseDouble(Number2.getText());	
	double total = num1 + num2;
	Result.setText(String.format(""+total));
	
}

}
