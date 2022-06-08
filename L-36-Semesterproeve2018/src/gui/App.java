package gui;

import storage.Storage;

import static service.Service.holdUdenTutorer;
import static service.Service.initStorage;

public class App {
    public static void main(String[] args) {
        initStorage();

        holdUdenTutorer(Storage.getTeams());
        System.out.println(holdUdenTutorer(Storage.getTeams()));
    }
}
