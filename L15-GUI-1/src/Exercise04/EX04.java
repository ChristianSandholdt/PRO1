package Exercise04;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class EX04 extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Gui Demo 1");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    private final TextField tfCelsius = new TextField();
    private final TextField tfFahrenheit = new TextField();



    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(false);

        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        Label lblCelsius = new Label("Celsius");
        pane.add(lblCelsius,0,0);

        Label lblFahrenheit = new Label("Fahrenheit");
        pane.add(lblFahrenheit,0,1);

        pane.add(tfCelsius,1,0);
        pane.add(tfFahrenheit,1,1);
        tfCelsius.setPrefWidth(60);
        tfFahrenheit.setPrefWidth(60);

        Button calculate = new Button("Convert temperature");
        pane.add(calculate,0,2);


        calculate.setOnAction(event -> calculateTemp());
    }
    public void calculateTemp(){
        if (tfCelsius.getText().isEmpty()){
            double celsiusTemp = ((Double.parseDouble(tfFahrenheit.getText())-32) *0.5556);
            tfCelsius.setText(Double.toString(celsiusTemp));
        }else if (tfFahrenheit.getText().isEmpty()){
            double fahhrenheitTemp = ((Double.parseDouble(tfCelsius.getText())*1.8) +32);
            tfFahrenheit.setText(Double.toString(fahhrenheitTemp));
        }
    }



}


