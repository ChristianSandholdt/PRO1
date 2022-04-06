package Exercise05;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Gui extends Application {

    @Override
    public void start(Stage stage) {
        Pane root = this.initContent();
        Scene scene = new Scene(root);

        stage.setTitle("Shapes");
        stage.setScene(scene);
        stage.show();
    }

    private Pane initContent() {
        Pane pane = new Pane();
        pane.setPrefSize(400, 400);
        this.drawShapes(pane);
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(Pane pane) {
        Circle blue = new Circle(70, 70, 40);
        pane.getChildren().add(blue);
        blue.setFill(Color.TRANSPARENT);
        blue.setStroke(Color.BLUE);

        Circle black = new Circle(150,70,40);
        pane.getChildren().add(black);
        black.setFill(Color.TRANSPARENT);
        black.setStroke(Color.BLACK);

        Circle red = new Circle(230, 70,40);
        pane.getChildren().add(red);
        red.setStroke(Color.RED);
        red.setFill(Color.TRANSPARENT);

        Circle yellow = new Circle(110,110,40);
        pane.getChildren().add(yellow);
        yellow.setStroke(Color.YELLOW);
        yellow.setFill(Color.TRANSPARENT);

        Circle green = new Circle(190,110,40);
        pane.getChildren().add(green);
        green.setStroke(Color.GREEN);
        green.setFill(Color.TRANSPARENT);


    }

}
