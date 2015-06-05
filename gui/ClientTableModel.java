package gui;

import database.Client;
import javax.swing.table.AbstractTableModel;

public class ClientTableModel extends AbstractTableModel {

    private Client client;
    private Client clientRow;
    private String colNames[] = {"Product", "Price", "Amount", "Total", "Payment",
    "Debt", "Paid", "Year", "Month", "Day"};

    public ClientTableModel() {

    }

    @Override
    public String getColumnName(int column) {
        return colNames[column];
    }

    public void setData(Client client) {
        this.client = client;

        clientRow = new Client(client.getName(), client.getLastName(),
                client.getPhone(), client.getPassword());

    }

    @Override
    public int getRowCount() {
        if(client != null)
            return client.getProduct().size();
        return 0;
    }

    @Override
    public int getColumnCount() {
        return 10;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        clientRow.setProductI(client.getProduct().get(rowIndex));
        clientRow.setPriceI(client.getPrice().get(rowIndex));
        clientRow.setAmountI(client.getAmount().get(rowIndex));
        clientRow.setTotalI(client.getTotal().get(rowIndex));
        clientRow.setPaymentI(client.getPayment().get(rowIndex));
        clientRow.setDebtI(client.getDebt().get(rowIndex));
        clientRow.setNoDebtI(client.getNoDebt().get(rowIndex));
        clientRow.setYearI(client.getYear().get(rowIndex));
        clientRow.setMonthI(client.getMonth().get(rowIndex));
        clientRow.setDayI(client.getDay().get(rowIndex));

        switch (columnIndex) {
            case 0:
                return clientRow.getProductI();
            case 1:
                return clientRow.getPriceI();
            case 2:
                return clientRow.getAmountI();
            case 3:
                return clientRow.getTotalI();
            case 4:
                return clientRow.getPaymentI();
            case 5:
                return clientRow.getDebtI();
            case 6:
                return clientRow.getNoDebtI();
            case 7:
                return clientRow.getYearI();
            case 8:
                return clientRow.getMonthI();
            case 9:
                return clientRow.getDayI();
        }

        return null;
    }
}
