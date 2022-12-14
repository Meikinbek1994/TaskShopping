package Classes;

import java.util.ArrayList;

public class Market {
    private String name;
    private double cashBox;
    private ArrayList<Product>products;

    //Constructor
    public Market(String name){
        this.name=name;
        cashBox=0;
        products=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCashBox() {
        return cashBox;
    }

    public void setCashBox(double cashBox) {
        this.cashBox += cashBox;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void addProduct(Product newProduct){
        products.add(newProduct);
    }

}
