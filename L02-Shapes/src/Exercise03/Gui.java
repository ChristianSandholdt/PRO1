package Exercise03;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
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
        Circle circle = new Circle(150, 70, 50);
        pane.getChildren().add(circle);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);

        Circle oje1 = new Circle(135, 65,5);
        pane.getChildren().add(oje1);
        oje1.setFill(Color.WHITE);
        oje1.setStroke(Color.BLACK);

        Circle oje2 = new Circle(165,65,5);
        pane.getChildren().add(oje2);
        oje2.setFill(Color.WHITE);
        oje2.setStroke(Color.BLACK);

        Line mund = new Line(130, 95, 170,95);
        pane.getChildren().add(mund);
        mund.setStroke(Color.BLACK);


    }

}
