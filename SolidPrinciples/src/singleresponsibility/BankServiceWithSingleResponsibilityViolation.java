package singleresponsibility;

/**
 * 1 Class Doing multiple things
 */
public class BankServiceWithSingleResponsibilityViolation {

	/*
	 * In future loans can be added like gold loan
	 */
	public void getLoanInterestInfo(String loanType) {
		if (loanType.equals("homeLoan")) {
			// do some job
		}
		if (loanType.equals("personalLoan")) {
			// do some job
		}
		if (loanType.equals("car")) {
			// do some job
		}
	}

	/*
	 * send OTP as SMS , Whatsapp
	 */
	public void sendOTP(String medium) {
		if (medium.equals("email")) {
			// write email related logic
			// use JavaMailSenderAPI
		}
		if (medium.equals("mobile")) {
			// write logic using twillio API
		}
	}

	public void printPassbook() {
		// update transaction info in passbook
	}

	public long deposit(long amount, String accountNo) {
		// deposit amount
		return 0;
	}

	public long withDraw(long amount, String accountNo) {
		// withdraw amount
		return 0;
	}
}
