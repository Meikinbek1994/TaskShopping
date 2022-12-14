import Classes.Buyer;
import Classes.Market;
import Classes.Product;
import Enums.ProductTypes;
import Service.CashPayment;
import Service.ShoppingCart;
import Service.TapCardPayment;

public class Main {
    public static void main(String[] args) {

        Market market=new Market("Globus");
        market.addProduct(new Product(ProductTypes.APPLE,15,0));
        market.addProduct(new Product(ProductTypes.AVOKADO,80,43));
        market.addProduct(new Product(ProductTypes.BANANA, 30, 5));
        market.addProduct(new Product(ProductTypes.BREAD, 37, 0));


        Buyer buyer=new Buyer("Meikinbek",400);
        CashPayment cashPayment=new CashPayment(buyer);
        TapCardPayment tapCardPayment=new TapCardPayment();
        ShoppingCart shoppingCart=new ShoppingCart(market,buyer);
        shoppingCart.addProducts(market.getProducts().get(0));
        shoppingCart.addProducts(market.getProducts().get(1));
        shoppingCart.addProducts(market.getProducts().get(2));
        shoppingCart.addProducts(market.getProducts().get(3));
        shoppingCart.pay(cashPayment);
        System.out.println(market.getName()+" cash box amount is:"+"  "+market.getCashBox());
        System.out.println("The budget of Meikinbek is:"+"  "+buyer.getBudget());

    }
}