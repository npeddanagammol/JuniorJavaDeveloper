package exceptionHandling.userDefiened;

public class NegativePaymentExceptionHandler extends Exception{
	
	double payment;
	
	public NegativePaymentExceptionHandler(double amount) {
		this.payment = amount;
	}

	public String toString() {
		return "ERROR: PAYMENT FAILED. CAN'T TAKE NEGATIVE PAYMENT $"+payment;
	}

}
