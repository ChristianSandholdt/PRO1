package gui;

import controller.Controller;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Bestilling;
import model.Forestilling;
import model.Kunde;
import storage.Storage;

import java.util.List;

public class GUI extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Tester bestillinger");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    private final ListView<Forestilling> lvwForestillinger = new ListView<>();
    private final ListView<Kunde> lvwKunder = new ListView<Kunde>();
    private final TextArea txaBestillinger = new TextArea();
    private final TextField txfDato = new TextField();
    private final TextField txfKundeNavn = new TextField();
    private final TextField txfKundeMobil = new TextField();

    private void initContent(GridPane pane) {
        pane.setPadding(new Insets(20));
        pane.setHgap(20);
        pane.setVgap(10);
        pane.setGridLinesVisible(false);

        Label lblForestillinger = new Label("Forestillinger");
        pane.add(lblForestillinger,0,0);
        pane.add(lvwForestillinger,0,1);
        ChangeListener<Forestilling> listenerForestilling = (obs, o, n) -> this.forestillingSelectionChanged();
        lvwForestillinger.getSelectionModel().selectedItemProperty().addListener(listenerForestilling);

        //Kunder
        Label lblKunder = new Label("Kunder");
        pane.add(lblKunder,1,0);
        pane.add(lvwKunder,1,1);
        ChangeListener<Kunde> listenerKunde = (obs, o, n) -> this.kundeSelectionChanged();
        lvwKunder.getSelectionModel().selectedItemProperty().addListener(listenerKunde);

        //Dato
        Label lblDato = new Label("Dato");
        pane.add(lblDato,2,0);
        lblDato.setAlignment(Pos.TOP_CENTER);

        //Kunde
        Label lblKundeNavn = new Label("Kundenavn");
        pane.add(lblKundeNavn,1,3);
        pane.add(txfKundeNavn,1,4);

        Label lblKundeMobil = new Label("Kundemobil");
        pane.add(lblKundeMobil,1,5);
        pane.add(txfKundeMobil,1,6);
        Button btnOpretKunde = new Button("Opret Kunde");
        pane.add(btnOpretKunde,1,7);
        btnOpretKunde.setOnAction(event -> this.opretKundeAction());

        Button btnVisBestiltePladser = new Button("Vis bestilte pladser");
        Label lblBestiltePladser = new Label("Bestilte pladser");

        VBox vbox = new VBox(20);
        pane.add(vbox,2,1);

        vbox.setAlignment(Pos.TOP_CENTER);
        vbox.getChildren().add(txfDato);
        vbox.getChildren().add(btnVisBestiltePladser);
        vbox.getChildren().add(lblBestiltePladser);
        vbox.getChildren().add(txaBestillinger);
        txaBestillinger.setPrefColumnCount(7);
        txaBestillinger.setPrefRowCount(15);

        this.fillForestillingList();
        this.fillKundeList();
    }

    private void fillForestillingList(){
        lvwForestillinger.getItems().clear();
        lvwForestillinger.getItems().addAll(Storage.getForestillinger());
    }

    private void forestillingSelectionChanged(){
        Forestilling selected = lvwForestillinger.getSelectionModel().getSelectedItem();
        if (selected != null){
            this.fillKundeList();
        }
    }

    private void fillKundeList(){
        lvwKunder.getItems().clear();
        lvwKunder.getItems().addAll(Storage.getKunder());
    }

    private void kundeSelectionChanged(){
        Kunde selected = lvwKunder.getSelectionModel().getSelectedItem();
        if (selected != null){
            this.fillKundeList();
        }
    }

    private void opretKundeAction(){
        String name = txfKundeNavn.getText().trim();
        String number = txfKundeMobil.getText().trim();
        if (!name.isBlank() && !number.isBlank()){
            Controller.opretKunde(name,number);
        }
        lvwKunder.getItems().setAll(Storage.getKunder());
    }




}
