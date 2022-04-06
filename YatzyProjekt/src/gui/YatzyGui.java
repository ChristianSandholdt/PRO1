package gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import model.YatzyDice;

public class YatzyGui extends Application {
    private YatzyDice dice = new YatzyDice();

    @Override
    public void start(Stage stage) {
        stage.setTitle("Yatzy");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    // -------------------------------------------------------------------------

    // Shows the face values of the 5 dice.
    private final TextField[] txfValues = new TextField[5];
    // Shows the hold status of the 5 dice.
    private final CheckBox[] cbxHolds = new CheckBox[5];
    // Shows the obtained results.
    // For results not set yet, the possible result of 
    // the actual face values of the 5 dice are shown.
    private final TextField[] txfResults = new TextField[17];
    // Shows points in sums, bonus and total.
    private final TextField txfSumSame = new TextField(), txfBonus = new TextField(),
            txfSumOther = new TextField(), txfTotal = new TextField();

    private final Button btnRoll = new Button("Roll");

    private void initContent(GridPane pane) {
        pane.setGridLinesVisible(true);
        pane.setPadding(new Insets(10));
        pane.setHgap(10);
        pane.setVgap(10);

        // ---------------------------------------------------------------------

        GridPane dicePane = new GridPane();
        pane.add(dicePane, 0, 0);
        //  dicePane.setGridLinesVisible(true);
        dicePane.setPadding(new Insets(10));
        dicePane.setHgap(10);
        dicePane.setVgap(10);
        dicePane.setStyle("-fx-border-color: black");

        // add txfValues, chbHolds, lblRolled and btnRoll
        // TODO

        for (int i = 0; i < 5; i++) {
            txfValues[i] = new TextField();
            dicePane.add(txfValues[i], i, 0);
            txfValues[i].setPrefHeight(100);
            txfValues[i].setPrefWidth(100);
            txfValues[i].setFont(Font.font(50));
            txfValues[i].setEditable(false);
        }
        for (int i = 0; i < 5; i++) {
            cbxHolds[i] = new CheckBox("Hold");
            cbxHolds[i].setOnAction(actionEvent -> lock());
            dicePane.add(cbxHolds[i], i, 1);
            cbxHolds[i].setDisable(true);
        }

    //    dicePane.add(lblRolled, 2, 2);

        dicePane.add(btnRoll, 2, 2);
        btnRoll.setPrefWidth(100);
        btnRoll.setPrefHeight(40);
        btnRoll.setOnAction(event -> this.btnRollOnAction());

        // ---------------------------------------------------------------------

        GridPane scorePane = new GridPane();
        pane.add(scorePane, 0, 1);
        //scorePane.setGridLinesVisible(true);
        scorePane.setPadding(new Insets(10));
        scorePane.setVgap(5);
        scorePane.setHgap(10);
        scorePane.setStyle("-fx-border-color: black");
        int w = 50; // width of the text fields
        String[] lblNames = {
                "1-s", "2-s", "3-s", "4-s", "5-s", "6-s", "", "", "One Pair", "Two Pair",
                "Three-same", "Four-same", "Full-House", "Small Str.", "Large Str.",
                "Chance", "Yatzy"};

        // add labels for results, add txfResults,
        // add labels and text fields for sums, bonus and total.
        // TODO

        for (int i = 0; i < 17; i++) {
            txfResults[i] = new TextField();
            if (i == 6){
                i++;
            } else {
            scorePane.add(txfResults[i], 1, i);
            txfResults[i].setPrefWidth(w);
            scorePane.add(new Label(lblNames[i]), 0, i);
            txfResults[i].setEditable(false);
            txfResults[i].setOnMouseClicked(this::mouseClicked);
            txfResults[i].setFocusTraversable(false);
            }
        }

        scorePane.add(txfSumSame, 3, 5);
        txfSumSame.setPrefWidth(w);
        Label lblSumSame = new Label("Sum");
        scorePane.add(lblSumSame, 2, 5);
        txfSumSame.setEditable(false);
        txfSumSame.setFocusTraversable(false);

        scorePane.add(txfBonus, 3,6);
        txfBonus.setPrefWidth(w);
        Label lblBonus = new Label("Bonus");
        scorePane.add(lblBonus, 2, 6);
        txfBonus.setEditable(false);
        txfBonus.setFocusTraversable(false);

        scorePane.add(txfSumOther, 3, 16);
        txfSumOther.setPrefWidth(w);
        Label lblSumOther = new Label("Sum");
        scorePane.add(lblSumOther, 2, 16);
        txfSumOther.setEditable(false);
        txfSumOther.setFocusTraversable(false);

        scorePane.add(txfTotal, 3, 17);
        txfTotal.setPrefWidth(w);
        Label lblTotal = new Label("TOTAL");
        scorePane.add(lblTotal, 2, 17);
        txfTotal.setEditable(false);
        txfTotal.setFocusTraversable(false);
    }

    private void showSumSame(){
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            if (txfResults[i].isDisabled()) {
                sum += Integer.parseInt(txfResults[i].getText());
            }
        } txfSumSame.setText("" + sum );
    }

    private void showBonus(){
        if (Integer.parseInt(txfSumSame.getText()) >= 63){
            txfBonus.setText("" + 50);
        }
    }

    private void showSumOther(){
        int sum = 0;
        for (int i = 8; i < 17; i++) {
            if (txfResults[i].isDisabled()) {
                sum += Integer.parseInt(txfResults[i].getText());
            }
        } txfSumOther.setText("" + sum );
    }

   private void total(){
        int sumSame = Integer.parseInt(txfSumSame.getText());
        int sumOther = Integer.parseInt(txfSumOther.getText());
        int bonus = Integer.parseInt(txfBonus.getText());
        txfTotal.setText("" + (sumSame + sumOther + bonus));
    }

    private void showResults(){
        for (int i = 0; i < 17; i++){
            if (i == 6) {
                i++;
            }else {
                if (!txfResults[i].isDisabled()){
                    txfResults[i].setText("" + dice.getResults()[i]);
                }
            }
        }
    }

    private void lock() {
        for (int i = 0; i < 5; i++){
            if (cbxHolds[i].isSelected()){
                cbxHolds[i].setDisable(true);
            }
        }
    }

    // ---------------------------------------------------------------------

    public void btnRollOnAction (){
        if (dice.getThrowCount() < 3 ) {
            if (dice.getThrowCount() >= 0) {
                boolean[] holdStatus = new boolean[5];
                for (int i = 0; i < 5; i++) {
                    holdStatus[i] = cbxHolds[i].isSelected();
                    if (dice.getThrowCount() == 0){
                        cbxHolds[i].setDisable(false);
                        } else if (dice.getThrowCount() == 2){
                            cbxHolds[i].setDisable(true);
                    }
                }
                dice.throwDice(holdStatus);
                dice.throwCount++;

                for (int i = 0; i < 5; i++) {
                    txfValues[i].setText("" + dice.getValues()[i]);
                }
                for (int j = 0; j < 17; j++) {
                    if (j == 7) {
                        j++;
                    } else {
                        showResults();
                    }
                }
            }
        }
        if (dice.getThrowCount() == 3){
                showResults();
        }
    }

    // ---------------------------------------------------------------------

    private void mouseClicked(MouseEvent event) {
        TextField txf = (TextField) event.getSource();
        if(txfSumSame.getText().isEmpty())txfSumSame.setText("0");
        if(txfSumOther.getText().isEmpty())txfSumOther.setText("0");
        if(txfBonus.getText().isEmpty())txfBonus.setText("0");
        if(txfTotal.getText().isEmpty())txfTotal.setText("0");

        if(dice.getThrowCount() != 0){
        for (int i = 0; i < 17; i++){
            if (txf == txfResults[i]) {
                txf.setStyle("-fx-background-color: yellow");
                txfResults[i].setDisable(true);
                }
                dice.resetThrowCount();

                for (int j = 0; j < 5; j++){
                    if (dice.throwCount == 0) {
                        cbxHolds[j].setDisable(true);
                        cbxHolds[j].setSelected(false);
                        txfValues[j].clear();
                    }
                }
            }
            showSumSame();
            showBonus();
            showSumOther();
            total();
        }
    }
}
