package Exercise02;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class EX02 extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Gui Demo 1");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }
    private final TextField Number = new TextField();


    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(false);

        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        Label counter = new Label("Number");
        pane.add(counter,0,1);

        pane.add(Number,1,1);
        Number.setPrefWidth(40);


        Button inc = new Button("Inc");
        pane.add(inc,3,1);

        Button dec = new Button("Dec");
        pane.add(dec,3,2);

        inc.setOnAction(event -> this.increaseAction());

        dec.setOnAction(event -> this.decreaseAction());

    }
    public void increaseAction(){
       int Increase = Integer.parseInt(Number.getText())+1;
       Number.setText(Integer.toString(Increase));
    }
    public void decreaseAction(){
        int Decrease = Integer.parseInt(Number.getText())-1;
        Number.setText(Integer.toString(Decrease));
    }
}
