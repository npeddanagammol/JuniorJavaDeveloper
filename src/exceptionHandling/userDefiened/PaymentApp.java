package exceptionHandling.userDefiened;

import java.util.Scanner;

public class PaymentApp {

	static boolean positivePayment = true;

	public static void main(String[] args) throws NegativePaymentExceptionHandler {

		Scanner in = new Scanner(System.in);
		int count;

		do {

			System.out.print("Enter the payment amount : ");
			double payment = in.nextInt();

			try {
				if (payment < 0) {
					throw new NegativePaymentExceptionHandler(payment);
				}

				else {
					System.out.println("PAYMENT SUCCESSFUL. THANK YOU");
					positivePayment = true;
				}

			} catch (NegativePaymentExceptionHandler e) {
				System.out.println(e.toString());
				System.out.println("PLEASE TRY AGAIN!!!");
				positivePayment = false;

			}

		} while (!positivePayment);

	}
}
