package ProblematicCode;

public class VisaCard extends CreditCard implements UpiRelatedCreditCard,InternationalCreaditCard{


    @Override
    public void onlineTransfer() {
        System.out.println("Payed Though onlineVisa ");
    }


    @Override
    public void swipeandpay() {
        System.out.println("Payed Though swipeandpayVisa ");
    }

    @Override
    public void tapandpay() {
        System.out.println("Payed Though TAPANDPAYVisa ");
    }

    @Override
    public void upipayment() {
        System.out.println("Payment Though the Upi");
    }

    @Override
    public void internationPayment() {
        System.out.println("Payment though the Internation System");
    }
}
