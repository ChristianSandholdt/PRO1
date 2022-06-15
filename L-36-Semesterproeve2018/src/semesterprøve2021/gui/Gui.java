package semesterprøve2021.gui;

import javafx.application.Application;
import javafx.beans.InvalidationListener;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import semesterprøve2021.model.Deltagelse;
import semesterprøve2021.model.Fag;
import semesterprøve2021.model.Lektion;
import semesterprøve2021.storage.Storage;

public class Gui extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Fraværssystem");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    // Fields:
    private final ListView<Fag> lvwFag = new ListView<>();
    private final ListView<Lektion> lvwLektion = new ListView<>();
    private final ListView<Deltagelse> lvwDeltagelse = new ListView<>();

    private final ToggleGroup group = new ToggleGroup();

    private void initContent(GridPane pane) {
        pane.setPadding(new Insets(20));
        pane.setHgap(20);
        pane.setVgap(10);
        pane.setGridLinesVisible(false);


        Label lblFag = new Label("Fag:");
        pane.add(lblFag, 0, 0);
        pane.add(lvwFag, 0, 1);

        ChangeListener<Fag> listener =
                (obs, o, n) -> this.fagsSelectionChanged();
        lvwFag.getSelectionModel().selectedItemProperty().addListener(listener);

        Label lblLektion = new Label("Lektion:");
        pane.add(lblLektion, 1, 0);
        pane.add(lvwLektion, 1, 1);
        ChangeListener<Lektion> listnerLektion = (obs, o, n) -> this.lektionSelectionChanged();
        lvwLektion.getSelectionModel().selectedItemProperty().addListener(listnerLektion);

        Label lblDeltagelse = new Label("Deltagelse:");
        pane.add(lblDeltagelse, 2, 0);
        pane.add(lvwDeltagelse, 2, 1);

        Label lblFraværsÅrsager = new Label("Fraværsårsager:");
        Button btnFravær = new Button("Fravær");
        pane.add(lblFraværsÅrsager, 3, 0);
        pane.add(btnFravær, 3, 2);
        btnFravær.setOnAction(event -> this.btnFraværAction());

        // add a VBox (vertical box) to the pane (at col=3, row=1)
        VBox box = new VBox();
        pane.add(box, 3, 1);

        String[] colorStrings = { "Tilstede", "Fravær", "Syg", "Afbud" };
        Color[] colors = { Color.RED, Color.BLUE, Color.GREEN, Color.BLACK };

        // add 4 radio buttons to the box
        for (int i = 0; i < colors.length; i++) {
            RadioButton rb = new RadioButton();
            box.getChildren().add(rb);
            rb.setText(colorStrings[i]);
            // make the radio button remember its own color
            rb.setUserData(colors[i]);
            // ensure that only one radio button is in selected state
            rb.setToggleGroup(group);
        }
        this.fillFagList();
    }

        // -------------------------------------------------------------------------

    private void fillFagList() {
        lvwFag.getItems().clear();
        lvwFag.getItems().addAll(Storage.getFag());
    }

    private void fillLektionList(Fag fag) {
        lvwLektion.getItems().clear();
        lvwLektion.getItems().addAll(fag.getLektioner());
    }

    private void fillDeltagerList(Lektion lektion){
        lvwDeltagelse.getItems().clear();
        lvwDeltagelse.getItems().addAll(lektion.getDeltagelser());
    }

    private void fagsSelectionChanged() {
        Fag selected = lvwFag.getSelectionModel().getSelectedItem();
        if (selected != null){
            this.fillLektionList(selected);
        }
    }
    private void lektionSelectionChanged(){
        Lektion selected = lvwLektion.getSelectionModel().getSelectedItem();
        if (selected != null){
            this.fillDeltagerList(selected);
        }
    }

    private void btnFraværAction(){
        
    }



}
