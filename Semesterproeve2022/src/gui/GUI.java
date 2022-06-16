package gui;

import controller.Controller;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.Medarbejder;
import model.Vagt;
import storage.Storage;


public class GUI extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Kantinens vagtplanlægning");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    private final ListView<Medarbejder> lvwMedarbejdere = new ListView<>();
    private final ListView<Vagt> lvwVagter = new ListView<>();

    private final TextArea txaValgtVagt = new TextArea();

    private void initContent(GridPane pane) {
        pane.setPadding(new Insets(20));
        pane.setHgap(20);
        pane.setVgap(10);
        pane.setGridLinesVisible(false);


        //Medarbejdere
        Label lblMedarbejdere = new Label("Alle medarbejdere");
        pane.add(lblMedarbejdere,0,0);
        pane.add(lvwMedarbejdere,0,1);
        lvwMedarbejdere.setPrefWidth(250);
        lvwMedarbejdere.setPrefHeight(300);

        //Vagter
        Label lblVagter = new Label("Alle vagter");
        pane.add(lblVagter,1,0);
        pane.add(lvwVagter,1,1);
        lvwVagter.setPrefWidth(250);
        lvwVagter.setPrefHeight(300);

        //Valgt vagt
        Label lblValgtVagt = new Label("Valgt vagt");
        pane.add(lblValgtVagt,2,0);
        pane.add(txaValgtVagt,2,1);
        txaValgtVagt.setPrefRowCount(15);
        txaValgtVagt.setPrefColumnCount(18);
        txaValgtVagt.setEditable(false);
        ChangeListener<Vagt> listenerVagt = (obs, o, n) -> this.vagtSelectionChanged();
        lvwVagter.getSelectionModel().selectedItemProperty().addListener(listenerVagt);


        //Knapper
        Button btnTildelVagt = new Button("Tildel vagt");
        Button btnUdskrivVagtTilFil = new Button("Udskriv vagt til fil");
        pane.add(btnTildelVagt,1,2);
        pane.add(btnUdskrivVagtTilFil,2,2);
        btnTildelVagt.setOnAction(actionEvent -> this.tildelVagtAction());


        //Metoder
        this.fillMedarbejderList();
        this.fillVagterList();
    }

    private void fillMedarbejderList(){
        lvwMedarbejdere.getItems().clear();
        lvwMedarbejdere.getItems().addAll(Storage.getMedarbejdere());
    }

    private void fillVagterList(){
        lvwVagter.getItems().clear();
        lvwVagter.getItems().addAll(Storage.getVagter());
    }

    private void fillValgtVagt(){
        txaValgtVagt.setText(this.txaValgtVagtBeskrivelse());

    }

    public String txaValgtVagtBeskrivelse(){
        StringBuilder sb = new StringBuilder();
        sb.append("Navn: ").append(lvwVagter.getSelectionModel().getSelectedItem().getNavn()).append("\n");
        sb.append(lvwVagter.getSelectionModel().getSelectedItem().getTidFra().toString()).append("\n");
        sb.append(lvwVagter.getSelectionModel().getSelectedItem().getTidTil().toString()).append("\n");
        sb.append("Status: \n");
        sb.append("Tilknyttede medarbejdere: \n");
        for (Medarbejder m : lvwVagter.getSelectionModel().getSelectedItem().getMedarbejdere()){
            String navn = m.getNavn();
            sb.append(navn).append(", ");
        }
        return sb.toString();
    }


    private void vagtSelectionChanged(){
        Vagt selected = lvwVagter.getSelectionModel().getSelectedItem();
        if (selected != null){
            this.fillValgtVagt();
        }
    }

    private void tildelVagtAction(){
        Medarbejder m = lvwMedarbejdere.getSelectionModel().getSelectedItem();
        Vagt v = lvwVagter.getSelectionModel().getSelectedItem();
        m.addVagt(v);
    }

}

