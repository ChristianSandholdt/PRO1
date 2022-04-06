package YatzyStudent.gui;

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
import YatzyStudent.model.YatzyDice;

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

    private final Label lblRolled = new Label();
    private final Button btnRoll = new Button("Throw");

    private void initContent(GridPane pane) {
        // pane.setGridLinesVisible(true);
        pane.setPadding(new Insets(10));
        pane.setHgap(10);
        pane.setVgap(10);

        // ---------------------------------------------------------------------

        GridPane dicePane = new GridPane();
        pane.add(dicePane, 0, 0);
        // dicePane.setGridLinesVisible(true);
        dicePane.setPadding(new Insets(10));
        dicePane.setHgap(10);
        dicePane.setVgap(10);
        dicePane.setStyle("-fx-border-color: black");

        // add txfValues, chbHolds, lblRolled and btnRoll
        // TODO
        for (int i = 0; i < 5; i++) {
            txfValues[i] = new TextField();
            cbxHolds[i] = new CheckBox("Hold");
            cbxHolds[i].setOnAction(actionEvent -> lock());
            dicePane.add(txfValues[i], i, 0);
            dicePane.add(cbxHolds[i], i, 1);
            txfValues[i].setPrefHeight(100);
            txfValues[i].setPrefWidth(100);
            txfValues[i].setFont(Font.font(50));
            txfValues[i].setEditable(false);
        }
        dicePane.add(btnRoll, 2, 2);
        btnRoll.setPrefWidth(100);
        btnRoll.setPrefHeight(40);
        btnRoll.requestFocus();
        btnRoll.setOnAction(actionEvent -> btnRollAction());


        // ---------------------------------------------------------------------

        GridPane scorePane = new GridPane();
        pane.add(scorePane, 0, 1);
        // scorePane.setGridLinesVisible(true);
        scorePane.setPadding(new Insets(10));
        scorePane.setVgap(5);
        scorePane.setHgap(10);
        scorePane.setStyle("-fx-border-color: black");
        int w = 50; // width of the text fields
        String[] lblNames = {
                "1-s", "2-s", "3-s", "4-s", "5-s", "6-s", "", "", "One Pair", "Two Pairs",
                "Three-same", "Four-same", "Full House", "Small Str.", "Large Str.", "Chance", "Yatzy"
        };

        // add labels for results, add txfResults,
        // add labels and text fields for sums, bonus and total.
        // TODO
        for (int i = 0; i < 17; i++) {
            txfResults[i] = new TextField();
            if (i == 6) {
                i++;
            } else {
                scorePane.add(txfResults[i], 1, i);
                txfResults[i].setPrefWidth(w);
                scorePane.add(new Label(lblNames[i]), 0, i);
                txfResults[i].setEditable(false);
                txfResults[i].setOnMouseClicked(this::mouseClicked);
            }
        }


        // Labels and TexfField for sum(s);
        Label lblSumSame = new Label("Sum:");
        Label lblBonus = new Label("Bonus:");
        scorePane.add(lblSumSame, 2, 5);
        scorePane.add(txfSumSame, 3, 5);
        txfSumSame.setMaxWidth(w);
        txfSumSame.setEditable(false);

        // Label and TextField for bonus;
        scorePane.add(lblBonus, 2, 6);
        scorePane.add(txfBonus, 3, 6);
        txfBonus.setMaxWidth(w);
        txfBonus.setEditable(false);

        // Label and TextField for sum-other;
        Label lblSumOther = new Label("Sum:");
        scorePane.add(lblSumOther, 2, 14);
        scorePane.add(txfSumOther, 3, 14);
        txfSumOther.setMaxWidth(w);
        txfSumOther.setEditable(false);

        // Label and Textfield for Total;
        Label lblTotal = new Label("Total:");
        scorePane.add(lblTotal, 2, 16);
        scorePane.add(txfTotal, 3, 16);
        txfTotal.setMaxWidth(w);
        txfTotal.setEditable(false);
    }

    private void lock() {
        for (int i = 0; i < 5; i++) {
            if (cbxHolds[i].isSelected()) {
                cbxHolds[i].setDisable(true);
            }
        }
    }
    // -------------------------------------------------------------------------

    // Create an action method for btnRoll's action.
    // Hint: Create small helper methods to be used in the action method.
    // TODO
    private void btnRollAction() {
        if (dice.getThrowCount() < 3) {
            if (dice.getThrowCount() >= 0) {
                boolean[] holdStatus = new boolean[5];
                for (int i = 0; i < 5; i++) {
                    holdStatus[i] = cbxHolds[i].isDisable();
                }
                dice.throwDice(holdStatus);
                dice.throwCount++;
                for (int i = 0; i < 5; i++) {
                    txfValues[i].setText("" + dice.getValues()[i]);
                    showSameSum();
                }
                for (int j = 0; j < 17; j++) {
                    if (j == 7) {
                        j++;
                    }
                    showResult();
                    showBonus();
                    showSameSum();
//                    showTotal();
                    showSumOther();
                }
            }

        }
        if (dice.getThrowCount() == 3) {
            showResult();
        }
    }

    // -------------------------------------------------------------------------

    // Create a method for mouse click on one of the text fields in txfResults.
    // Hint: Create small helper methods to be used in the mouse click method.
    // TODO
    private void mouseClicked(MouseEvent event) {
        TextField txf = (TextField) event.getSource();
        for (int i = 0; i < 17; i++) {
            if (txf == txfResults[i]) {
                txf.setStyle("-fx-background-color: green");
                txfResults[i].setDisable(true);
                dice.resetThrowCount();
            }
            for (int j = 0; j < 5; j++) {
                if (dice.throwCount == 0) {
                    cbxHolds[j].setDisable(false);
                    cbxHolds[j].setSelected(false);
                    txfValues[j].clear();
                }
            }
        }
    }

    private void showResult() {
        for (int i = 0; i < 17; i++) {
            if (i == 6) {
                i++;
            } else {
                if (!txfResults[i].isDisabled()) {
                    txfResults[i].setText("" + dice.getResults()[i]);
                }
            }
        }
    }

    private void showSameSum() {
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            if (txfResults[i].isDisabled()) {
                sum += Integer.parseInt(txfResults[i].getText());
            }
        }
        txfSumSame.setText("" + sum);
    }


    private void showSumOther(){
        int sum = 0;
        for (int i = 8; i < 17; i++) {
            if(txfResults[i].isDisabled()) {
                sum += Integer.parseInt(txfResults[i].getText());
            }
        }
        txfSumOther.setText("" + sum);
    }

   // private void showTotal(){
     //   txfTotal.setText("" + Integer.parseInt(txfSumSame.getText()) + Integer.parseInt(txfSumOther.getText()) + Integer.parseInt(txfBonus.getText()));
   // }

    private void showBonus(){
        if (Integer.parseInt(txfSumSame.getText()) >= 63){
            txfBonus.setText("" + 50);
        }
    }



    }
