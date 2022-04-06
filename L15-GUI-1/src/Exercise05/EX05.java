package Exercise05;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import org.w3c.dom.Text;

public class EX05 extends Application{
    @Override
    public void start(Stage stage) {
        stage.setTitle("Gui Demo 1");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    private final TextField txName = new TextField();
    private final TextArea txListOfNames = new TextArea();

    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(false);

        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        Label lblName = new Label("Name:");
        pane.add(lblName,0,0);

        pane.add(txName,0,1);

        Button btnAdd = new Button("Add");
        pane.add(btnAdd,0,2);

        pane.add(txListOfNames,0,3);
        txListOfNames.setPrefRowCount(10);
        txListOfNames.setPrefWidth(150);
        txListOfNames.setEditable(false);

        btnAdd.setOnAction(event -> addName());
    }
    public void addName(){
        String name = txName.getText();
        txListOfNames.appendText(name + "\n");
    }


}

