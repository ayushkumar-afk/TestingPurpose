package ProblematicCode;

public abstract class CreditCard {
    private String ccno;
    private String CardHolderName;
    private String ValueofCard;

    public void setccno (String ccno){
        this.ccno = ccno;
    }
    public void setCardHolderName (String CardHolderName){
        this.CardHolderName = CardHolderName;
    }
    public void setValueofCard (String ValueofCard){
        this.ValueofCard = ValueofCard;
    }

    public abstract void tapandpay();

    public abstract void onlineTransfer();

    public abstract void swipeandpay();

    public void displayCardDetails(){
        System.out.println("Card Holder:-"+this.CardHolderName);
        System.out.println("ValueOfCard:-"+this.ValueofCard);
        System.out.println("CcNo:-"+this.ccno);
    }


}
