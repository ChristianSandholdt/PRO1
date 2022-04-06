package Exercise06;

import javafx.scene.control.CheckBox;
import guidemoes.guidemo_1.App;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class EX06 extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle("Gui Demo 1");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }
    private final TextArea txaStudentInfo = new TextArea();
    private final TextField txfStudentName = new TextField();
    private final TextField txfStudentAge = new TextField();
    private final CheckBox checkBox = new CheckBox();
    private final TextField txfcbx = new TextField();
    private Student student = null;


    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(false);

        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        Label lblStudentInfo = new Label("Student info");
        pane.add(lblStudentInfo,0,0);

        Label lblName = new Label("Name");
        pane.add(lblName,0,2);

        Label lblAge = new Label("Age");
        pane.add(lblAge,0,3);

        Label lblActive = new Label("Active:");
        pane.add(lblActive,0,4);


        pane.add(checkBox,1,4);

        Button btnIncrease = new Button("Inc");
        pane.add(btnIncrease,2,3);

        Button btnReset = new Button("Reset");
        pane.add(btnReset,3,3);

        Button btnCreate = new Button("Create");
        pane.add(btnCreate,1,5);

        Button btnUpdate = new Button("Update");
        pane.add(btnUpdate,2,5);

        Button btnDelete = new Button("Delete");
        pane.add(btnDelete,3,5);


        pane.add(txaStudentInfo,0,1,4,1);
        pane.add(txfStudentName,1,2);
        pane.add(txfStudentAge,1,3);

        txfStudentName.setPrefWidth(15);
        txaStudentInfo.setEditable(false);

        btnIncrease.setOnAction(event-> increaseAge());

        checkBox.setOnAction(event->checkBoxAction());
    }
    public void increaseAge(){
        int increase = Integer.parseInt(txfStudentAge.getText())+1;
        txfStudentAge.setText(Integer.toString(increase));
        //student.setAge(txfStudentAge);
    }
    public void checkBoxAction(){
        if (checkBox.isSelected())
            txfcbx.setText("Active: Yes");
        else
            txfcbx.setText("Active: No");
    }
    public void createStudentAction(){
        String name = txfStudentName.getText();
        int age = Integer.parseInt(txfStudentAge.getText());
        boolean active = checkBox.isSelected();

        student = new Student(name, age, active);
    }

}
