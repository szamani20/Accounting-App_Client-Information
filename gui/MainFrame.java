package gui;

import controller.Controller;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private FormPanel formPanel;
    private TablePanel tablePanel;
    private Controller controller;

    public MainFrame() {
        super("Darpa");

        setLayout(new BorderLayout());

        formPanel = new FormPanel();
        tablePanel = new TablePanel();
        controller = new Controller();

        add(formPanel, BorderLayout.CENTER);

        formPanel.setFormListener(event -> {
            controller.setClient(event);
            controller.loadFromFile();
            tablePanel.setData(controller.getClient());
            tablePanel.refresh();
        });

        add(formPanel, BorderLayout.WEST);
        add(tablePanel, BorderLayout.CENTER);

        setSize(1300, 400);
        setMinimumSize(new Dimension(1300, 400));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
