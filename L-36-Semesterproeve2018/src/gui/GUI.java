package gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.Arrangement;
import model.Tutor;

public class GUI extends Application {

    public static void main(String[] args) {
        Application.launch(args);

    }
    @Override
    public void start(Stage stage) {
        stage.setTitle("Administration af tutorer og arrangementer");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    private final ListView<Tutor> lvTutor = new ListView<>();
    private final TextField txfName = new TextField();

    private final TextField txfEmail = new TextField();

    private final ListView<Arrangement> lvArrangement = new ListView<>();

    private final ListView<Arrangement> lvAlleArrangementer = new ListView<>();


    private void initContent(GridPane pane) {
        pane.setGridLinesVisible(false);
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);


        //Tutorer
        Label labelTutor = new Label("Tutorer");
        pane.add(labelTutor,0,0);

        pane.add(lvTutor,0,1);
        lvTutor.setPrefWidth(200);
        lvTutor.setPrefHeight(250);

        //Navn
        Label lblName = new Label("Name: ");
        pane.add(lblName,1,0);
        pane.add(txfName,2,0);

        //Email
        Label lblEmail = new Label("Email: ");
        pane.add(lblName,1,1);
        pane.add(txfEmail,2,1);

        //Arrangementer
        Label lblArrangement = new Label("Arrangementer");
        pane.add(lblArrangement,1,2);
        pane.add(lvArrangement,2,2);

        Label lblAlleArrangementer = new Label("Alle mulige arrangementer");
        pane.add(lblAlleArrangementer,3,1);
        pane.add(lvAlleArrangementer,3,2);


        //Buttons
        Button btnfjern = new Button("Fjern");
        pane.add(btnfjern,2,3);

        Button btnTilføj = new Button("Tilføj");
        pane.add(btnTilføj,3,3);
    }

}
