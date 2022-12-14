package Service;

public class TapCardPayment implements Payable{
    @Override
    public void pay(double amount) {
        System.out.println("Total amount of tap card payment is: "+amount);
    }
}
