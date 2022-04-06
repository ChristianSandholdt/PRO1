package Exercise01;

import guidemoes.guidemo_1.App;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class EX01 extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle("Gui Demo 1");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    private final TextField txfllName = new TextField();
    private final TextField txfName = new TextField();
    private final TextField txlName = new TextField();


    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(false);

        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        // add a label to the pane (at col=0, row=0)
        Label lblfName = new Label("Firstname:");
        pane.add(lblfName, 0, 0);

        Label lbllname = new Label("Lastname:");
        pane.add(lbllname, 1,0);

        Label lblfllName = new Label("Full name");
        pane.add(lblfllName,0,2);

        // add a text field to the pane (at col=1, row=0, extending 2 columns and 1 row)
        pane.add(txfName, 0, 1);

        pane.add(txlName, 1,1);

        pane.add(txfllName,0,3,2,1);

        Button combine = new Button("Combine");
        pane.add(combine,1,5);
        GridPane.setMargin(combine, new Insets(10,10,0,10));

        combine.setOnAction(Event -> this.combineAction());
    }

    public void combineAction(){
        String name = txfName.getText() + " " + txlName.getText();
        txfllName.setText(name);
    }

}
