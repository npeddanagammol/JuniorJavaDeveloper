package overloading.constructor.staticKey.finalKey;

public class BankAccountApp {
	// Creating new bank account >> think instantiate an object

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();
		BankAccount bankAccount1 = new BankAccount("CHECKING ACCOUNT");
		BankAccount bankAccount2 = new BankAccount("CHECKING ACCOUNT", 18000);

		bankAccount2.checkBalance();

		bankAccount1.name = "Narendra";
		bankAccount1.accountType = "Saving Account";
		bankAccount1.accountNumber = "34891204";
		bankAccount1.balance = 231030;
		bankAccount1.ssn = "12383N23";

		System.out.println("----------------------\n"+bankAccount1.toString());
		
		System.out.println("------------\n");
		bankAccount2.deposit(1200);
		bankAccount2.deposit(100);
		bankAccount2.deposit(3000);
		bankAccount2.deposit(4300);
		
		System.out.println();
		bankAccount2.withdraw(300);
		
		System.out.println("------------------");
		bankAccount.setName("Narendra reddy Peddanagammol");
		System.out.println(bankAccount.getName());
		
		bankAccount.setSsn("142345d56N");
		System.out.println(bankAccount.getSsn());
		
		
		
	}

}
