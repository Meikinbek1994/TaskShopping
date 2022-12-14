package Service;

import Classes.Buyer;
import Classes.Product;

import java.util.ArrayList;

public class CashPayment implements Payable{
    private Buyer buyer;
    public CashPayment(Buyer buyer) {
        this.buyer=buyer;
    }

    @Override
    public void pay(double amount) {
        if(buyer.getBudget()<amount){
            System.out.println("Payment can not proceed.");
            return;
        }
        buyer.setBudget(amount);
        System.out.println("Total amount of cash payment with discount is: "+amount);
    }
}
