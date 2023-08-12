package dependencyinversionprinciple;

/**
 * High level class should not be depend on low level but both should depend 
 * on abstraction
 * Cashier should not be bother about which bank card buyer holds he/she just swipes it.
 */
public class ShoppingMall {

	//Can be any card of bank
    private BankCard bankCard;

    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void doPurchaseSomething(long amount){
        bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {
       // DebitCard debitCard=new DebitCard();
       // CreditCard creditCard=new CreditCard();

        BankCard bankCard=new CreditCard();
        ShoppingMall shoppingMall=new ShoppingMall(bankCard);
        shoppingMall.doPurchaseSomething(5000);
    }
}
