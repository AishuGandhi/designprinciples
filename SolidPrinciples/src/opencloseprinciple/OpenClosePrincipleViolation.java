package opencloseprinciple;

/**
 * 
 * According to new requirements the module should be open for extensibility but
 * closed for modification
 * In future send OTP using Whatsapp then we must be able to extend this class and implements required 
 * logic instead of modifying this class itself
 */
public class OpenClosePrincipleViolation {
	public void sendOTP(String medium) {
		if (medium.equals("email")) {
			// write email related logic
			// use JavaMailSenderAPI
		}
		if (medium.equals("mobile")) {
			// write logic using twillio API
		}
	}
}
