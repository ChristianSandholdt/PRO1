package Exercise1.Opgave6;

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
		// X akse
		String s;
		int y1 = 155;
		int y2 = 165;
		for (int i = 0; i < 11; i++){
			int x = 10 + i*15;
			if (i % 5 == 0) {
				gc.strokeLine(x,y1-5,x,y2+5);
				s = "" + i;
				gc.fillText(s,x,y2+12);
			}
			gc.strokeLine(x,y1,x,y2);

		}
		// Arrow
		gc.strokeLine(0, 160, 180, 160);
		int v = 180;
		int w = 160;
		gc.strokeLine(v,w, v-10, w-5);
		gc.strokeLine(v,w, v-10, w+5);

	}
}
