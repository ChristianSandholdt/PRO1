package Exercise01.Figurer02;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import static java.awt.Color.YELLOW;

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

        Color yellow = Color.YELLOW;

        Circle circle = new Circle(170, 70, 30);
        pane.getChildren().add(circle);
        circle.setFill(yellow);
        circle.setStroke(Color.BLACK);

        Rectangle r = new Rectangle(220, 50, 100, 50);
        pane.getChildren().add(r);
        r.setFill(yellow);
        r.setStroke(Color.CORNFLOWERBLUE);

        Line line = new Line(220, 230, 140, 150);
        pane.getChildren().add(line);
        line.setStroke(yellow);


    }

}
