package Exercise04;

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
        Circle yderst = new Circle(70, 70, 50);
        pane.getChildren().add(yderst);
        yderst.setFill(Color.BLACK);
        yderst.setStroke(Color.BLACK);

        Circle andenyderst = new Circle(70,70,40);
        pane.getChildren().add(andenyderst);
        andenyderst.setFill(Color.WHITE);
        andenyderst.setStroke(Color.WHITE);

        Circle andeninderst = new Circle(70,70, 30);
        pane.getChildren().add(andeninderst);
        andeninderst.setFill(Color.BLACK);
        andeninderst.setStroke(Color.BLACK);

        Circle inderst = new Circle(70,70 ,20);
        pane.getChildren().add(inderst);
        inderst.setFill(Color.WHITE);
        inderst.setStroke(Color.WHITE);

        Circle midt = new Circle(70,70,10);
        pane.getChildren().add(midt);
        midt.setFill(Color.BLACK);
        midt.setStroke(Color.BLACK);

    }

}
