package interfacesegregation;


/**
 * Do not force the clients to implement those interface which they don't need it.
 * The ISP governs relationships between parent and client classes 
 * (i.e. producer/consumer relationships).
 *  It tells you when to implement an API.
 */
public interface UPIPayments {

    public void payMoney();

    public void getScratchCard();

    public void getCashBackAsCreditBalance();
}
