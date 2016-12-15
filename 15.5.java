// Dona varghese
// Problem 15.5
// COP2800

import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;


public class investmentValue extends Application {
	
	TextField invest = new TextField();
	TextField noofYears = new TextField();
	TextField annual = new TextField();
	TextField future = new TextField();
	Button calculate = new Button("Calculate");
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane gridpane = new GridPane();
		gridpane.setVgap(5);
		gridpane.add(new Label("Investment Amount: "), 0, 0);
		gridpane.add(invest,1,0);
		gridpane.add(new Label("Number of Years "), 0, 1);
		gridpane.add(noofYears,1,1);
		gridpane.add(new Label("Annual Interst Rate: "), 0, 2);
		gridpane.add(annual,1,2);
		gridpane.add(new Label("Future Value: "), 0, 3);
		gridpane.add(future,1,3);
		gridpane.add(calculate, 1, 5);
			
		GridPane.setHalignment(calculate, HPos.RIGHT);
		future.setEditable(false);
		
		calculate.setOnAction(e -> futureVaLUE());
		
		Scene scene = new Scene(gridpane);
		primaryStage.setTitle("Exercise14_19");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private void futureVaLUE() {
	double invAmt = Double.parseDouble(invest.getText());
	double years = Double.parseDouble(noofYears.getText());
	double annualR = Double.parseDouble(annual.getText());
		
	double total = invAmt * Math.pow(1+(annualR/100/12), years*12);
	future.setText(String.format("$%.2f",total));
		
	}
}
