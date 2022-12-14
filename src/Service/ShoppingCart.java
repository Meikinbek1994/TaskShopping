package Service;

import Classes.Buyer;
import Classes.Market;
import Classes.Product;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Product>products;
    private Market market;
    private Buyer buyer;
    
    public ShoppingCart(Market market, Buyer buyer){
        products=new ArrayList<>();
        this.market=market;
        this.buyer=buyer;
    }
    public void addProducts(Product product){
        products.add(product);
    }
    public void removeProducts(Product product){
        products.remove(product);
    }
    public double calculateTotal(){
        double total=0;
        for (Product p:products
             ) {
            total+=p.getPriceWithDiscount();
        }
        return total;
    }

    public void pay(Payable payment){
        market.setCashBox(calculateTotal());
        getReceipt();
        payment.pay(calculateTotal());
    }
    public void getReceipt(){
        System.out.println("Market name: "+market.getName());
        System.out.println("List of products:");
        for (Product p:products
        ) {
            System.out.println(p.getProductTypes()+"  "+p.getPrice());
        }
    }
    
}
