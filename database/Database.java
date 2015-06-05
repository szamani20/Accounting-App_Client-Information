package database;

import java.io.*;

public class Database {

    private Client client;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void loadFromFile() {
        String fileName = "database.cli";
        File file = new File(fileName);

        FileInputStream fis;
        ObjectInputStream ois;

        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);

            Client[] clients = (Client[])ois.readObject();

            int index = setIndex(clients);
            client = clients[index];

            ois.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    private int setIndex(Client[] clients) {

        for (int i=0; i<clients.length; ++i) {
            if(clients[i].getName().equals(client.getName())&&
                    clients[i].getLastName().equals(client.getLastName())&&
                    clients[i].getPhone().equals(client.getPhone())&&
                    clients[i].getPassword().equals(client.getPassword()))
                return i;
        }

        return 0;
    }
}
