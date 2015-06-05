package controller;

import database.Client;
import database.Database;
import gui.FormEvent;

public class Controller {

    private Database database = new Database();
    private Client client;

    public void loadFromFile() {
        database.loadFromFile();
    }

    public Client getClient() {
        return database.getClient();
    }

    public void setClient(FormEvent event) {
        client = new Client(event.getName(), event.getLastName(), event.getPhone(),
                event.getPassword());

        database.setClient(client);
    }

}
