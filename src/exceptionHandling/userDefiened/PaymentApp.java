package exceptionHandling.userDefiened;

import java.util.Scanner;

public class PaymentApp {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the payment amount");
		double payment = in.nextInt();
		try {
			if (payment < 0) {

				throw new NegativePaymentExceptionHandler(payment);

			} else
				System.out.println("PAYMENT SUCCESSFUL");
		} catch (NegativePaymentExceptionHandler e) {
			System.out.println(e.toString());
		}
		
	}

}
