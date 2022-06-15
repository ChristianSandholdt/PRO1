package gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.Forestilling;
import model.Kunde;

import java.util.List;

public class GUI extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Fraværssystem");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    private final ListView<Forestilling> lvwForestillinger = new ListView<>();

    private final ListView<Kunde> lvwKunder = new ListView<Kunde>();
    private void initContent(GridPane pane) {
        pane.setPadding(new Insets(20));
        pane.setHgap(20);
        pane.setVgap(10);
        pane.setGridLinesVisible(false);

        Label lblForestillinger = new Label("Forestillinger");
        pane.add(lblForestillinger,0,0);
        pane.add(lvwForestillinger,0,1);


        Label lblKunder = new Label("Kunder");
        pane.add(lblKunder,1,0);
        pane.add
    }



}
