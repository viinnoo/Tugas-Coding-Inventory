package Inventory; 

public class Product {
    protected int number;
    protected String name;
    protected int quantity;
    protected double price;

    public Product(){
        number = 0;
        name = "";
        quantity = 0;
        price = 0;

    }

    public Product(int number, String name, int quantity, double price) {
        this.number = number;
        this.name = name;
        this.quantity  = quantity;
        this.price = price;
    }
}