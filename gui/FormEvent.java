package gui;

import java.util.EventObject;
import java.util.List;

public class FormEvent extends EventObject {

    private String name;
    private String lastName;
    private String phone;
    private String password;
    private List<Products> product;
    private List<Integer> price;
    private List<Integer> amount;
    private List<Integer> total;
    private List<Integer> payment;
    private List<Integer> debt;
    private Boolean noDebt;
    private List<String> year;
    private List<String> month;
    private List<String> day;

    public FormEvent(Object source) {
        super(source);
    }

    public FormEvent(Object source, String name, String lastName,
                     String phone, String password) {
        super(source);
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public List<Products> getProduct() {
        return product;
    }

    public List<Integer> getPrice() {
        return price;
    }

    public List<Integer> getAmount() {
        return amount;
    }

    public List<Integer> getTotal() {
        return total;
    }

    public List<Integer> getPayment() {
        return payment;
    }

    public List<Integer> getDebt() {
        return debt;
    }

    public Boolean getNoDebt() {
        return noDebt;
    }

    public List<String> getYear() {
        return year;
    }

    public List<String> getMonth() {
        return month;
    }

    public List<String> getDay() {
        return day;
    }
}
