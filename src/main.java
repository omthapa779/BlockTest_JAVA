import Models.Items;
import Models.Users;
import Models.Orders;
import java.util.ArrayList;


public class main {
    public static void main(String[] args){
        Items i1 = new Items("SideBag",121,"Louis Vuitton",25000,"Great Texture with Great Look");
        Items i2 = new Items("Airforce 1",126,"Nike",100000,"Just Do it");
        Items i3 = new Items("Printed_Tshirts",125,"Options Available",2000,"Printed + customs available");
        Items i4 = new Items("Wrist Watch",221,"Rolex",92000,"Limited Editions");
        Items i5 = new Items("Shades",132,"Gucci",40000,"Great As Always");

        ArrayList Items1 = new ArrayList<Items>();
        ArrayList Items2 = new ArrayList<Items>();
        Items1.add(i1);
        Items1.add(i2);
        Items2.add(i4);
        Items2.add(i5);

        Orders o1 = new Orders(1,2,22/2/22,"Shipping","Processing",Items1);
        Orders o2 = new Orders(2,2,2/1/22,"Takeaway","Delievered",Items2);

        ArrayList Order1 = new ArrayList<Orders>();
        ArrayList Order2 = new ArrayList<Orders>();
        Order1.add(o1);
        Order2.add(o2);

        Users u1 = new Users("Om Thapa",18,2222,"Kathmandu","offline", Order1);
        Users u2 = new Users("Safal Subedi",19,6666,"Bhaktapur","Online", Order2);

        System.out.println("Item Name: " + i1.getItem_Name());
        System.out.println("Code: " + i1.getCode());
        System.out.println("Brand: " + i1.getBrand());
        System.out.println("Price: " + i1.getPrice());



    }
}
