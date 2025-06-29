package ProblematicCode;

public class VisaCard implements OnlineTransfer,SwipeandPay{


    @Override
    public void onlineTransfer() {
        System.out.println("Payed Though online ");
    }


    @Override
    public void swipeandPay() {
        System.out.println("Payed Though swipeandpay ");
    }
}
