package ss11.view;

import ss11.controller.PersonController;

public class Main {
    public static void main(String[] args) {
        PersonController personController = new PersonController();
        personController.displayMenu();
    }
}
