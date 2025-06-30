package LSP;

public abstract class CreditCard {
    private String ccno;
    private String CardHolderName;
    private String ValueofCard;


    public abstract void swipeandpay();

    public abstract void tapandpay();

    public abstract void onlineTransfer();



    public void displayCardDetails(){
        System.out.println("Card Holder:-"+this.CardHolderName);
        System.out.println("ValueOfCard:-"+this.ValueofCard);
        System.out.println("CcNo:-"+this.ccno);
    }


}
