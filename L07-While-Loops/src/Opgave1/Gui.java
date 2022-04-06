package Opgave1;

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
		// a) Make an application that draws two arrowheads at (100,75) and (100,125).
		int x = 100;
		int y = 75;
		gc.strokeLine(x,y ,x+20 ,y-4);
		gc.strokeLine(x,y ,x+20 ,y+4);
		int p = 100;
		int q = 125;
		gc.strokeLine(p,q ,p+20 ,q-4);
		gc.strokeLine(p,q ,p+20 ,q+4);
		//b) Add some code, so the application shows a third arrowhead at (20,50).
		int k = 20;
		int m = 50;
		gc.strokeLine(k,m,k+20,m-4);
		gc.strokeLine(k,m,k+20,m+4);
		// c) Change the code, so all the arrowheads have twice the length.
		//Ændret koden fra v2 x+10 til v2 x+20

		//d) How could you use variables to make it easy to change the size (both horizontally and
		//vertically) of all arrowheads? (You can assume that all arrowheads have the same size.)

		// By using variables for x and y values
	}
}
