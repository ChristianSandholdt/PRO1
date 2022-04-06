package Exercise06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
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
        Circle circle = new Circle(280, 70, 30);
        pane.getChildren().add(circle);
        circle.setFill(Color.YELLOW);
        circle.setStroke(Color.BLACK);

        Rectangle red = new Rectangle(50,170,100,130);
        pane.getChildren().add(red);
        red.setFill(Color.RED);
        red.setStroke(Color.TRANSPARENT);

        Polygon green = new Polygon(30.0,170.0,100.0,100.0,170.0,170.0);
        pane.getChildren().add(green);
        green.setFill(Color.GREEN);

        Line linje = new Line(30,300,300,300);
        pane.getChildren().add(linje);
        linje.setStroke(Color.BLACK);

        Rectangle black = new Rectangle(70, 210,35,35);
        pane.getChildren().add(black);
        linje.setFill(Color.BLACK);

        Rectangle flagstang = new Rectangle(238,150,2,150);
        pane.getChildren().add(flagstang);
        flagstang.setStroke(Color.BLACK);

        Rectangle overstvenstre = new Rectangle(240,150,35,25);
        pane.getChildren().add(overstvenstre);
        overstvenstre.setFill(Color.RED);

        Rectangle nederstvenstre = new Rectangle(240, 185, 35,25);
        pane.getChildren().add(nederstvenstre);
        nederstvenstre.setFill(Color.RED);

        Rectangle oversthojre = new Rectangle(285,150,45,25);
        pane.getChildren().add(oversthojre);
        oversthojre.setFill(Color.RED);

        Rectangle nedersthojre = new Rectangle(285,185,45,25);
        pane.getChildren().add(nedersthojre);
        nedersthojre.setFill(Color.RED);

        Line overstflag = new Line(240,150,330,150);
        pane.getChildren().add(overstflag);
        overstflag.setStroke(Color.BLACK);

        Line flagkant = new Line(330,150,330,210);
        pane.getChildren().add(flagkant);
        flagkant.setStroke(Color.BLACK);

        Line underkantflag = new Line(330,210,240,210);
        pane.getChildren().add(underkantflag);
        underkantflag.setStroke(Color.BLACK);

    }

}
