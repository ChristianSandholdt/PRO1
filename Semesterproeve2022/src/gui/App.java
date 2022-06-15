package gui;

import javafx.application.Application;

import static controller.Controller.initStorage;

public class App {
    public static void main(String[] args) {
        initStorage();

        Application.launch(GUI.class);
    }
}
