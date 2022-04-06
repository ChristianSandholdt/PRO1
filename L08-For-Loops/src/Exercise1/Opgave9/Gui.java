package Exercise1.Opgave9;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Gui extends Application {

	@Override
	public void start(Stage stage) {
		GridPane root = this.initContent();
		Scene scene = new Scene(root);

		stage.setTitle("Loops");
		stage.setScene(scene);
		stage.show();
	}

	private GridPane initContent() {
		GridPane pane = new GridPane();
		Canvas canvas = new Canvas(200, 200);
		pane.add(canvas, 0, 0);
		this.drawShapes(canvas.getGraphicsContext2D());
		return pane;
	}

	// ------------------------------------------------------------------------

	private void drawShapes(GraphicsContext gc) {
		// Replace the statement here with your code.
		// y1 + y2 = 0.7x
		double x = 180;
		double y = 65;
		double x2 = x;
		double y2 = 190;
		while (x > 5){
			gc.strokeLine(x, y, x2, y2);
			y += (x - x*0.75)/5;
			y2 -= (x - x*0.75)/2;
			x *= 0.75;
			x2 = x;

		}


	}
}
