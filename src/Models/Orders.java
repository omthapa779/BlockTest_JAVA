package Models;

import java.util.ArrayList;

public class Orders {
    int Order_id;
    int order_amount;
    int order_date;
    String Order_type;
    String Order_status;
    ArrayList<Items> Items;

    public int getOrder_id() {
        return Order_id;
    }

    public void setOrder_id(int order_id) {
        Order_id = order_id;
    }

    public int getOrder_amount() {
        return order_amount;
    }

    public void setOrder_amount(int order_amount) {
        this.order_amount = order_amount;
    }

    public int getOrder_date() {
        return order_date;
    }

    public void setOrder_date(int order_date) {
        this.order_date = order_date;
    }

    public String getOrder_type() {
        return Order_type;
    }

    public void setOrder_type(String order_type) {
        Order_type = order_type;
    }

    public String getOrder_status() {
        return Order_status;
    }

    public void setOrder_status(String order_status) {
        Order_status = order_status;
    }

    public ArrayList<Models.Items> getItems() {
        return Items;
    }

    public void setItems(ArrayList<Models.Items> items) {
        Items = items;
    }

    public Orders(int order_id, int order_amount, int order_date, String order_type, String order_status, ArrayList<Models.Items> items) {
        Order_id = order_id;
        this.order_amount = order_amount;
        this.order_date = order_date;
        Order_type = order_type;
        Order_status = order_status;
        Items = items;
    }
}

