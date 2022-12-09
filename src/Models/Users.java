package Models;

import java.util.ArrayList;

public class Users {
    String User_name;
    int User_age;
    int User_id;
    String User_address;
    String User_status;
    ArrayList<Orders> Orders;

    public String getUser_name() {
        return User_name;
    }

    public void setUser_name(String user_name) {
        User_name = user_name;
    }

    public int getUser_age() {
        return User_age;
    }

    public void setUser_age(int user_age) {
        User_age = user_age;
    }

    public int getUser_id() {
        return User_id;
    }

    public void setUser_id(int user_id) {
        User_id = user_id;
    }

    public String getUser_address() {
        return User_address;
    }

    public void setUser_address(String user_address) {
        User_address = user_address;
    }

    public String getUser_status() {
        return User_status;
    }

    public void setUser_status(String user_status) {
        User_status = user_status;
    }

    public ArrayList<Models.Orders> getOrders() {
        return Orders;
    }

    public void setOrders(ArrayList<Models.Orders> orders) {
        Orders = orders;
    }

    public Users(String user_name, int user_age, int user_id, String user_address, String user_status, ArrayList<Models.Orders> orders) {
        User_name = user_name;
        User_age = user_age;
        User_id = user_id;
        User_address = user_address;
        User_status = user_status;
        Orders = orders;
    }
}
