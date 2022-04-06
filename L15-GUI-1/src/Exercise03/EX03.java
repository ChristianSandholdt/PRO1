package Exercise03;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import static java.lang.Math.*;

public class EX03 extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle("Investment calculator");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }


    private final TextField investmentTF = new TextField();
    private final TextField yearsTF = new TextField();
    private final TextField investmentPercentage = new TextField();
    private final TextField futureValueTF = new TextField();


    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(false);

        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        Label invLabel = new Label("Investment");
        pane.add(invLabel,0,0);

        Label yearsLabel = new Label("Years");
        pane.add(yearsLabel,0,1);

        Label interestLabel = new Label("Investment %");
        pane.add(interestLabel,0,2);

        Label calculatedInvestment = new Label("Future Value: ");
        pane.add(calculatedInvestment,0,4);

        pane.add(investmentTF,1,0);
        pane.add(yearsTF,1,1);
        pane.add(investmentPercentage,1,2);
        pane.add(futureValueTF,1,4);

        Button calcInvestment = new Button("Calculate");
        pane.add(calcInvestment,1,3);


        calcInvestment.setOnAction(event -> this.totalInvestment());
    }
    public void totalInvestment(){
        double Investment = Double.parseDouble(investmentTF.getText());
        double investPercentage = Double.parseDouble(investmentPercentage.getText()) / 100;
        int numberOfYears = Integer.parseInt(yearsTF.getText());

        double total = Investment * pow((1+investPercentage),numberOfYears);
        futureValueTF.setText(Double.toString(total));
    }



}
