package interfacesegregation;

public class Phonepe implements UPIPayments {
    public void payMoney() {

    }

    public void getScratchCard() {

    }

    /**
     * Forcing to implement not required method
     */
	@Override
	public void getCashBackAsCreditBalance() {
		// TODO Auto-generated method stub
		
	}


}
