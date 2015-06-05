package gui;

import database.Client;

import javax.swing.*;
import java.awt.*;

public class TablePanel extends JPanel {

    private JTable table;
    private ClientTableModel tableModel;

    public TablePanel() {

        Dimension dimension = new Dimension(900, 400);
        setSize(dimension);

        tableModel = new ClientTableModel();
        table = new JTable(tableModel);

        setLayout(new BorderLayout());
        
        add(new JScrollPane(table), BorderLayout.CENTER);
    }

    public void refresh() {
        tableModel.fireTableDataChanged();
    }

    public void setData(Client client) {
        tableModel.setData(client);
    }
}
