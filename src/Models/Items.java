package Models;

public class Items {
    String Item_Name;
    int code;
    String Brand;
    int price;
    String Description;

    public String getItem_Name() {
        return Item_Name;
    }

    public void setItem_Name(String item_Name) {
        Item_Name = item_Name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Items(String item_Name, int code, String brand, int price, String description) {
        Item_Name = item_Name;
        this.code = code;
        Brand = brand;
        this.price = price;
        Description = description;
    }
}
