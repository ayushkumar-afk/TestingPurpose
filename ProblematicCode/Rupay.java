package ProblematicCode;

public class Rupay extends CreditCard{
    @Override
    public void tapandpay() {
        System.out.println("Payed Though tap ");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Payed Though online ");
    }

    @Override
    public void swipeandpay() {
        System.out.println("Payed Though Swipe ");
    }
}
