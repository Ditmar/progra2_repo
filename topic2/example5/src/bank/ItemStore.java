package bank;

import java.util.Date;

public class ItemStore {
    private Double quantity;
    // todo: modify the type using enum
    // add, subtract
    private String type;
    private Date currentDate;
    public ItemStore(Double quantity, String type) {
        this.quantity = quantity;
        this.type = type;
        this.currentDate = new Date();
    }
    public Double getQuantity() {
        return quantity;
    }
    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Date getCurrentDate() {
        return currentDate;
    }
    public String getSymbol() {
        return this.type.equals("add") ? "+" : "-";
    }
    public String getFormatDate() {
        return this.currentDate.getDate() + "/" + this.currentDate.getMonth() + "/" + this.currentDate.getYear() +  " " + this.currentDate.getHours() + ":" + this.currentDate.getMinutes() + ":" + this.currentDate.getSeconds();
    }
    public void print() {
        System.out.println(
        this.getSymbol() + 
        " " + this.quantity + 
        " " + this.getFormatDate());
    }
}
