package semesterprøve2021.gui;

import semesterprøve2021.gui.Gui;

import static semesterprøve2021.controller.Controller.initStorage;

public class App {
    public static void main(String[] args) {
        initStorage();
        Gui.launch(Gui.class);
    }
}
